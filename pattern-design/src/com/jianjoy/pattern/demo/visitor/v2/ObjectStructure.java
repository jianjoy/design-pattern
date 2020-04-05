package com.jianjoy.pattern.demo.visitor.v2; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午4:51:40
 * 
 */
public class ObjectStructure {
	
	private List<Element> list =new ArrayList<>();
	
	
	public void accept(Visitor v){
		Iterator<Element> iterator = list.iterator();
		while(iterator.hasNext()){
			Element e = iterator.next();
			e.accept(v);
		}
	}
	
	
	public void add(Element e){
		list.add(e);
	}
	
	
	public void remove(Element element){
		list.remove(element);
	}
	

}
 