package com.jianjoy.pattern.demo.flyweight; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午4:09:17
 * 
 */
public class Client {
	
	
	public static void main(String[] args) {
		
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");
		
		
		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");
		
		fly = factory.factory(new Character('a'));
		fly.operation("Thrid Call");
		
		System.out.println(factory.getSize());
	}

}
 