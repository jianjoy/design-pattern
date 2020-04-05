package com.jianjoy.pattern.demo.compsite; 

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:15:29
 * 
 */
public class Compsite implements Compnent {
	
	
	private List<Compnent> childCompnents = new ArrayList<>();
	
	private String name;
	
	public Compsite(String name){
		this.name = name;
	}
	
	public void addChild(Compnent child){
		childCompnents.add(child);
	}
	
	
	public void removeChild(int index){
		childCompnents.remove(index);
	}
	
	/**
	 * @return the childCompnents
	 */
	public List<Compnent> getChild() {
		return childCompnents;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.compsite.Compnent#printStruct(java.lang.String)
	 */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr+"+"+this.name);
		if(this.childCompnents!=null){
			preStr += " ";
			for(Compnent c:childCompnents){
				c.printStruct(preStr);
			}
		}
		
	}

}
 