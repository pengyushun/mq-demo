package cn.itcast.mq;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
    @Bean
    public MessageConverter messageConverter(){
        System.out.println("我是傻逼主分支");
        System.out.println("我是聪明1分支");
        System.out.println("我是聪明1分支");
        System.out.println("我是2024.2.29 的新增添加");
        return new Jackson2JsonMessageConverter();

    }
}
