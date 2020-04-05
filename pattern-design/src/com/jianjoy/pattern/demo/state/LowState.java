package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午7:23:05
 * 
 */
public class LowState extends AbstractState{
	
	
	public LowState(ScoreContext h){
		hj = h;
		stateName = "不及格";
		score = 0;
	}
	
	
	public LowState(AbstractState state){
		hj=state.hj;
		stateName="不及格";
		score = state.score;
	}
	

	/* (non-Javadoc)
	 * @see com.demo.practice.state.AbstractState#checkState()
	 */
	@Override
	public void checkState() {
		// TODO Auto-generated method stub
		
		if(score>=90){
//			hj.setState(state);
		}else if(score>=60){
//			hj.setState(state);
		}
		
	}

}
 