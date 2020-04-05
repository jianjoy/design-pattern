package com.jianjoy.pattern.demo.prototype; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:28:54
 * 
 */
public class ConcretePrototype1  extends Prototype{
	
	public static int classFlag = 1;
	
	/* (non-Javadoc)
	 * @see com.demo.practice.prototype.Prototype#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (ConcretePrototype1)super.clone();
	}
	

}
 