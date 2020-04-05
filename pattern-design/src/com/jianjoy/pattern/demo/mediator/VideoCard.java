package com.jianjoy.pattern.demo.mediator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 上午10:50:28
 * 
 */
public class VideoCard extends Colleague {

	/**
	 * @param mediator
	 */
	public VideoCard(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	
	public void showData(String data){
		System.out.println("您正在观看的是"+data);
	}

}
 