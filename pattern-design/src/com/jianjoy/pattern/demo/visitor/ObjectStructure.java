package com.jianjoy.pattern.demo.visitor; 

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午6:01:07
 * 
 */
public class ObjectStructure {

	public static List<Element> getList(){
		List<Element> list = new ArrayList<>();
		Random random = new Random();
		for(int i=0;i<10;i++){
			int a = random.nextInt(100);
			if(a>50){
				list.add(new ConcreteElement1());
			}else{
				list.add(new ConcreteElement2());
			}
		}
		return list;
	}
	
	
}
 