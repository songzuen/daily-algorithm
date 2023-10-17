package inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_1 {
	// 1-1 문자찾기
	public static void main(String[] args) throws Exception {
//		quest1_1();
	}
	
	public static void quest1_1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		char t = (br.readLine()).toUpperCase().charAt(0);
		
		int cnt = 0 ;
//		for(int i = 0; i < str.length(); i++) {
//			if(t == str.charAt(i)) cnt++;
//		}
		
		for(char s : str.toCharArray()) {
			if(s == t) cnt++;
		}
		System.out.println(cnt);
	}
}
