package com.jianjoy.pattern.demo.decorator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午11:37:28
 * 
 */
public abstract class ShapeDecorator implements Shape {
	
	
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}
	
	public void draw(){
		decoratedShape.draw();
	}

}
 