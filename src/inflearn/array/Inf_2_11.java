package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inf_2_11 {
	// 임시반장정하기
//5
//2 3 1 7 3
//4 1 9 6 8
//5 5 2 4 4
//6 5 2 6 7
//8 4 2 2 2

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());		// 학생 수
		int [][] student = new int[len+1][6];
		
		for(int i = 1; i <= len; i++) {
			String[] classArr = br.readLine().split(" ");
			
			for(int j = 0; j < 5; j++) {
				student[i][j+1] = Integer.parseInt(classArr[j]); 
			}
		}
		
		int studentNumb = 0;		// 학생번호
		int max = 0;				// 같은 반 횟수 최댓값
		for(int i = 1; i <= len; i++) {			// i = 학생 수
			// 같은 반 횟수
			int cnt = 0;
			for(int j = 1; j <= len; j++) {		//i랑 같은 반인 j번 학생은 몇명인지	 j = 학생 수
				
				for(int k = 1; k <= 5; k++) {	// j번 학생과 i번 학생과 같은 반인지 확인  k = 학년 수
					if(student[i][k] == student[j][k]) {
						cnt++;
						break;			// 다른 학년에서도 같은 반인 경우 중복 예외 처리
					}
				}
				if(cnt > max) {
					max = cnt;
					studentNumb = i;
				}
			}
		}
		System.out.println(studentNumb);
	}
}
