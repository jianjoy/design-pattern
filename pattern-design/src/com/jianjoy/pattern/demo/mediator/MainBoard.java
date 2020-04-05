package com.jianjoy.pattern.demo.mediator; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 上午10:52:33
 * 
 */
public class MainBoard implements Mediator {
	
	
//	private CDDriver cdDriver = null;
	
	private CPU cpu = null;
	
	private VideoCard videoCard = null;
	
	private SoundCard soundCard = null;
	
	
//	/**
//	 * @param cdDriver the cdDriver to set
//	 */
//	public void setCdDriver(CDDriver cdDriver) {
//		this.cdDriver = cdDriver;
//	}
	
	
	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	/**
	 * @param videoCard the videoCard to set
	 */
	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}
	
	/**
	 * @param soundCard the soundCard to set
	 */
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	
	private void opeCDDriverReadData(CDDriver cd){
		String data = cd.getData();
		cpu.executeData(data);
	}
	
	
	private void opeCPU(CPU cpu){
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();
		videoCard.showData(videoData);
		soundCard.soundData(soundData);
	}


	/* (non-Javadoc)
	 * @see com.demo.practice.mediator.Mediator#changed(com.demo.practice.mediator.Colleague)
	 */
	@Override
	public void changed(Colleague c) {
		if(c instanceof CDDriver){
			this.opeCDDriverReadData((CDDriver)c);
		}else if(c instanceof CPU){
			this.opeCPU((CPU)c);
		}
		
	}

	
}
 