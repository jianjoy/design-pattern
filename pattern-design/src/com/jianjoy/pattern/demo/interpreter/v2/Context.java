package com.jianjoy.pattern.demo.interpreter.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午5:59:13
 * 
 */
public class Context {
	
	
	
	private String[] citys = {"韶关","广州"};
	
	private String[] persons = {"老人","妇女","儿童"};
	
	
	private Expression cityPersion;
	
	public Context(){
		Expression city = new TerminalExpression(citys);
		Expression person = new TerminalExpression(persons);
		cityPersion = new AndExpression(city, person);
	}
	
	public void freeRide(String info){
		boolean ok = cityPersion.interpret(info);
		if(ok) System.out.println("您是"+info+",您本次乘车免费！");
		else{
			System.out.println(info+",您不是免费人员，本次乘车扣费2元！");
		}
	}
	
	

}
 