package com.jianjoy.pattern.demo.principle; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月11日 下午4:18:06
 * 
 */
public class DIPtest {
	
	public static void main(String[] args) {
		Customer wang = new Customer();
		System.out.println("顾客购买以下商品:");
		wang.shopping(new ShaoguanShop());
		wang.shopping(new WuyuanShop());
		
		
	}

}
 