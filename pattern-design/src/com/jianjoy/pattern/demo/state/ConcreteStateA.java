package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:15:38
 * 
 */
public class ConcreteStateA implements State{

	/* (non-Javadoc)
	 * @see com.demo.practice.state.State#handle(java.lang.String)
	 */
	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		
		System.out.println("ConcreteStateA handle :"+sampleParameter);
		
	}
	
	
	
	

}
 