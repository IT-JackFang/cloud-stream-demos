package com.fxz.cloud.stream.producer.rabbitmq.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-02-26 14:06:38
 */
public interface HelloBinding {

    @Output("greetingChannel")
    MessageChannel greeting();

}
