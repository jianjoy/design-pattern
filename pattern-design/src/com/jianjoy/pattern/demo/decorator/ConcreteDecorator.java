package com.jianjoy.pattern.demo.decorator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午2:22:56
 * 
 */
public class ConcreteDecorator extends Decorator {

	/**
	 * @param component
	 */
	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see com.demo.practice.decorator.Decorator#operation()
	 */
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		
		addedFunction();
	}

	/**
	 * 
	 */
	private void addedFunction() {
		// TODO Auto-generated method stub
		System.out.println("为具体构件角色添加额外的功能addedFunction()");
	}

}
 