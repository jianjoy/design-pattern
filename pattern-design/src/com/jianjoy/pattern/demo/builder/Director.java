package com.jianjoy.pattern.demo.builder; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午5:15:46
 * 
 */
public class Director {

	private CarBuilder builder;
	
	public Director(CarBuilder builder){
		this.builder = builder;
	}
	
	
	public void getCarTogether(){
		builder.buildCarFrame();
		builder.buildEngine();
		builder.buildCarWheel();
		builder.buildSteeringWheel();
	}
	
}
 