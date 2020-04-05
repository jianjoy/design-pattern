package com.jianjoy.pattern.demo.visitor; 

import java.util.List;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午6:04:50
 * 
 */
public class Client {
	
	
	public static void main(String[] args) {
		
		List<Element> list = ObjectStructure.getList();
		
		for (Element e:list){
			e.accept(new Visitor());
		}
	}

}
 