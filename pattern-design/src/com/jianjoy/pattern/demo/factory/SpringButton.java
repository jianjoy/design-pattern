package com.jianjoy.pattern.demo.factory;

/**
 * @author E-mail: jason@altamob.com
 * 
 * @version 创建时间：2017年6月28日 下午5:27:30
 * 
 */
public class SpringButton implements Button {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.demo.practice.factory.Button#display()
	 */
	public void display() {
		System.out.println("显示浅绿色按钮。");
	}

}
