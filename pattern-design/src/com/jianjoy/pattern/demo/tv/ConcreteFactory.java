package com.jianjoy.pattern.demo.tv; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月28日 下午5:01:15
 * 
 */
public class ConcreteFactory implements Factory{

	public Product factoryMethod() {
		return new ConcreteProduct();
	}

}
 