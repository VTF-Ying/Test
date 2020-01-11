package com.rebbitmq.test;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer02_publish {
    //队列
    private static final String QUEUE_INFORM_EMAIL = "queue_inform_email";
    private static final String QUEUE_INFORM_SMS = "queue_inform_sms";
    private static final String EXCHANGE_FANOUT_INFORM = "exchange_fanout_inform";

    public static void main(String[] args) {

        //通过连接工厂创建新的连接 生产者何Mq建立连接
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置连接参数
        connectionFactory.setHost("127.0.01"); //mq服务器地址
        connectionFactory.setPort(5672);  //与消费者通信的端口  注意15672是web管理端口  并不是通信端口
        //mq用户和密码
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        //设置虚拟机  一个mq可以设置多个虚拟机  每个虚拟机相当于多个mq
        connectionFactory.setVirtualHost("/");
        //建立新连接
        Connection connection =null;
        Channel channel = null;
        try {
            connection = connectionFactory.newConnection();
            //创建会话通道,生产者和mq服务 所有的通信都在Channel中完成
            channel = connection.createChannel();
            //声明队列 如果对列在mq中没有 则要创建
            //queueDeclare(String queue, boolean durable, boolean exclusive, boolean autoDelete,Map<String, Object> arguments)
            /**queueDeclare的入参明细
             * 1.queue 队列名称
             * 2.durable 是否持久化 如果持久化的话 mq重启后队列还在
             * 3.exclusive 是否排他  独占连接  队列只允许在该链接访问 如果连接关闭后队列自动删除  如果子参数设置为true可用于临时队列的创建
             * 4.autoDelete 自动删除,队列队列不再使用时 是否自动删除队列 如果将此参数和exclusive设置为true时就可以实现临时队列(队列不用自动删除)
             * 5.arguments 队列参数,可以设置一个队列的拓展参数,比如说可以设置存活时间
             */
            channel.queueDeclare(QUEUE_INFORM_EMAIL,true,false,false,null);
            channel.queueDeclare(QUEUE_INFORM_SMS,true,false,false,null);
            /**
             * 声明一个交换机
             * exchangeDeclare(String exchange, String type)
             * 1.exchange 交换机名称
             * 2.type 交换机的类型
             */
            /**
             * 交换机类型选择
             * 1.fanout 对应的rabbitmq的工作模式是 publish/subcribe (发布订阅模式)
             * 2.dircet 对应的Routing的工作模式
             * 3.topic  对应的Topicsa的工作模式
             * 4.headers 对应了headers的工作模式
             */
            channel.exchangeDeclare(EXCHANGE_FANOUT_INFORM, BuiltinExchangeType.FANOUT);
            /**
             * 进行交换机与队列绑定
             * queueBind(String queue, String exchange, String routingKey)
             * 参数明细
             * 1.queue 队列名称
             * 2.exchange 交换机的名称
             * 3.routingKey 路由Key  作用是交换机根据路由Kye的值将消息转发到指定队列中 在发布订阅模式设置为 空字符串
             */
            channel.queueBind(QUEUE_INFORM_EMAIL,EXCHANGE_FANOUT_INFORM,"");
            channel.queueBind(QUEUE_INFORM_SMS,EXCHANGE_FANOUT_INFORM,"");
            //发送消息
            //basicPublish(String exchange, String routingKey, BasicProperties props, byte[] body)
            /**
             * basicPublish的入参明细
             * 1.exchange 交换机,如果不指定,将使用mq的默认交换机 入参为空字符串不是null
             * 2.routingKey 路由Key 交换机根据路由key来讲消息转发到指定的队列 如果使用默认交换机 routingKey设置为队列的名称
             * 3.props 额外的消息属性
             * 4.body,消息内容
             */
            for (int i=0;i<5;i++) {
                String message = "send inform message to user";
                channel.basicPublish(EXCHANGE_FANOUT_INFORM,"", null, message.getBytes());
                System.out.println("send to mq " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            //先关闭通道
            try {
                channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
