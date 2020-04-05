package com.jianjoy.pattern.demo.factory.factorymethod; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月28日 上午10:14:27
 * 
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.factory.factorymethod.LoggerFactory#createLogger()
	 */
	@Override
	public Logger createLogger() {
		return new DatabaseLogger();
	}

}
 