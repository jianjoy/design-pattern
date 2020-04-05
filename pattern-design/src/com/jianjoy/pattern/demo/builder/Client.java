package com.jianjoy.pattern.demo.builder; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午5:25:16
 * 
 */
public class Client {

	public static void main(String[] args) {
		BenzBuilder benzBuilder = new BenzBuilder();
		BMWBuilder bmwBuilder = new BMWBuilder();
		
		Director benzDiretor = new Director(benzBuilder);
		benzDiretor.getCarTogether();
		Car benz = benzBuilder.getCar();
		benz.run();
		
		
		Director bmwDirector = new Director(bmwBuilder);
		bmwDirector.getCarTogether();
		Car bmw = bmwBuilder.getCar();
		bmw.run();
	}
	
	
	
	
}
 