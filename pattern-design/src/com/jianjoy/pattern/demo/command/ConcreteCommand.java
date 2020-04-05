package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午6:23:35
 * 
 */
public class ConcreteCommand implements Command {

	private Receiver receiver = null;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	
	/* (non-Javadoc)
	 * @see com.demo.practice.command.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("执行命令。。。");
		receiver.action();
		
		
	}

}
 