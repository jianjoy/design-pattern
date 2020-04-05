package com.jianjoy.pattern.demo.builder; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月6日 下午5:22:22
 * 
 */
public class BMWBuilder implements CarBuilder{
	
	private BMW bmw;
	
	public BMWBuilder(){
		bmw = new BMW();
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildCarWheel()
	 */
	@Override
	public void buildCarWheel() {
		// TODO Auto-generated method stub
		System.out.println("BMW add CarWheel");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildSteeringWheel()
	 */
	@Override
	public void buildSteeringWheel() {
		// TODO Auto-generated method stub
		System.out.println("BMW add SteeringWheel");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildEngine()
	 */
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("BMW add Engine");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#buildCarFrame()
	 */
	@Override
	public void buildCarFrame() {
		// TODO Auto-generated method stub
		System.out.println("BMW add Frame");
		
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.builder.CarBuilder#getCar()
	 */
	@Override
	public Car getCar() {
		return bmw;
	}

}
 