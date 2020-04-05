package com.jianjoy.pattern.demo.state; 

import java.util.HashMap;
import java.util.Map;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:21:32
 * 
 */
public class VoteManager {

	private VoteState state = null;
	
	private Map<String,String> mapVote = new HashMap<>();
	
	
	private Map<String,Integer> mapVoteCount = new HashMap<>();
	
	
	/**
	 * @return the mapVote
	 */
	public Map<String, String> getMapVote() {
		return mapVote;
	}
	
	
	public void vote(String user,String voteItem){
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount==null){
			oldVoteCount = 0;
		}
		oldVoteCount++;
		mapVoteCount.put(user, oldVoteCount);
		
		if(oldVoteCount==1){
			state = new NormalVoteState();
		}
		else if(oldVoteCount>1 && oldVoteCount<5){
			state = new RepeatVoteState();
		}
		else if(oldVoteCount>=5 && oldVoteCount<8){
			state = new SpiteVoteState();
		}else if(oldVoteCount> 8 ){
			state = new BlackVoteState();
		}
		state.vote(user, voteItem, this);
	}
	
	
	
	
}
 