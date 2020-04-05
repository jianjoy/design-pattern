package com.jianjoy.pattern.demo; 

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月20日 下午5:51:33
 * 
 */
public class ShowOptionPane {

	
	public static void main(String[] args) {
		
		
		Font font = new Font("Dialog",Font.PLAIN,18);
		UIManager.put("Button.font", font);
		UIManager.put("Label.font", font);
		
		
		int option;
		do{
			option = JOptionPane.showConfirmDialog(null, "Had enough?","A Stubborn Dialog",JOptionPane.YES_NO_OPTION);
		}while(option == JOptionPane.NO_OPTION);
		
	}
	
	
	
}
 