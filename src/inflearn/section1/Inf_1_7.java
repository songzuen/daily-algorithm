package inflearn.section1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_7 {
	// 회문 문자
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
//		1)
//		char[] c = (str.toUpperCase()).toCharArray();
//		int lt = 0, rt = str.length() - 1;
//		
//		boolean isSame = false;
//		while(lt < rt) {
//			if(c[lt] == c[rt]) {
//				isSame = true;
//			} else {
//				isSame = false;
//			}
//			lt++;
//			rt--;
//		}
//		System.out.println(isSame ? "YES" : "NO");
		
//		2)
//		str = str.toUpperCase();
//		int len = str.length();
//		
//		String result = "YES";
//		
//		for(int i = 0; i < len / 2; i++) {
//			if(str.charAt(i) != str.charAt( len - i - 1)) result = "NO";
//		}
//		
//		System.out.println(result);
		
//		3)
		String result = "YES";
		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(tmp)) result = "NO";
		
		System.out.println(result);
	}
}