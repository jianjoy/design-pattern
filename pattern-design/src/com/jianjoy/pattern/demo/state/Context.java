package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:14:05
 * 
 */
public class Context {
	
	
	private State state;
	
	
	public void setState(State state){
		this.state = state;
	}



	
	public void request(String sampleParameter){
		state.handle(sampleParameter);
	}


}
 