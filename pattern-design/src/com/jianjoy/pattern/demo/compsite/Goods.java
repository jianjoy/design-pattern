package com.jianjoy.pattern.demo.compsite; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午3:50:11
 * 
 */
public class Goods implements Articles {
	
	
	private String name;
	
	private int quality;
	
	
	private float unitPrice;
	
	public Goods(String name,int quality,float unitPrice){
		this.name = name;
		this.quality = quality;
		this.unitPrice = unitPrice;
	}
	
	

	/* (non-Javadoc)
	 * @see com.demo.practice.compsite.Articles#calculation()
	 */
	@Override
	public float calculation() {
		// TODO Auto-generated method stub
		return quality * unitPrice;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.compsite.Articles#show()
	 */
	@Override
	public void show() {

		System.out.println(name+"(数量: "+quality+" , 单价:"+unitPrice+"元");
		
	}

}
 