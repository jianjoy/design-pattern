package com.jianjoy.pattern.demo.factory.abstractfactory; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月28日 下午6:00:12
 * 
 */
public class FruitJKFactory implements FruitFactory {

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.factory.abstractfactory.FruitFactory#getApple()
	 */
	@Override
	public Fruit getApple() {
		// TODO Auto-generated method stub
		return new AppleJK();
	}

	/* (non-Javadoc)
	 * @see com.jianjoy.pattern.demo.factory.abstractfactory.FruitFactory#getBanana()
	 */
	@Override
	public Fruit getBanana() {
		return new BananaJK();
	}

}
 