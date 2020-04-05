package com.jianjoy.pattern.demo.flyweight; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午3:07:14
 * 
 */
public class ConcreteFlyweight implements Flyweight {
	
	
	private Character intrinsicState = null;
	
	
	public ConcreteFlyweight(Character state){
		this.intrinsicState = state;
	}
	

	/* (non-Javadoc)
	 * @see com.demo.practice.flyweight.Flyweight#operation(java.lang.String)
	 */
	@Override
	public void operation(String state) {
		System.out.println("IntrinsicState State="+ this.intrinsicState);
		System.out.println("Extrinsic State="+state);
		
	}

}
 