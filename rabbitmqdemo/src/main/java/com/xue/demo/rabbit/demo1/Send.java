package com.xue.demo.rabbit.demo1;



import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.xue.demo.common.MyContans;

public class Send {
	public static void main(String[] args) throws Exception {
		 ConnectionFactory factory = new ConnectionFactory();
		    factory.setHost("localhost");
		    Connection connection = factory.newConnection();
		    Channel channel = connection.createChannel();
		    channel.queueDeclare(MyContans.QUEUE_NAME1, false, false, false, null);
		    
		    String message = "Hello World!";
		    channel.basicPublish("", MyContans.QUEUE_NAME1, null, message.getBytes());
		    System.out.println(" [x] Sent '" + message + "'");
		    
		    channel.close();
		    connection.close();
	}

}
