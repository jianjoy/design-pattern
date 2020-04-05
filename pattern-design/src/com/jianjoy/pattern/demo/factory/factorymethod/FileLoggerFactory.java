package com.jianjoy.pattern.demo.factory.factorymethod; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月28日 下午5:53:25
 * 
 */
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		return new FileLogger();
	}

}
 