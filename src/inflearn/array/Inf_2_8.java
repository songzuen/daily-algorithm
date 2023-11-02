package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_8 {
	// 등수 구하기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		int[] arr = new int[cnt];
 		for(int i = 0;i < cnt; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
 		int[] rstArr = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			int rst = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[i]) rst++;		// 모든 배열과 비교하여 rst++
			}
			rstArr[i] = rst;
		}
		
		for(int i = 0; i < rstArr.length; i++) System.out.print(rstArr[i] + " ");
	}
}
