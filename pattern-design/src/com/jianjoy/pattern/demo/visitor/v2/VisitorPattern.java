package com.jianjoy.pattern.demo.visitor.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午4:51:06
 * 
 */
public class VisitorPattern {
	
	
	public static void main(String[] args) {
		
		ObjectStructure os = new ObjectStructure();
		os.add(new ConcreteElementA());
		os.add(new ConcreteElementB());
		
		Visitor visitor = new ConcreteVisitorA();
		os.accept(visitor);
		
		visitor = new ConcreteVisitorB();
		os.accept(visitor);
	}

}
 