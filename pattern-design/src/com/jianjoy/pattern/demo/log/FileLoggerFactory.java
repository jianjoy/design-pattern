package com.jianjoy.pattern.demo.log; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月28日 下午5:07:17
 * 
 */
public class FileLoggerFactory implements LoggerFactory {

	public Logger createLogger() {
		return new FileLogger();
	}

}
 