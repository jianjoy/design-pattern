package com.jianjoy.pattern.demo.factory.factorymethod; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月28日 上午10:11:45
 * 
 */
public class FileLogger implements Logger {

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.factory.factorymethod.Logger#writeLog()
	 */
	@Override
	public void writeLog() {
		// TODO Auto-generated method stub

		System.out.println("write log to file");
	}

}
 