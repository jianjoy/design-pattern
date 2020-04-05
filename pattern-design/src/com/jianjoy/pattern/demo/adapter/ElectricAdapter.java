package com.jianjoy.pattern.demo.adapter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午11:01:54
 * 
 */
public class ElectricAdapter implements Motor {
	
	public ElectricMotor emotor;
	
	public ElectricAdapter(){
		emotor = new ElectricMotor();
	}
	
	
	/* (non-Javadoc)
	 * @see com.demo.practice.adapter.Motor#drive()
	 */
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		emotor.electricDrive();
	}

}
 