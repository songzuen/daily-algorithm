package inflearn.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class inf_3_3 {
	// 최고매출
	// sliding window
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		int totDays = Integer.parseInt(arr[0]);
		int selDays = Integer.parseInt(arr[1]);
		
		String[] sales = br.readLine().split(" ");			// 매출 array
		
		int sum = 0, result = 0;							// selDays의 합, 최대값
		for(int i = 0; i < selDays; i++) {
			sum += Integer.parseInt(sales[i]);
		}
		
		result = sum;
		
		for(int j = selDays; j < totDays; j++) {
			// seldays의 매출 합 + 다음날의 매출 - 기존 값
			// selDays가 3일 때, 0일~2일까지의 매 합 + 3일 매출 - 0일의 매출 
			sum += Integer.parseInt(sales[j]) - Integer.parseInt(sales[j-selDays]);
			// 1)
//			if(result < sum) {
//				result = sum;
//			}
			// 2)
			result=Math.max(result, sum);
		}
		
		System.out.println(result);
	}
}
