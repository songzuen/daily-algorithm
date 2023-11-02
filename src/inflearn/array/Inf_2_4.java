package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_2_4 {
	// 피보나치 수열
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		
		int a = 1, b = 1, c;
		String result = a + " " + b + " ";
		for(int i = 0; i < len - 2; i++) {
			c = a + b;
			result += c + " ";
			a = b;
			b = c;
		}
		System.out.println(result);
	}
}
