package com.jianjoy.pattern.demo.factory;

/**
 * @author E-mail: jason@altamob.com
 * 
 * @version 创建时间：2019年3月6日 下午6:15:12
 * 
 */
public class Factory {

	public BMW createBMW(int type) {
		switch (type) {
		case 320:
			return new BMW320();
		case 523:
			return new BMW523();
		default:
			break;
		}
		return null;
	}

}
