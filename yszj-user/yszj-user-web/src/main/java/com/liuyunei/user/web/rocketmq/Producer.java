package com.liuyunei.user.web.rocketmq;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

/**
 * Created by liuyunei on 2018/04/18.
 */
public class Producer {

    public static void main(String[] args) {
        DefaultMQProducer producer = new DefaultMQProducer("Producer");
        producer.setNamesrvAddr("127.0.0.1:9876");
        try {
            producer.start();
            long time = System.currentTimeMillis();
            System.out.println("开始：" + time);

            int a = 100000;

            for (int i = 1; i <= a; i++) {
                Message msg = new Message("PushTopic", "push", i + "", "Just for test.".getBytes());
                SendResult result = producer.send(msg);
                System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());
            }
            System.out.println("结束，消耗：" + (System.currentTimeMillis() - time));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }

}
