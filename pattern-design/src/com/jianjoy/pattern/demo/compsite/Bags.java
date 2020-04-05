package com.jianjoy.pattern.demo.compsite; 

import java.util.ArrayList;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午3:55:28
 * 
 */
public class Bags implements Articles {
	
	
	private String name;
	
	private ArrayList<Articles> bags = new ArrayList<>();
	
	
	
	public Bags(String name){
		this.name = name;
	}
	
	
	public void add(Articles c){
		bags.add(c);
	}
	
	
	public void remove(Articles c){
		bags.remove(c);
	}
	
	public Articles getChild(int i){
		return bags.get(i);
	}
	
	public float calculation(){
		float s = 0;
		for(Object obj:bags){
			s +=( (Articles)obj).calculation();
		}
		return s;
	}
	
	

	/* (non-Javadoc)
	 * @see com.demo.practice.compsite.Articles#show()
	 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		for(Object obj:bags){
			((Articles)obj).show();
		}
	}

}
 