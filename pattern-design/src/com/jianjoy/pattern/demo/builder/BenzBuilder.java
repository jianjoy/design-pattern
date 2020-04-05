package com.jianjoy.pattern.demo.builder; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午5:17:29
 * 
 */
public class BenzBuilder implements CarBuilder{
	
	private Benz benz;
	
	public BenzBuilder(){
		benz = new Benz();
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildCarWheel()
	 */
	@Override
	public void buildCarWheel() {
		// TODO Auto-generated method stub
		System.out.println("Benz add wheel");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildSteeringWheel()
	 */
	@Override
	public void buildSteeringWheel() {
		// TODO Auto-generated method stub
		System.out.println("Benz add SteeringWheel");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildEngine()
	 */
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("Benz add engine");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildCarFrame()
	 */
	@Override
	public void buildCarFrame() {
		// TODO Auto-generated method stub
		System.out.println("Benz add frame");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#getCar()
	 */
	@Override
	public Car getCar() {
		return benz;
	}

}
 