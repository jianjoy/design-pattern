package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:29:36
 * 
 */
public class KeyPad {

	private Command playCommand;
	
	private Command rewindCommand;
	
	private Command stopCommand;
	
	/**
	 * @param playCommand the playCommand to set
	 */
	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	
	/**
	 * @param rewindCommand the rewindCommand to set
	 */
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	
	
	/**
	 * @param stopCommand the stopCommand to set
	 */
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	public void play(){
		playCommand.execute();
	}
	
	
	
	public void rewind(){
		rewindCommand.execute();
	}
	
	
	public void stop(){
		stopCommand.execute();
	}
	
	
}
 