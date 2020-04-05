package com.jianjoy.pattern.demo.observer; 

import java.util.Observable;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午5:27:10
 * 
 */
public class Antique extends Observable{
	
	
	private float mPrice;
	
	public Antique(float price){
		this.mPrice = price;
	}
	
	
	public void setPrice(float price){
		if(this.mPrice!=price){
			super.setChanged();
			super.notifyObservers(price);
		}
		this.mPrice = price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "股东价格为:"+this.mPrice;
	}

}
 