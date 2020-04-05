package com.jianjoy.pattern.demo.visitor; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:58:13
 * 
 */
public class Visitor implements IVisitor{

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.IVisitor#visit(com.demo.practice.visitor.ConcreteElement1)
	 */
	@Override
	public void visit(ConcreteElement1 el1) {
		// TODO Auto-generated method stub
		el1.doSomething();
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.IVisitor#visit(com.demo.practice.visitor.ConcreteElement2)
	 */
	@Override
	public void visit(ConcreteElement2 el2) {
		// TODO Auto-generated method stub
		el2.doSomething();
	}

}
 