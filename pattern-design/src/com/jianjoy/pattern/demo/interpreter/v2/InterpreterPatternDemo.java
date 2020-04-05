package com.jianjoy.pattern.demo.interpreter.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午6:04:16
 * 
 */
public class InterpreterPatternDemo {
	
	
	public static void main(String[] args) {
		
		Context bus = new Context();
		bus.freeRide("韶关的老人");
		bus.freeRide("韶关的年轻人");
		bus.freeRide("广州的妇女");
		bus.freeRide("广州的儿童");
		bus.freeRide("山东的儿童");
		
		
		
	}

}
 