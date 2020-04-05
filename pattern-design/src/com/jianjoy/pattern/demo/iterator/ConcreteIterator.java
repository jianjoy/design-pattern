package com.jianjoy.pattern.demo.iterator; 

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:27:26
 * 
 */
public class ConcreteIterator implements Iterator{
	
	
	private List list = new ArrayList<>();
	
	
	private int cursor = 0;
	
	
	public ConcreteIterator(List list){
		this.list = list;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		Object obj = null;
		if(this.hasNext()){
			obj = this.list.get(cursor++);
		}
		return obj;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if(cursor==list.size()){
			return false;
		}
		return true;
	}

}
 