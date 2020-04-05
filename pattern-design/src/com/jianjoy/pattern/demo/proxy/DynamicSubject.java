package com.jianjoy.pattern.demo.proxy; 

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午2:01:18
 * 
 */
public class DynamicSubject implements InvocationHandler {
	
	
	
	private Object sub;
	
	public DynamicSubject(Object sub){
		this.sub = sub;
	}

	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling " + method);
		method.invoke(sub, args);
		System.out.println("after calling "+method);
		return null;
	}
	


}
 