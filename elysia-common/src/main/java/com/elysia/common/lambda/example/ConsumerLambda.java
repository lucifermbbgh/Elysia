package com.elysia.common.lambda.example;

import java.util.function.Consumer;

/**
 * @BelongsProject: elysia-common
 * @BelongsPackage: com.elysia.common.lambda
 * @Author: ElysiaKafka
 * @CreateTime: 2024-02-21  13:20:34
 * @Description: Consumer（消费者）函数式接口lambda表达式
 * @Version: 1.0
 */
public class ConsumerLambda {
    public static void main(String[] args) {
        consumerString(consumer -> System.out.println(consumer));

        consumerString(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase())
        );
    }

    public static void consumerString(Consumer<String> consumer) {
        consumer.accept("Hello World");
    }

    public static void consumerString(Consumer<String> first, Consumer<String> second) {
        first.andThen(second).accept("Hello Fox");
    }
}
