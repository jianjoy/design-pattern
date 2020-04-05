package com.jianjoy.pattern.demo.observer; 

import java.util.Observer;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午3:21:47
 * 
 */
public class CrudeOilFutures {
	
	
	public static void main(String[] args) {
		
		OilFutures oil = new OilFutures();
		Observer bull = new Bull();
		Observer bear = new Bear();
		oil.addObserver(bull);
		oil.addObserver(bear);
		oil.setPrice(10);
		oil.setPrice(-8);
	}

}
 