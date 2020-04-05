package com.jianjoy.pattern.demo.log; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月28日 下午5:03:39
 * 
 */
public class DatabaseLogger implements Logger{

	/* (non-Javadoc)
	 * @see com.demo.practice.log.Logger#writeLog()
	 */
	public void writeLog() {
		System.out.println("数据库日志记录！");
	}

}
 