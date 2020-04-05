package com.jianjoy.pattern.demo.thread; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月28日 下午3:28:43
 * 
 */
public class NoVisibility {

	private static  boolean ready;
	
	private  static  int number;
	
	private static class ReaderThread extends Thread{
		/* (non-Javadoc)
		 * @see java.lang.Thread#run()
		 */
		@Override
		public void run() {
			while(!ready)
				Thread.yield();
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
	    new ReaderThread().start();;
		number = 42;
//		ready = true;
	}
	
	
	
	
	
}
 