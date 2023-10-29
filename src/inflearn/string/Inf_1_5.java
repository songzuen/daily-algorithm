package inflearn.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_1_5 {
	// 특정 문자 뒤집기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
//		char[] arr = new char[str.length()];
//		String result = str;
//		
//		int index = 0;
//		for(char c : str.toCharArray()) {
//			if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
//				arr[(str.length() - 1) - index] = c;
//			} else {
//				arr[index] = c;
//			}
//			index++;
//		}
//		for(char x : arr) {
//			result += x;
//		}
//		System.out.println(result)
		
//		2)
//		char[] cArr = str.toCharArray();
//		int lt = 0;
//		int rt = str.length() - 1;
//		while(lt < rt) {
//			for(int i = lt; i < str.length(); i++) {
//				if((cArr[lt] >= 65 && cArr[lt] <= 90) || (cArr[lt] >= 97 && cArr[lt] <= 122)) {
//					break;
//				} else {
//					lt++;
//				}
//			}
//			
//			for(int j = rt; j >= 0; j--) {
//				if((cArr[rt] >= 65 && cArr[rt] <= 90) || (cArr[rt] >= 97 && cArr[rt] <= 122)) {
//					break;
//				} else {
//					rt--;
//				}
//			}
//			
//			char tmp = cArr[lt];
//			cArr[lt] = cArr[rt];
//			cArr[rt] = tmp;
//			lt++;
//			rt--;
//		}
//		String result = String.valueOf(cArr);
//		System.out.println(result);
		
//		3)
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) {				// 알파벳 여부 확인
				lt++;
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		String result = String.valueOf(s);
		System.out.println(result);
		
	}
}