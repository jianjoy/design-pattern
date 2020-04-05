package com.jianjoy.pattern.demo.adapter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午10:42:28
 * 
 */
public class ObjectAdapterTest {

	
	public static void main(String[] args) {
		System.out.println("对象适配器模式测试：");
		Adaptee adaptee = new Adaptee();
		Target target = new ObjectAdapter(adaptee);
		target.request();
	}
	
}
 