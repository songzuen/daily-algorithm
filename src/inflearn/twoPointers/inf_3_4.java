package inflearn.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class inf_3_4 {
	// 연속 부분 수열
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		int length = Integer.parseInt(arr[0]);
		int value =  Integer.parseInt(arr[1]);
		
		String[] array = br.readLine().split(" ");
		
		int result = 0;
		int sum = 0;
		int t = 0;
		for(int i = 0; i < length; i++) {
			sum += Integer.parseInt(array[i]);
			if(sum == value) {
				result++;
			}
			while(sum>=value){
				sum -= Integer.parseInt(array[t++]);
				if(sum==value) result++; 
			}
		}

		System.out.println(result);
	}
}
