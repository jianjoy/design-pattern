package com.jianjoy.pattern.demo.flyweight; 

import java.util.HashMap;
import java.util.Map;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午4:05:14
 * 
 */
public class FlyweightFactory {

	private Map<Character, Flyweight> files = new HashMap<>();
	
	public Flyweight factory(Character state){
		Flyweight fly = files.get(state);
		if(fly==null){
			fly = new ConcreteFlyweight(state);
			files.put(state, fly);
		}
		return fly;
	}
	
	
	public int getSize (){
		System.out.println(files);
		return files.size();
	}
	
	
}
 