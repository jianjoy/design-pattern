package com.jianjoy.pattern.demo.observer; 

import java.util.Observable;
import java.util.Observer;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午5:30:20
 * 
 */
public class People implements Observer {
	
	private String name;
	
	public People(String name){
		this.name = name;
	}
	

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("People update()-> update name:"+this.name+",price:"+((Float)arg).floatValue());
		
	}

}
 