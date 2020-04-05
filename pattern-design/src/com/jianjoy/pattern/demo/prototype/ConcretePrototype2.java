package com.jianjoy.pattern.demo.prototype; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:30:21
 * 
 */
public class ConcretePrototype2 extends Prototype {
	
	public static int classFlag = 2;
	/* (non-Javadoc)
	 * @see com.demo.practice.prototype.Prototype#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (ConcretePrototype2)super.clone();
	}

}
 