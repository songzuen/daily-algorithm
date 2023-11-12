package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_12 {
	// 멘토링
//4 3
//3 4 1 2
//4 3 2 1
//3 1 4 2
	// 행 = 등수 / 열 = 테스트 번호
	// 3 4 1 2인 경우 3번학생 1등 4번학생 2등 1번학생 3등 2번학생 4등
	// For(학생수)ㄹor(학생수) For(테스트 수)for(등수)
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int len = Integer.parseInt(str[0]);				// 학생 수
		int exCnt = Integer.parseInt(str[1]);			// 시험 수
		int[][] arr = new int[exCnt][len];
		
		for(int i = 0; i < exCnt; i++) {
			String[] gradeStr = br.readLine().split(" ");
			for(int j = 0; j < len; j++) {
				arr[i][j] = Integer.parseInt(gradeStr[j]);
			}
		}
		int result = 0;
		for(int i = 1; i <= len; i++) {
			for(int j = 1; j <= len; j++) {
				int cnt = 0;
				for(int k = 0; k < exCnt; k++) {
					int pi = 0, pj = 0;
					for(int s = 0; s < len; s++){
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==exCnt){
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
