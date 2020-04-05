package com.jianjoy.pattern.demo.prototype; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月12日 上午10:10:00
 * 
 */
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype obj1 = new Realizetype();
		Realizetype obj2 = (Realizetype)obj1.clone();
		
		System.out.println("obj1==obj2?"+(obj1==obj2));
		
		
	}
	
	
}
 