package com.jianjoy.pattern.demo.prototype; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:30:56
 * 
 */
public class TestMain {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Prototype prototype1 = new ConcretePrototype1();
		
		Prototype prototype2 = new ConcretePrototype2();
		
		ConcretePrototype1 concretePrototype1 = (ConcretePrototype1)prototype1.clone();
		System.out.println(concretePrototype1.classFlag);
		
		
		ConcretePrototype2 concretePrototype2 = (ConcretePrototype2)prototype2.clone();
		System.out.println(concretePrototype2.classFlag);
	}

}
 