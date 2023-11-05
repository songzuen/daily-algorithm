package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_10 {
	// 봉우리

	// 방향 배열 생성
//	int[] dx = {-1, 0 , 1, 0};		// 상 하 좌 우
//	int[] dy = {0, 1, 0, -1};
	// 삼중포문(이중배열 기준 상하좌우값 비교)
//	int nx = i + dx[k]			// 행값
//	int ny = j + dy[k]			// 열값

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		int[][] arr = new int[len][len];
		
		for(int i = 0; i < len; i++) {
			String[] indexStr = br.readLine().split(" ");
			for(int j = 0; j < indexStr.length; j++) {
				arr[i][j] = Integer.parseInt(indexStr[j]);
			}
		}
		int[] dx = {-1, 0 , 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int cnt = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				boolean flag = true;
				
				//상하좌우 값 비교
				for(int k = 0; k < dx.length; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx >= 0 && nx < len && ny >= 0 && ny < len && arr[nx][ny] >= arr[i][j]) {
//						경계선 비교시 out of Index exceptin 처리
//						arr[nx][ny] 값이 기준값(arr[i][j]) 보다 큰 경우 false 처리
						flag = false;
						break;
					}
				}
				if(flag) cnt++;
			}
		}
		System.out.println(cnt);
	}
}
