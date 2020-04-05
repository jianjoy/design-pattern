package com.jianjoy.pattern.demo.builder; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午4:58:52
 * 
 */
public interface CarBuilder {
	
	void buildCarWheel();
	
	void buildSteeringWheel();
	
	void buildEngine();
	
	void buildCarFrame();
	
	Car getCar();

}
 