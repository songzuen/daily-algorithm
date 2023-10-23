package inflearn.section1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_8 {
	// 유효한 팰린드롬
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
//		1)
//		String modStr = "";
//		String result = "";
//		
//		for(char c : str.toCharArray()) {
//			if(Character.isAlphabetic(c)) {
//				modStr += c;
//			}
//		}
//		
//		char[] cArr = modStr.toCharArray();
//		for(int i = 0; i < modStr.length() / 2; i++) {
//			if(cArr[i] == cArr[modStr.length() - 1 - i]) {
//				result = "YES";
//			} else {
//				result = "NO";
//				break;
//			}
//		}
//		
//		System.out.println(result);
		
//		2)
		String result = "NO";
		
		str = str.replaceAll("[^A-Z]", "");					// replacAll 정규식 사용 가능, replace는 정규식 사용 불가
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) result = "YES";
		
		System.out.println(result);
	}
}