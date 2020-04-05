package com.jianjoy.pattern.demo.factory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午5:05:34
 * 
 */
public abstract class AbstractClass {
	
	public void TemplateMethod(){
		SpecificMethod();
		
		abstractMethod1();
		abstractMethod2();
		
		
	}
	
	
	
	public void SpecificMethod(){
		System.out.println("抽象类中的具体方法被调用...");
	}
	
	
	public abstract void abstractMethod1();
	
	public abstract void abstractMethod2();
	
	

}
 