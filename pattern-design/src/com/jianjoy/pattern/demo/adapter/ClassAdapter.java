package com.jianjoy.pattern.demo.adapter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午10:34:51
 * 
 */
public class ClassAdapter extends Adaptee implements Target {

	/* (non-Javadoc)
	 * @see com.demo.practice.adapter.Target#request()
	 */
	@Override
	public void request() {
		// TODO Auto-generated method stub
		specificRequest();
	}

}
 