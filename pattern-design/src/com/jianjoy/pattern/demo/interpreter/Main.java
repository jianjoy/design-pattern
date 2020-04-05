package com.jianjoy.pattern.demo.interpreter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午11:10:29
 * 
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		//(a*b)/(a-b+15000)
		Context context = new Context();
		Variable a = new Variable();
		Variable b = new Variable();
		Constant c = new Constant(15000);
		context.addValue(a, 14);
		context.addValue(b, 10000);
		Expression expression = new Div(new Mul(a, b), new Add(new Sub(a,b), c));
		System.out.println("Result = "+expression.interpret(context));
		
	}

}
 