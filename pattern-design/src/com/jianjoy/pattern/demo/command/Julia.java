package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:31:33
 * 
 */
public class Julia {
	
	
	public static void main(String[] args) {
		
		AudioPlayer  player = new AudioPlayer();
		
		Command playCommand = new PlayCommand(player);
		
		Command rewindCommand = new RewindCommand(player);
		
		Command stopCommand = new StopCommand(player);
		
		KeyPad keyPad = new KeyPad();
		keyPad.setPlayCommand(playCommand);
		keyPad.setRewindCommand(rewindCommand);
		keyPad.setStopCommand(stopCommand);
		
		
		keyPad.play();
		keyPad.rewind();
		keyPad.stop();
		keyPad.play();
		keyPad.stop();
		
		
		
		
	}

}
 