package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_2_3 {
	// 가위바위보
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		String str = br.readLine();

		String[] strArr1 = new String[cnt];
		for(int i = 0; i < cnt; i++) {
			strArr1[i] = String.valueOf(str.charAt(i));
		}
		

		String str2 = br.readLine();
		String[] strArr2 = new String[cnt];
		for(int i = 0; i < cnt; i++) {
			strArr2[i] = String.valueOf(str2.charAt(i));
		}
		
		for(int i = 0; i < cnt; i++) {
			if(strArr1[i].equals(strArr2[i])) System.out.println("D");									// 비김 
			else if("1".equals(strArr1[i]) && "3".equals(strArr2[i])) System.out.println("A");			// A가 가위로 이김
			else if("2".equals(strArr1[i]) && "1".equals(strArr2[i])) System.out.println("A");			// A가 바위로 이김
			else if("3".equals(strArr1[i]) && "2".equals(strArr2[i])) System.out.println("A");			// A가 보로 이김
			else System.out.println("B");																// A가 짐
		}
	}
}
