package com.jianjoy.pattern.demo.tv; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月27日 下午4:11:21
 * 
 */
public class TVFactory {
	
	
	public static TV produceTV(String brand)throws Exception{
		if("Haire".equalsIgnoreCase(brand)){
			return new HaierTV();
		}else if("Hisense".equalsIgnoreCase(brand)){
			return new HisenseTV();
		}else{
			throw new Exception("错误代码");
		}
		
	}
	
	
	

}
 