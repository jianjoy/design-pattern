package com.jianjoy.pattern.demo.log; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月28日 下午5:04:19
 * 
 */
public class FileLogger implements Logger {

	/* (non-Javadoc)
	 * @see com.demo.practice.log.Logger#writeLog()
	 */
	public void writeLog() {
	
		System.out.println("文件记录日志！");
	}

}
 