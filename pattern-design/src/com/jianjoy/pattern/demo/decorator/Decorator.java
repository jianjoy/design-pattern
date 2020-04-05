package com.jianjoy.pattern.demo.decorator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午2:20:52
 * 
 */
public class Decorator implements Component{
	
	private Component component;
	
	public Decorator(Component component){
		this.component = component;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.decorator.Component#operation()
	 */
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		component.operation();
	}

}
 