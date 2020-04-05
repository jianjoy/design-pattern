package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午11:16:05
 * 
 */
public class ConcreteImplementorA implements Implementor {

	/* (non-Javadoc)
	 * @see com.demo.practice.bridge.Implementor#OperationImpl()
	 */
	@Override
	public void OperationImpl() {
		// TODO Auto-generated method stub
		System.out.println("具体实现化(Concrete Implementor)角色被访问");
	}

}
 