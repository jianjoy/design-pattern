package com.jianjoy.pattern.demo; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月20日 下午4:49:01
 * 
 */
public class OozinoRocket extends PhysicalRocket implements RocketSim {

	
	private double time;
	
	/**
	 * @param burnArea
	 * @param burnRate
	 * @param fuelMass
	 * @param totalMass
	 */
	public OozinoRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super(burnArea, burnRate, fuelMass, totalMass);
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.RocketSim#getMass()
	 */
	public double getMass() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.RocketSim#getThrust()
	 */
	public double getThrust() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.RocketSim#setSimTime(double)
	 */
	public void setSimTime(double t) {
		// TODO Auto-generated method stub
		this.time = t;
		
	}

	
	
	
	
	
}
 