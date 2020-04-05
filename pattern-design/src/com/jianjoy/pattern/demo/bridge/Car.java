package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:46:26
 * 
 */
public abstract class Car {

	
	private Engine engine;
	
	public Car(Engine e){
		this.engine = e;
	}
	
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public abstract void installEngine();
}
 