package com.fxz.cloud.stream.consumer.rabbitmq.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-02-26 14:27:10
 */
public interface HelloBinding {

    String GREETING = "greetingChannel";

    @Input(GREETING)
    SubscribableChannel greeting();

}
