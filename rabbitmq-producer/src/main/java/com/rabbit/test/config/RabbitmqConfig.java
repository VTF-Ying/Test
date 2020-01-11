package com.rabbit.test.config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

       //队列
    public static final String QUEUE_INFORM_EMAIL = "queue_inform_email";
    public static final String QUEUE_INFORM_SMS = "queue_inform_sms";
    public static final String EXCHANGE_TOPCIS_INFORM = "exchange_topics_inform";
    public static final String ROUTINGKEY_EMAIL = "inform.#.email.#";
    public static final String ROUTINGKEY_SMS = "inform.#.sms.#";

    //声明交换机

    @Bean(EXCHANGE_TOPCIS_INFORM)
    public Exchange EXCHANGE_TOPCIS_INFORM(){
        //durable(true) 持久化,mq重启之后交换机还在
        return ExchangeBuilder.topicExchange(EXCHANGE_TOPCIS_INFORM).durable(true).build();
    }

    //声明队EMAIL列
    @Bean(QUEUE_INFORM_EMAIL)
    public Queue QUEUE_INFORM_EMAIL(){

        return new Queue(QUEUE_INFORM_EMAIL);
    }

    //声明队SMS列
    @Bean(QUEUE_INFORM_SMS)
    public Queue QUEUE_INFORM_SMS(){

        return new Queue(QUEUE_INFORM_SMS);
    }

    //ROUTINGKEY_EMAIL绑定交换机和队列 指定routingKey
    @Bean
    public Binding BINDING_QUEUE_INFORM_EMAIL(@Qualifier(QUEUE_INFORM_EMAIL) Queue queue,
                                              @Qualifier(EXCHANGE_TOPCIS_INFORM) Exchange exchange){

        return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY_EMAIL).noargs();
    }

    //ROUTINGKEY_SMS绑定交换机和队列 指定routingKey
    @Bean
    public Binding BINDING_QUEUE_INFORM_SMS(@Qualifier(QUEUE_INFORM_SMS) Queue queue,
                                              @Qualifier(EXCHANGE_TOPCIS_INFORM) Exchange exchange){

        return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY_SMS).noargs();
    }
//    public static final String QUEUE_INFORM_EMAIL = "queue_inform_email";
//    public static final String QUEUE_INFORM_SMS = "queue_inform_sms";
//    public static final String EXCHANGE_TOPICS_INFORM="exchange_topics_inform";
//    /**
//     * 交换机配置
//     * ExchangeBuilder提供了fanout、direct、topic、header交换机类型的配置
//     * @return the exchange
//     */
//
//    @Bean(EXCHANGE_TOPICS_INFORM)
//    public Exchange
//
//    EXCHANGE_TOPICS_INFORM()
//
//    {
//        //durable(true)持久化，消息队列重启后交换机仍然存在
//        return ExchangeBuilder.topicExchange(EXCHANGE_TOPICS_INFORM).durable(true).build();
//    }
//    //声明队列
//
//    @Bean(QUEUE_INFORM_SMS)
//    public Queue
//
//    QUEUE_INFORM_SMS()
//
//    {
//        Queue queue = new Queue(QUEUE_INFORM_SMS);
//        return queue;
//    }
//    //声明队列
//
//    @Bean(QUEUE_INFORM_EMAIL)
//    public Queue
//
//    QUEUE_INFORM_EMAIL()
//
//    {
//        Queue queue = new Queue(QUEUE_INFORM_EMAIL);
//        return queue;
//    }
//    /** channel.queueBind(INFORM_QUEUE_SMS,"inform_exchange_topic","inform.#.sms.#");
//     * 绑定队列到交换机 .
//     *
//     * @param queue    the queue
//     * @param exchange the exchange
//     * @return the binding
//     */
//
//    @Bean
//    public Binding
//
//    BINDING_QUEUE_INFORM_SMS(@Qualifier(QUEUE_INFORM_SMS) Queue queue,
//                             @Qualifier(EXCHANGE_TOPICS_INFORM) Exchange exchange)
//
//    {
//        return BindingBuilder.bind(queue).to(exchange).with("inform.#.sms.#").noargs();
//    }
//
//    @Bean
//    public Binding
//
//    BINDING_QUEUE_INFORM_EMAIL(@Qualifier(QUEUE_INFORM_EMAIL) Queue queue,
//                               @Qualifier(EXCHANGE_TOPICS_INFORM) Exchange exchange)
//
//    {
//        return BindingBuilder.bind(queue).to(exchange).with("inform.#.email.#").noargs();
//    }
}
