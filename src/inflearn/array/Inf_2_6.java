package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_6 {
	// 뒤집은 소수
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		int[] rstArr = new int[len];
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			rstArr[i] = Integer.parseInt(sb.reverse().toString());		// 뒤집은 소수 arr
		}
		
		for(int j = 0; j < rstArr.length; j++) {
			int cnt = 0;
			// 나머지가 0인 경우(몫으로 나눠떨어지는 경우) cnt++ 
			for(int k = 2; k < rstArr[j]; k++) {
				if(rstArr[j] % k == 0) cnt++;
			}
			// 소수이면서 값이 1보다 크면 list add
			if(cnt == 0 && rstArr[j] > 1) list.add(rstArr[j]);
		}
		
		for(int result : list) {
			System.out.print(result + " ");
		}
	}
}
