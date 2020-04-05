package com.jianjoy.pattern.demo.adapter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午10:41:24
 * 
 */
public class ObjectAdapter implements Target {
	
	private Adaptee tee;
	
	public ObjectAdapter(Adaptee t){
		this.tee = t;
	}
	
	
	/* (non-Javadoc)
	 * @see com.demo.practice.adapter.Target#request()
	 */
	@Override
	public void request() {
		// TODO Auto-generated method stub
		this.tee.specificRequest();
	}

}
 