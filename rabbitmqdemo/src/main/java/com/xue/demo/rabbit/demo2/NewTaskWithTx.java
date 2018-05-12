package com.xue.demo.rabbit.demo2;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import com.xue.demo.common.MyContans;

/**
 * @Author 薛雄
 * @Date 2018/5/11 18:30
 */
public class NewTaskWithTx {
    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(MyContans.QUEUE_NAME2, true, false, false, null);
            try{
                channel.txSelect();//开启事务机制
                String message = getMessage(argv);
                channel.basicPublish("", MyContans.QUEUE_NAME2,
                        MessageProperties.PERSISTENT_TEXT_PLAIN,
                        message.getBytes("UTF-8"));
                System.out.println(" [x] Sent '" + message + "'");
                Thread.sleep(20000);
                int i =1/0;//异常
                channel.txCommit();//提交
            }catch(Exception e) {
                channel.txRollback();//回滚
            }


        channel.close();
        connection.close();
    }

    private static String getMessage(String[] strings) {
        if (strings.length < 1) {
            return "Hello World!";
        }
        return joinStrings(strings, " ");
    }

    private static String joinStrings(String[] strings, String delimiter) {
        int length = strings.length;
        if (length == 0) {
            return "";
        }
        StringBuilder words = new StringBuilder(strings[0]);
        for (int i = 1; i < length; i++) {
            words.append(delimiter).append(strings[i]);
        }
        return words.toString();
    }
}
