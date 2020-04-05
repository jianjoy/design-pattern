package com.jianjoy.pattern.demo.mediator; 


/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 上午10:44:55
 * 
 */
public class CDDriver extends Colleague {

	
	/**
	 * @param mediator
	 */
	public CDDriver(Mediator mediator) {
		super(mediator);

		// TODO Auto-generated constructor stub
	}

	private String data="";
	
	
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * 
	 */
	public void readCD() {
		// TODO Auto-generated method stub
		this.data="One Piece,海贼王我当定了";
		getMediator().changed(this);

	}

}
 