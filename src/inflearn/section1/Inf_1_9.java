package inflearn.section1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_9 {
	// 숫자만 추
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
//		1)
//		int answer = 0;
//		
//		// 자연수 아스키번호 48('0') ~ 57('9')
//		for(char c : str.toCharArray()) {
//			if(c >= 48 && c <= 57) {
//				answer = answer * 10 + (c - 48);
//			}
//		}
//		System.out.println(answer);
		
//		2)
		String answer = "";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) answer += c;
		}
		System.out.println(Integer.parseInt(answer));
	}
}