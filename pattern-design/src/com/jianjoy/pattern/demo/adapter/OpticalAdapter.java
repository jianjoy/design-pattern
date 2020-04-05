package com.jianjoy.pattern.demo.adapter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午11:03:26
 * 
 */
public class OpticalAdapter implements Motor {

	
	private OpticalMotor omotor;
	
	
	
	public OpticalAdapter(){
		omotor = new OpticalMotor();
		
	}
	/* (non-Javadoc)
	 * @see com.demo.practice.adapter.Motor#drive()
	 */
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		omotor.opticalDrive();
	}
	
	
	

}
 