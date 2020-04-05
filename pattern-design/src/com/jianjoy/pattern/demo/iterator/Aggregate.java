package com.jianjoy.pattern.demo.iterator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:31:05
 * 
 */
public interface Aggregate {

	public void add(Object obj);
	
	public void remove(Object obj);
	
	public Iterator iterator();
	
	
}
 