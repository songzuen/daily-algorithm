package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf_2_1 {
	// 큰 수 출력하기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		int[] arr = new int[len];
		String[] strArr = br.readLine().split(" ");
		String result = "";
		
		for(int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		for(int i = 0; i < len; i++) {
			if((i-1) < 0) {
				result += arr[i] + " ";
			} else {
				if(arr[i] > arr[i-1]) result += arr[i] + " ";
			}
		}
		System.out.println(result);
	}
}
