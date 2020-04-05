package com.jianjoy.pattern.demo.mediator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午6:24:49
 * 
 */
public abstract class Colleague {
	
	private Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public Mediator getMediator(){
		return mediator;
	}
}
 