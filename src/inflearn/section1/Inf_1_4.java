package inflearn.section1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_1_4 {
	// 단어뒤집기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		1)
		int cnt = Integer.parseInt(br.readLine());
//		String result = "";
//		
//		for(int i = 0; i < cnt; i++) {
//			String str = br.readLine();
//			String reverse = "";
//			
//			for(int j = str.length(); j > 0; j--) {
//				reverse += str.charAt(j-1);
//			}
//			result += reverse + "\n";
//		}
//		System.out.println(result);
		
//		2)StringBuiler 사용하여 reverse 처리
//		String[] strArr = new String[cnt];
//		for(int i = 0; i < cnt; i++) {
//			strArr[i] = br.readLine();
//		}
//		
//		ArrayList<String> result = new ArrayList<>();
//		for(String str : strArr) {
//			//String 은 메소드 사용시 객체가 계속 생김 그 자체로 변경할 수 없어 객체를 새로 만들어서 사용
//			//StringBuilder는 String 연산이 많아지면 StringBuilder를 사용 기존 객체 그대로 사용
//			String tmp = new StringBuilder(str).reverse().toString();
//			
//			result.add(tmp);
//		}
//		
//		for(int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i));
//		}
		
//		3)
		String[] strArr = new String[cnt];
		for(int i = 0; i < cnt; i++) {
			strArr[i] = br.readLine();
		}
		
		ArrayList<String> result = new ArrayList<>();
		for(String str : strArr) {
			char[] c = str.toCharArray();
			int lt = 0;
			int rt = str.length() - 1;
			
			while(lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}

			// valueOf는 static Method
			String tmp = String.valueOf(c);
			result.add(tmp);
			
			for(int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
	}
}