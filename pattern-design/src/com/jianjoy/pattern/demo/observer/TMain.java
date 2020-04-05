package com.jianjoy.pattern.demo.observer; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午5:32:07
 * 
 */
public class TMain {
	
	public static void main(String[] args) {
		Antique house = new Antique(1222f);
		People p1 = new People("p1");
		People p2 = new People("p2");
		People p3 = new People("p3");
		house.addObserver(p1);
		house.addObserver(p2);
		house.addObserver(p3);
		
		house.setPrice(1222f+1);
	}

}
 