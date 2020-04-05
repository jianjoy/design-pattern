package com.jianjoy.pattern.demo; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2017年6月29日 上午11:33:29
 * 
 */
public class IpParser {

	
	public static void main(String[] args) throws Exception {
		
		Map<String,AtomicInteger> data = new HashMap();
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("ip_20170622_us_new.txt"))));
		while((line=br.readLine())!=null){
			String ip = line.trim().replace(".0/24", "").trim();
			data.put(ip, new AtomicInteger());
		}
		br.close();
		
		
		BufferedReader nbr =  new BufferedReader(new InputStreamReader(new FileInputStream(new File("conversion_ip.txt"))));
		while((line=nbr.readLine())!=null){
			//172.56.34.120
			String ip = line.trim();
			int lastIndex = ip.lastIndexOf(".");
			String formatIp = ip.substring(0,lastIndex);
			AtomicInteger counter = data.get(formatIp);
			if(counter!=null){
				int c = counter.incrementAndGet();
//				System.out.println(ip+","+c);
				
			}
		}
		nbr.close();
//		System.out.println(data);
		
		for(String k:data.keySet()){
			AtomicInteger i = data.get(k);
			if(i.get()>0){
				System.out.println(k+","+i.get());
			}
		}
	}
	
}
 