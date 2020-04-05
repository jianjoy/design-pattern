package com.jianjoy.pattern.demo.observer; 

import java.util.Observable;
import java.util.Observer;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午3:18:12
 * 
 */
public class Bear implements Observer {

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		Float price = (Float)arg;
		
		if(price<0){
			System.out.println("油价下降"+(-price.floatValue())+"元，空方高兴了!");
		}else{
			System.out.println("油价上升"+(price.floatValue())+"元，空方难受了!");
		}
		
	}

}
 