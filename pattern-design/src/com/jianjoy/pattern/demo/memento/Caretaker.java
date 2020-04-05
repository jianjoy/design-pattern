package com.jianjoy.pattern.demo.memento; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:53:18
 * 
 */
public class Caretaker {
	
	private Memento memento;
	
	public Memento getMemento(){
		return memento;
	}
	
	/**
	 * @param memento the memento to set
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
 