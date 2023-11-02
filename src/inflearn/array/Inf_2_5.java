package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_2_5 {
	// 소수(에라토스테네스 체)
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		int[] array = new int[len+1];
		
		int cnt = 0;
		for(int i = 2; i < len + 1; i++) {
			if(array[i] == 0) {
				cnt++;
				for(int j = i; j < len + 1; j += i) {
					array[j]=1;
				}
			}
		}
		System.out.println(cnt);
	}
}
