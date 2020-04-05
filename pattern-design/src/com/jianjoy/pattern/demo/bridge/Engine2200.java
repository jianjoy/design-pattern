package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:44:49
 * 
 */
public class Engine2200 implements Engine{

	/* (non-Javadoc)
	 * @see com.demo.practice.bridge.Engine#installEngine()
	 */
	@Override
	public void installEngine() {
		System.out.println("安装2200CC发动引擎");
		
	}

}
 