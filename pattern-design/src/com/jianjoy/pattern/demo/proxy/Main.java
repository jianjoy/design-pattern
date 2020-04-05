package com.jianjoy.pattern.demo.proxy; 

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午2:06:47
 * 
 */
public class Main {
	
	
	public static void main(String[] args) {
		Subject rs = new RealSubject();
		InvocationHandler handler = new DynamicSubject(rs);
		Subject subject = (Subject)Proxy.newProxyInstance(rs.getClass().getClassLoader(),rs.getClass().getInterfaces(), handler);
		subject.request();
	}

}
 