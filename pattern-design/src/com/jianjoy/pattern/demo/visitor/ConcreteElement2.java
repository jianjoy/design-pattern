package com.jianjoy.pattern.demo.visitor; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:55:44
 * 
 */
public class ConcreteElement2 extends Element {

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.Element#accept(com.demo.practice.visitor.IVisitor)
	 */
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub

		visitor.visit(this);
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.Element#doSomething()
	 */
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("这是元素2");
		
	}

}
 