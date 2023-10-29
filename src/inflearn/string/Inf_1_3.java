package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf_1_3 {
	// 문장 속 단어
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String result = "";
		
//		1)
//		String[] strArr = br.readLine().split(" ");
//		int index = 0;			// 긴 단어를 가진 index
//		for(int i = 0; i < strArr.length; i++) {
//			String str = strArr[i];		// 단어
//			int length = str.length();	// 단어 길이
//			
//			// 현재 index 단어 길이와 단어 array 중에 가장 긴 단어의 index 값 비교
//			if(length > strArr[index].length()) {
//				index = i;				// 현재 index 단어의 길이가 길면 변수에 현재 index 값 넣기
//			}
//		}
//		System.out.println(strArr[index]);
		
//		2)
//		String[] strArr = br.readLine().split(" ");
//		int m = Integer.MIN_VALUE;
//		for(String str : strArr) {
//			int len = str.length();
//			if(len > m) {
//				m=len;
//				result=str;
//			}
//		}
//		System.out.println(result);
		
//		3)
		// 띄어쓰기가 없어질 때까지 쪼갬
		String str = br.readLine();
		int m = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);		// 띄어쓰기 직전까지 잘라냄
			int len = tmp.length();
			
			if(len > m) {
				m = len;
				result = tmp;
			}
			str = str.substring(pos + 1);
		}
		//마지막 단어는 공백 문자가 없어서 while을 타지 못함
		if(str.length() > m) result = str;
		
		System.out.println(result);
	}
}