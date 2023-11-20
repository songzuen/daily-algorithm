package inflearn.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class inf_3_2 {
	// 공통원소구하기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len1 = Integer.parseInt(br.readLine());
		String[] arr1 = br.readLine().split(" ");
		
		int len2 = Integer.parseInt(br.readLine());
		String[] arr2 = br.readLine().split(" ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int p1 = 0, p2 = 0;
		while(p1 < len1 && p2 < len2) {
			if(Integer.parseInt(arr1[p1]) == Integer.parseInt(arr2[p2])) {
				arr.add(Integer.parseInt(arr1[p1++]));
				p2++;
			} else if(Integer.parseInt(arr1[p1]) < Integer.parseInt(arr2[p2])) {
				p1++;
			} else {
				p2++;
			}
		};
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+ " ");
		}
	}
}
