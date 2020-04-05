package com.jianjoy.pattern.demo.prototype; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月12日 上午10:08:05
 * 
 */
public class Realizetype implements Cloneable {
	
	
	/**
	 * 
	 */
	public Realizetype() {
		// TODO Auto-generated constructor stub
		System.out.println("具体原型创建成功！");
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("具体原型复制成功!");
		return (Realizetype)super.clone();
	}

}
 