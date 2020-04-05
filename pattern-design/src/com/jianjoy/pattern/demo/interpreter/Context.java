package com.jianjoy.pattern.demo.interpreter; 

import java.util.HashMap;
import java.util.Map;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:47:22
 * 
 */
public class Context {
	
	private Map valueMap = new HashMap();
	
	
	public void addValue(Variable x ,int y){
		valueMap.put(x, y);
	}
	
	public  int LookupValue(Variable x){
		return (int)valueMap.get(x);
	}

}
 