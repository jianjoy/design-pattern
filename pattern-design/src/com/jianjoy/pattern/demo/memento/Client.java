package com.jianjoy.pattern.demo.memento; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:54:29
 * 
 */
public class Client {
	
	public static void main(String[] args) {
		
		Originator o = new Originator();
		o.setState("状态1");
		System.out.println("初始状态:"+o.getState());
		
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setState("状态2");
		
		System.out.println("改变后状态:"+o.getState());
		
		o.restoreMemento(c.getMemento());
		System.out.println("恢复后状态:"+o.getState());
	}

}
 