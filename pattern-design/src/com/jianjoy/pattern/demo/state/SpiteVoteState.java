package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:41:58
 * 
 */
public class SpiteVoteState implements VoteState{

	/* (non-Javadoc)
	 * @see com.demo.practice.state.VoteState#vote(java.lang.String, java.lang.String, com.demo.practice.state.VoteManager)
	 */
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		
		String str = voteManager.getMapVote().get(user);
		
		if(str!=null){
			voteManager.getMapVote().remove(user);
		}
		
		System.out.println("你有恶意刷屏行为，取消投票资格");
		
	}

}
 