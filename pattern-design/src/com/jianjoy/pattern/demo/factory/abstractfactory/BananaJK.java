package com.jianjoy.pattern.demo.factory.abstractfactory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月28日 下午6:01:09
 * 
 */
public class BananaJK extends Banana{

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.factory.abstractfactory.Banana#get()
	 */
	@Override
	public void get() {
		System.out.println("banana进口");
	}

}
 