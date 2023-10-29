package inflearn.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_6 {
	// 중복문자제거
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
//		1)
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for(char c : str.toCharArray()) {
//			set.add(String.valueOf(c));
//		}
//		String result = "";
//		
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			result += it.next();
//		}
//		
//		System.out.println(result);
		
//		2) indexOf 사용
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}
}