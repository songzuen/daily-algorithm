package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_7 {
	// 점수 계산
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int result = 0;
		int tmp = 0;		// 틀린 문제 발견시 초기화 되는 임시 값 
		for(int i = 0; i < cnt; i++) {
			int answer = Integer.parseInt(String.valueOf(input.charAt(i)));
			
			if(answer > 0) tmp++;
			else tmp = 0;

			result += tmp;
		}
		
		System.out.println(result);
	}
}
