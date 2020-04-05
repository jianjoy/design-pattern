package com.jianjoy.pattern.demo.mediator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 上午10:48:12
 * 
 */
public class CPU extends Colleague {
	
	private String videoData = "";
	
	private String soundData = "";

	/**
	 * @param mediator
	 */
	public CPU(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the videoData
	 */
	public String getVideoData() {
		return videoData;
	}
	
	
	/**
	 * @return the soundData
	 */
	public String getSoundData() {
		return soundData;
	}
	
	
	
	public void executeData(String data){
		String[]array = data.split(",");
		this.videoData=array[0];
		this.soundData=array[1];
		getMediator().changed(this);
	}

}
 