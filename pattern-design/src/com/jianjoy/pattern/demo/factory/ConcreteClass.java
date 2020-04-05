package com.jianjoy.pattern.demo.factory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午5:07:36
 * 
 */
public class ConcreteClass extends AbstractClass {

	/* (non-Javadoc)
	 * @see com.demo.practice.factory.AbstractClass#abstractMethod1()
	 */
	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		System.out.println("抽象方法1的实现被调用...");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.factory.AbstractClass#abstractMethod2()
	 */
	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		System.out.println("抽象方法2的实现被调用...");
	}

}
 