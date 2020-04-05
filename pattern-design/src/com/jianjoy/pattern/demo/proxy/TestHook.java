package com.jianjoy.pattern.demo.proxy; 

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月27日 下午10:27:28
 * 
 */
public class TestHook {

	public static void main(String[] args) throws Exception{
		
		Class clazz = Class.forName("com.jianjoy.pattern.demo.proxy.TestClass");
		
		final Worker real = new Worker();
		Object o = clazz.getDeclaredConstructor().newInstance();
		final Leader act = new Leader(new Worker());
//		IPerson iperson = (IPerson)Proxy.newProxyInstance(act.getClass().getClassLoader(),act.getClass().getInterfaces(), new InvocationHandler() {
//			@Override
//			public Object invoke(Object proxy, Method method, Object[] args)
//					throws Throwable {
//				return method.invoke(act, args);
//			}
//		});
		
		
		
		
		Field[] fileds = clazz.getDeclaredFields();
		for(Field f:fileds){
			if(f.getName().equals("iPerson")){
			    f.setAccessible(true);
				f.set(o, act);
			}
		}
//		
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m:ms){
			if(m.getName().equals("safeMethod")){
				m.setAccessible(true);
				m.invoke(o);
			}
		}
		
		
		((TestClass)o).doWhat();
		
	}
	
	
}
 