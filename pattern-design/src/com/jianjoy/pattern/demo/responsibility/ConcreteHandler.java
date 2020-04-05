package com.jianjoy.pattern.demo.responsibility; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午4:46:20
 * 
 */
public class ConcreteHandler extends Handler{

	/* (non-Javadoc)
	 * @see com.demo.practice.responsibility.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if(getSuccessor()!=null){
			System.out.println("放过请求");
			getSuccessor().handleRequest();
		}else{
			System.out.println("处理请求成功");
		}
		
	}

}
 