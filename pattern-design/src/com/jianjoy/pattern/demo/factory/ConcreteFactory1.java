package com.jianjoy.pattern.demo.factory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月12日 下午4:31:56
 * 
 */
public class ConcreteFactory1 implements AbstractFactory{

	/* (non-Javadoc)
	 * @see com.demo.practice.factory.AbstractFactory#newProduct()
	 */
	@Override
	public Product newProduct() {
		// TODO Auto-generated method stub
		System.out.println("具体工厂1生成-->具体产品1...");
		return new ConcreteProduct1();
	}

}
 