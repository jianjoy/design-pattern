package com.jianjoy.pattern.demo.visitor.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午4:46:24
 * 
 */
public class ConcreteVisitorB implements Visitor {

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.v2.Visitor#visit(com.demo.practice.visitor.v2.ConcreteElementA)
	 */
	@Override
	public void visit(ConcreteElementA element) {
		// TODO Auto-generated method stub

		System.out.println("具体访问者B访问"+element.operationA());
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.v2.Visitor#visit(com.demo.practice.visitor.v2.ConcreteElementB)
	 */
	@Override
	public void visit(ConcreteElementB element) {
		// TODO Auto-generated method stub
		System.out.println("具体访问者B访问"+element.operationB());

	}

}
 