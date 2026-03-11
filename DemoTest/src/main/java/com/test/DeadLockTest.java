package com.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeadLockTest {
    private final static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            60000,
            100000,
            60L,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(200000),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    public static void main(String[] args) {
        int totalTasks = 50000000; // 模拟 50000 个用户购物下订单
        System.out.println("开始提交 " + totalTasks + " 个订单任务...");

        for (int i = 0; i < totalTasks; i++) {
            final int orderId = i;
            threadPoolExecutor.execute(() -> {
                try {
                    // 模拟处理订单逻辑
                    System.out.println("正在处理订单：" + orderId + ", 线程：" + Thread.currentThread().getName());
                    Thread.sleep(100); // 模拟业务处理耗时，缩短时间以便观察效果
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("订单 " + orderId + " 处理被中断");
                }
            });
        }

        threadPoolExecutor.shutdown();
        System.out.println("所有订单任务已提交，等待执行完成...");
        
        // 可选：等待线程池终止（实际生产中可能需要更优雅的处理）
        try {
            if (!threadPoolExecutor.awaitTermination(1, TimeUnit.HOURS)) {
                System.err.println("线程池未能在指定时间内完成所有任务");
            } else {
                System.out.println("所有订单任务执行完毕。");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("等待线程池终止时被中断");
        }
    }
}
