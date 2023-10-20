package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf_1_5 {
	// 문장 속 단어
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
		char[] cArr = str.toCharArray();
		int lt = 0;
		int rt = str.length();
		while(lt > rt) {
			if((cArr[lt] >= 65 && cArr[lt] <= 90) || (cArr[lt] >= 97 && cArr[lt] <= 122)) {
				
			} else {
				lt++;
			}
			
			if((cArr[rt] >= 65 && cArr[rt] <= 90) || (cArr[rt] >= 97 && cArr[rt] <= 122)) {
				
			} else {
				rt--;
			}
			
			char tmp = cArr[lt];
			cArr[lt] = cArr[rt];
			cArr[rt] = tmp;
			lt++;
			rt--;
		}
		String result = String.valueOf(cArr);
		System.out.println(result);
	}
}