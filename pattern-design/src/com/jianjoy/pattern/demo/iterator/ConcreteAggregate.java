package com.jianjoy.pattern.demo.iterator; 

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:32:24
 * 
 */
public class ConcreteAggregate implements Aggregate{
	
	private List list = new ArrayList<>();

	/* (non-Javadoc)
	 * @see com.demo.practice.iterator.Aggregate#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		list.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.iterator.Aggregate#remove(java.lang.Object)
	 */
	@Override
	public void remove(Object obj) {
		// TODO Auto-generated method stub
		list.remove(obj);
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.iterator.Aggregate#iterator()
	 */
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(list);
	}

}
 