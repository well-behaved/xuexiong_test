package com.xue.demo.rabbit.demo3;

import com.rabbitmq.client.*;

import java.io.IOException;

public class ReceiveLogs {
	//����������
  private static final String EXCHANGE_NAME = "logs";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();
    //��䲻Ҫò��Ҳ����,��Ϊ�Ѿ�������
    channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
    //����һ��������ƵĶ��У��ö��л�����������Զ�ɾ��
    String queueName = channel.queueDeclare().getQueue();
    //������������а�
    //������������  ��������  �ؼ���
    channel.queueBind(queueName, EXCHANGE_NAME, "");

    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

    Consumer consumer = new DefaultConsumer(channel) {
      @Override
      //������Ϣ
      public void handleDelivery(String consumerTag, Envelope envelope,
                                 AMQP.BasicProperties properties, byte[] body) throws IOException {
        String message = new String(body, "UTF-8");
        System.out.println(" [x] Received '" + message + "'");
      }
    };
    channel.basicConsume(queueName, true, consumer);
  }
}
