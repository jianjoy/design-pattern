package com.jianjoy.pattern.demo.decorator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午2:16:39
 * 
 */
public class DecoratorPatternDemo {

	
	public static void main(String[] args) {
		
		Shape cirle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		cirle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
		
	}
	
	
}
 