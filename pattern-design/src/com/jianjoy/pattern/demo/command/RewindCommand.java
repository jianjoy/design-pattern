package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:27:27
 * 
 */
public class RewindCommand implements Command {
	
	public RewindCommand(AudioPlayer audioPlayer){
		this.player = audioPlayer;
	}
	private AudioPlayer player;

	/* (non-Javadoc)
	 * @see com.demo.practice.command.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.player.rewind();
	}

}
 