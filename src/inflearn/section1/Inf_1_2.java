package inflearn.section1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_1_2 {
	// 대소문자 변환
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		String result = "";
		
//		for(int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(Character.isUpperCase(c)){
//				result += (Character.toString(c)).toLowerCase();
//			} else {
//				result += (Character.toString(c)).toUpperCase();
//			}
//		}
		
		for(char c : str.toCharArray()) {
//			if(Character.isUpperCase(c)){		// 대문자
//				result += Character.toLowerCase(c);
//			} else {							// 소문자
//				result += Character.toUpperCase(c);
//			}
			
			// 아스키 number
			// 대문자 65 ~ 90 / 소문자 97 ~ 122
			if(c >= 65 && c <= 90) {			// 대문자
				result += (char)(c+32);				// 소문자로 치환 및 형변환 처리
			} else if (c >= 97 && c <= 122) {	// 소문자
				result += (char)(c-32);				// 대문자로 치환
			}
		}
		System.out.println(result);
	}
}
