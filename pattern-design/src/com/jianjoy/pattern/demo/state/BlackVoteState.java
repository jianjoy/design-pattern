package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:44:31
 * 
 */
public class BlackVoteState implements VoteState {

	/* (non-Javadoc)
	 * @see com.demo.practice.state.VoteState#vote(java.lang.String, java.lang.String, com.demo.practice.state.VoteManager)
	 */
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		
		System.out.println("进入黑名单，将禁止登陆和使用本系统");
		
	}

}
 