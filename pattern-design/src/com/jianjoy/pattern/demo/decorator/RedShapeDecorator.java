package com.jianjoy.pattern.demo.decorator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午11:39:24
 * 
 */
public class RedShapeDecorator extends ShapeDecorator{

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see com.demo.practice.decorator.ShapeDecorator#draw()
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	/**
	 * @param decoratedShape
	 */
	private void setRedBorder(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Border Color: Red.");
	}
	
	

}
 