package com.elysia.common.lambda.example;

import java.util.function.Predicate;

/**
 * @BelongsProject: elysia-common
 * @BelongsPackage: com.elysia.common.lambda
 * @Author: ElysiaKafka
 * @CreateTime: 2024-02-21  22:24:48
 * @Description: Predicate（断言）函数式接口lambda表达式
 * @Version: 1.0
 */
public class PredicateLambda {
    public static void main(String[] args) {
        // lambda表达式
        andMethod(// 与运算表达多个逻辑需要同时满足，等同于&&
                predicate -> predicate.contains("Hello"),
                predicate -> predicate.contains("Elysia")
        );

        orMethod(// 或运算表达多个逻辑需要至少满足一个，等同于||
                predicate -> predicate.contains("Hello"),
                predicate -> predicate.contains("Elysia")
        );

        negateMethod(// 非运算表达取反，等同于!=
                predicate -> predicate.length() < 10 // 字段长度是否大于10
        );
        negateMethod(
                predicate -> predicate.length() < 20 // 字段长度是否大于20
        );
    }

    /**
     * @description: 与
     * @author: ElysiaKafka
     * @date: 2024/2/21 22:34
     * @param: p1
     * @param: p2
     **/
    public static void andMethod(Predicate<String> p1, Predicate<String> p2) {
        boolean testAnd = p1.and(p2).test("Hello Elysia!");
        System.out.println("字符串是否符合要求：" + testAnd);
    }

    /**
     * @description: 或
     * @author: ElysiaKafka
     * @date: 2024/2/21 22:34
     * @param: p1
     * @param: p2
     **/
    public static void orMethod(Predicate<String> p1, Predicate<String> p2) {
        boolean testOr = p1.or(p2).test("Hello Elysia!");
        System.out.println("字符串是否符合要求：" + testOr);
    }

    /**
     * @description: 非
     * @author: ElysiaKafka
     * @date: 2024/2/21 22:34
     * @param: predicate
     **/
    public static void negateMethod(Predicate<String> predicate) {
        boolean testNegate = predicate.negate().test("Hello Elysia!");
        System.out.println("字符串是否超长20：" + testNegate);
    }
}
