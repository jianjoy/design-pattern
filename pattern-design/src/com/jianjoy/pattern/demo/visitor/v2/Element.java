package com.jianjoy.pattern.demo.visitor.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午4:35:20
 * 
 */
public interface Element {
	
	
	void accept(Visitor visitor);

}
 