package com.jianjoy.pattern.demo.proxy; 

import java.util.Arrays;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月27日 下午10:14:24
 * 
 */
public class TestClass {

	private final IPerson iPerson;
	

	public TestClass (){
		iPerson= new Worker();
	}
	
	public void doWhat(){
		iPerson.say("我是工人");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "testclass";
	}
	
	
	private void safeMethod()
	{
		
		StackTraceElement[]st = new Exception().getStackTrace();
		System.out.println(Arrays.toString(st));
		
		
		System.out.println("safe method invoke");
	}
	
	
	
}
 