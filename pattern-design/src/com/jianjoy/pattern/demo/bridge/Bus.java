package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:47:51
 * 
 */
public class Bus extends Car {

	/**
	 * @param e
	 */
	public Bus(Engine e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.bridge.Car#installEngine()
	 */
	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		System.out.println("Bus:");
		this.getEngine().installEngine();

	}

}
 