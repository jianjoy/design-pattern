package com.jianjoy.pattern.demo.proxy; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 上午11:50:06
 * 
 */
public class RealSubject implements Subject{

	/* (non-Javadoc)
	 * @see com.demo.practice.proxy.Subject#request()
	 */
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("RealSubject handle request");
		
	}

}
 