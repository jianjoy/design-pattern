package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:28:37
 * 
 */
public class StopCommand implements Command{
	
	public StopCommand(AudioPlayer player){
		this.p=player;
	}
	private AudioPlayer p;

	/* (non-Javadoc)
	 * @see com.demo.practice.command.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		p.stop();
	}

}
 