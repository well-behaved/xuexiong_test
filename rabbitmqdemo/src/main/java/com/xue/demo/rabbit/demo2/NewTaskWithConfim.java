package com.xue.demo.rabbit.demo2;

import com.rabbitmq.client.*;
import com.xue.demo.common.MyContans;

import java.io.IOException;

/**
 * @Author 薛雄
 * @Date 2018/5/11 19:14
 */
public class NewTaskWithConfim {
    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(MyContans.QUEUE_NAME2, true, false, false, null);
        channel.confirmSelect();//开启确认机制
        //发送消息等逻辑
        String message = getMessage(argv);
        channel.basicPublish("", MyContans.QUEUE_NAME2,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes("UTF-8"));
        channel.basicPublish("", MyContans.QUEUE_NAME2,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes("UTF-8"));

        channel.addConfirmListener(new ConfirmListener() {
            public void handleAck(long l, boolean b) throws IOException {
                System.out.println(l+"----是否多个----"+b+"发送成功");
            }

            public void handleNack(long l, boolean b) throws IOException {
                System.out.println(l+"----是否多个----"+b+"发送失败");
            }
        });
        channel.basicPublish("", MyContans.QUEUE_NAME2,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes("UTF-8"));
        Thread.sleep(3000);
        channel.basicPublish("", MyContans.QUEUE_NAME2,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes("UTF-8"));
        System.out.println(" [x] Sent '" + message + "'");
        Thread.sleep(3000);
       /* if(!channel.waitForConfirms()){//如果确认失败
            //重新发送等逻辑
        }*/
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
