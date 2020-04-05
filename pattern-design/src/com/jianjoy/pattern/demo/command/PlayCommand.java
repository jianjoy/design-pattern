package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:26:11
 * 
 */
public class PlayCommand implements Command {
	
	private AudioPlayer myAudio;
	
	public PlayCommand(AudioPlayer audioPlayer){
		this.myAudio=audioPlayer;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.command.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.play();
	}

}
 