package com.jianjoy.pattern.demo.adapter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午10:35:39
 * 
 */
public class ClassAdapterTest {

	
	public static void main(String[] args) {
		
		System.out.println("类适配器模拟测试：");
		
		Target target = new ClassAdapter();
		target.request();
		
	}
	
}
 