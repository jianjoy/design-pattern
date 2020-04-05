package com.jianjoy.pattern.demo.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author E-mail: jason@altamob.com
 * 
 * @version 创建时间：2020年3月27日 下午4:12:43
 * 
 */
public class DriverManager {

	private DriverManager() {
		System.out.println("init by "+Thread.currentThread().getName());
	}

	private static class DriverManagerInstanceHolder {
		private static final DriverManager INSTANCE = new DriverManager();
	}

	public static DriverManager getInstance() {
		return DriverManagerInstanceHolder.INSTANCE;
	}

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();
		final int testThread = 50;
		final CountDownLatch latch = new CountDownLatch(testThread);
		final CountDownLatch waitLatch = new CountDownLatch(1);
		for (int i = 0; i < testThread; i++) {
			es.execute(new Runnable() {
				@Override
				public void run() {
					latch.countDown();
					try {
						waitLatch.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					DriverManager.getInstance();
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		es.awaitTermination(1, TimeUnit.SECONDS);
		latch.await();
		waitLatch.countDown();

	}

}
