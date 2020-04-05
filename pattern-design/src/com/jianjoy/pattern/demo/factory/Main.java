package com.jianjoy.pattern.demo.factory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午6:16:36
 * 
 */
public class Main {

	
	public static void main(String[] args) {
		Factory factory = new Factory();
		BMW bmw320 = factory.createBMW(320);
		BMW bmw523= factory.createBMW(523);
	}
	
	
}
 