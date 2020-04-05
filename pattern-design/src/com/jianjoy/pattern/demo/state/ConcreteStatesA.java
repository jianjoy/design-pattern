package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午7:02:26
 * 
 */
public class ConcreteStatesA extends States {

	/* (non-Javadoc)
	 * @see com.demo.practice.state.States#Handle(com.demo.practice.state.Contexts)
	 */
	@Override
	public void Handle(Contexts contexts) {
		// TODO Auto-generated method stub
		System.out.println("当前状态是A");
		contexts.setStates(new ConcreteStatesB());
	}

}
 