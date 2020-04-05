package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:20:37
 * 
 */
public interface VoteState {

	public void vote(String user,String voteItem,VoteManager voteManager);
	
	
}
 