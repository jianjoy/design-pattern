package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:47:54
 * 
 */
public class VoteClient {

	public static void main(String[] args) {
		
		VoteManager vm = new VoteManager();
		
		for(int i=0;i<9;i++){
			vm.vote("u1", "A");
		}
		
		
		
	}
	
	
	
}
 