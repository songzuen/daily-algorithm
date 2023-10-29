package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_2 {
	// 보이는 학생
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		int cnt = 1;
		
		int len = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		
		for(int i = 0; i < len; i++) {
			arr.add(Integer.parseInt(strArr[i]));
		}
		
		int max = arr.get(0);			// 0번째 아이를 최댓값으로 설정
		for(int i = 1; i < len; i++) {
			if(arr.get(i) > max) {
				cnt++;
				max = arr.get(i);		// 다음 아이들이 max 값보다 크면 max 값 변경
			}
		}
		System.out.println(cnt);
	}
}
