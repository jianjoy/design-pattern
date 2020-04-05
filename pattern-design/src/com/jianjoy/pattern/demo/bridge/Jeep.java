package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:48:48
 * 
 */
public class Jeep extends Car {

	/**
	 * @param e
	 */
	public Jeep(Engine e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.bridge.Car#installEngine()
	 */
	@Override
	public void installEngine() {
		System.out.println("Jeep:");
		this.getEngine().installEngine();

	}

}
 