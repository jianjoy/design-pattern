package com.jianjoy.pattern.demo.factory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月12日 下午4:33:57
 * 
 */
public class ConcreteFactory2 implements AbstractFactory {

	/* (non-Javadoc)
	 * @see com.demo.practice.factory.AbstractFactory#newProduct()
	 */
	@Override
	public Product newProduct() {
		// TODO Auto-generated method stub
		System.out.println("具体工厂2生成-->具体产品2...");
		return new ConcreteProduct2();
	}

}
 