package com.jianjoy.pattern.demo.observer; 

import java.util.Observable;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午3:12:55
 * 
 */
public class OilFutures extends Observable {
	
	
	private float price;
	
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		setChanged();
		notifyObservers(price);
		this.price = price;
	}

}
 