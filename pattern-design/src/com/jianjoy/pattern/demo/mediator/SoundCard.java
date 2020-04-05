package com.jianjoy.pattern.demo.mediator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 上午10:51:30
 * 
 */
public class SoundCard extends Colleague {

	/**
	 * @param mediator
	 */
	public SoundCard(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	
	public void soundData(String data){
		
		System.out.println("画外音:"+data);
	}

}
 