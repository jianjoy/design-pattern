package com.jianjoy.pattern.demo.proxy; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月27日 下午10:17:41
 * 
 */
public class Worker implements IPerson{

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.proxy.IPerson#say(java.lang.String)
	 */
	@Override
	public void say(String what) {
		// TODO Auto-generated method stub
		System.out.println("say:"+what);
		
	}

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.proxy.IPerson#walk(java.lang.String)
	 */
	@Override
	public void walk(String where) {
		// TODO Auto-generated method stub
		System.out.println("walk:"+where);
	}

}
 