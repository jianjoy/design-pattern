package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午6:26:41
 * 
 */
public class Invoker {

	private Command command;
	
	public Invoker(Command command){
		this.command = command;
	}
	
	public void aciton(){
		System.out.println("调用命令...");
		command.execute();
	}
	
	
}
 