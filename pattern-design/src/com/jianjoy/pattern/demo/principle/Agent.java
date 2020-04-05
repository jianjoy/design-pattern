package com.jianjoy.pattern.demo.principle; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月11日 下午5:29:22
 * 
 */
public class Agent {
	
	private Star myStar;
	
	private Fans myFans;
	
	private Company myCompany;
	
	public void setStar(Star myStar){
		this.myStar = myStar;
	}
	
	
	public void setFans(Fans myFans){
		this.myFans = myFans;
	}
	
	
	public void setCompany(Company myCompany){
		this.myCompany = myCompany;
	}
	
	
	
	public void meeting(){
		System.out.println(myFans.getName()+"与明星"+myStar.getName()+"见面了。");
	}
	
	
	
	public void business(){
		System.out.println(myCompany.getName()+"与明星"+myStar.getName()+"洽谈业务。");
	}
	

}
 