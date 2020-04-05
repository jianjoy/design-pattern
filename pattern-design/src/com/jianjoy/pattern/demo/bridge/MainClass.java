package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午3:51:01
 * 
 */
public class MainClass {
	
	public static void main(String[] args) {
		Engine engine2000 = new Engine2000();
		Engine engine2200 = new Engine2200();
		Car bus = new Bus(engine2000);
		bus.installEngine();
		Car jeep = new Jeep(engine2200);
		jeep.installEngine();
	}

}
 