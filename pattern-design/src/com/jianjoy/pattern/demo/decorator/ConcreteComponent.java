package com.jianjoy.pattern.demo.decorator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午2:14:43
 * 
 */
public class ConcreteComponent implements Component{
	
	
	public ConcreteComponent(){
		System.out.println("创建具体构件角色");
	}
	

	/* (non-Javadoc)
	 * @see com.demo.practice.decorator.Component#operation()
	 */
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("调用具体构件角色的方法operation()");
		
	}

}
 