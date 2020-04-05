package com.jianjoy.pattern.demo.compsite; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:19:31
 * 
 */
public class Leaf implements Compnent {

	/* (non-Javadoc)
	 * @see com.demo.practice.compsite.Compnent#printStruct(java.lang.String)
	 */
	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr +"-"+name);
		
	}
	
	private String name;
	
	public Leaf(String name){
		this.name = name;
	}

}
 