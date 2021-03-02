package com.fxz.cloud.stream.consumer.rabbitmq.listener;

import com.fxz.cloud.stream.consumer.rabbitmq.mq.HelloBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-02-26 14:29:48
 */
@EnableBinding(HelloBinding.class)
public class HelloListener {

    @StreamListener(target = HelloBinding.GREETING)
    public void processHelloChannelGreeting(String msg) {
        System.out.println(msg);
    }

}
