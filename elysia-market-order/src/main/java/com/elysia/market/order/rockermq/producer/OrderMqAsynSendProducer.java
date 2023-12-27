package com.elysia.market.order.rockermq.producer;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.order.rockermq
 * @Author: ElysiaKafka
 * @CreateTime: 2023-12-11  21:35:00
 * @Description: 异步消息生产者
 * @Version: 1.0
 */
public class OrderMqAsynSendProducer {
    public static void main(String[] args) {
        // 创建生产者
        DefaultMQProducer producer = new DefaultMQProducer("elysia-market-order-producer");
        // 设置NameServer地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        try {
            // 启动生产者
            producer.start();
            for (int i = 0; i < 10; i++) {// 发送10条消息
                // 创建消息
                Message message = new Message("elysia-market-order-topic",
                        "elysia-market-order-tag",
                        "elysia-market-order-key",
                        ("elysia-market-order-body" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                // 发送消息
                producer.send(message, getSendCallBack());
            }
            // 等待10秒
            Thread.sleep(10000);
        } catch (MQClientException | UnsupportedEncodingException | RemotingException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭生产者
            producer.shutdown();
        }
    }

    /**
     * @description: 发送回调
     * @author: ElysiaKafka
     * @date: 2023/12/12 18:07
     * @return: org.apache.rocketmq.client.producer.SendCallback
     **/
    private static SendCallback getSendCallBack() {
        SendCallback sendCallback = new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println(sendResult);
            }

            @Override
            public void onException(Throwable e) {
                System.out.println(ExceptionUtils.getStackTrace(e));
            }
        };
        return sendCallback;
    }
}
