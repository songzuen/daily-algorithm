package inflearn.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_12 {
	// 암호
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		String result = "";
		
		for(int i = 0; i < cnt; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num=Integer.parseInt(tmp, 2);
			result+=(char)num;
			str = str.substring(7); 
		}
		System.out.println(result);
	}
}