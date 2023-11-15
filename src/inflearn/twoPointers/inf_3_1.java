package inflearn.twoPointers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class inf_3_1 {
	// 두 배열 합치기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len1 = Integer.parseInt(br.readLine());
		String[] arr1 = br.readLine().split(" ");
		
		int len2 = Integer.parseInt(br.readLine());
		String[] arr2 = br.readLine().split(" ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int p1 = 0, p2 = 0;
		while(p1 < len1 && p2 < len2) {
			if(Integer.parseInt(arr1[p1]) < Integer.parseInt(arr2[p2])) {
				arr.add(Integer.parseInt(arr1[p1++]));
			} else {
				arr.add(Integer.parseInt(arr2[p2++]));
				
			}
		};
		while(p1 < len1) arr.add(Integer.parseInt(arr1[p1++]));
		while(p2 < len2) arr.add(Integer.parseInt(arr2[p2++]));
		
		for(int i = 0; i < arr.size(); i++) {
			
			System.out.print(arr.get(i)+ " ");
		}
	}
}
