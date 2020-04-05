package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午7:05:29
 * 
 */
public class ConcreteStatesB extends States {

	/* (non-Javadoc)
	 * @see com.demo.practice.state.States#Handle(com.demo.practice.state.Contexts)
	 */
	@Override
	public void Handle(Contexts contexts) {
		// TODO Auto-generated method stub
		System.out.println("当前状态是B.");
		contexts.setStates(new ConcreteStatesA());

	}

}
 