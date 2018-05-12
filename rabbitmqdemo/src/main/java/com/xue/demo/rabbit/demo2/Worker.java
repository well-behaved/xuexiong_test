package com.xue.demo.rabbit.demo2;
import com.rabbitmq.client.*;
import com.xue.demo.common.MyContans;

import java.io.IOException;
import java.util.Random;

public class Worker {
  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    final Connection connection = factory.newConnection();
    final Channel channel = connection.createChannel();
    try{
      channel.txSelect();
      channel.txCommit();
    }catch (Exception e){
      channel.txRollback();
    }

    channel.queueDeclare(MyContans.QUEUE_NAME2, true, false, false, null);
    channel.basicQos(1);

    final Consumer consumer = new DefaultConsumer(channel) {
      @Override
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
        String message = new String(body, "UTF-8");

        System.out.println(" [x] Received '" + message + "'");
        try {
          doWork(message);
        } finally {
          System.out.println(" [x] Done");
          channel.basicAck(envelope.getDeliveryTag(), false);
        }
      }
    };
    channel.basicConsume(MyContans.QUEUE_NAME2, false, consumer);
  }
  private static void doWork(String task) {
    try {
//      Thread.sleep(new Random().nextInt(10000));
      Thread.sleep(30000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
   /* for (char ch : task.toCharArray()) {
      if (ch == '.') {
        try {
          Thread.sleep(8000);
        } catch (InterruptedException _ignored) {
          Thread.currentThread().interrupt();
        }
      }
    }*/
  }
}