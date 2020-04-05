package com.jianjoy.pattern.demo.proxy; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月27日 下午10:33:09
 * 
 */
public class Leader implements IPerson{

	IPerson iPerson;
	public Leader(IPerson iperson){
		this.iPerson=iperson;
	}
	
	
	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.proxy.IPerson#say(java.lang.String)
	 */
	@Override
	public void say(String what) {
		// TODO Auto-generated method stub
		System.out.println("=========say===========");
		iPerson.say(what);
		System.out.println("=======================end say");
		
	}

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.proxy.IPerson#walk(java.lang.String)
	 */
	@Override
	public void walk(String where) {
		// TODO Auto-generated method stub
		System.out.println("=========walk===========");
		iPerson.walk(where);
		System.out.println("=======================end walk");
	}

}
 