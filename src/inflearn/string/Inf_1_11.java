package inflearn.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_11 {
	// 문자열 압축
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine()+" ";
		
		int cnt = 1;
		
		String result = "";
		
		for(int i = 0; i < str.length() -1; i++) {
			if(str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				result += String.valueOf(str.charAt(i));
				if(cnt > 1) {
					result += cnt;
				}
				cnt = 1; 
			}
		}
		System.out.println(result);
	}
}