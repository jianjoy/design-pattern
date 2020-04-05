package com.jianjoy.pattern.demo.compsite; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:24:24
 * 
 */
public class Client {

	
	public static void main(String[] args) {
		Compsite root = new Compsite("服装");
		Compsite c1 = new Compsite("男装");
		Compsite c2 = new Compsite("女装");
		
		
		Leaf leaf1 = new Leaf("衬衫");
		Leaf leaf2 = new Leaf("夹克");
		Leaf leaf3 = new Leaf("裙子");
		Leaf leaf4 = new Leaf("套装");
		
		
		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		c1.addChild(leaf3);
		c1.addChild(leaf4);
		
		
		c2.addChild(leaf1);
		c2.addChild(leaf2);
		c2.addChild(leaf3);
		c2.addChild(leaf4);
		
		root.printStruct("");
	}
	
}
 