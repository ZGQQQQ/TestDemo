package com.testThreadPool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
				2,
				5,
				1L,
				TimeUnit.SECONDS,
				new LinkedBlockingQueue<>(3),
				Executors.defaultThreadFactory(),
				new ThreadPoolExecutor.DiscardPolicy()
		);
		try {
			for (int i = 0; i < 20; i++) {
				threadPoolExecutor.execute(() -> {
					System.out.println(Thread.currentThread().getName() + "线程来处理任务");
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			threadPoolExecutor.shutdown();
		}

	}
}
