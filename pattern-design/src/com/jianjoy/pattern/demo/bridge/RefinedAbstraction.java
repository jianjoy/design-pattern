package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午11:19:11
 * 
 */
public class RefinedAbstraction extends Abstraction {

	/**
	 * @param imple
	 */
	public RefinedAbstraction(Implementor imple) {
		super(imple);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.bridge.Abstraction#Operation()
	 */
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("拓展抽象化(Refined Abstraction) 角色被访问");
		imple.OperationImpl();
		
	}

}
 