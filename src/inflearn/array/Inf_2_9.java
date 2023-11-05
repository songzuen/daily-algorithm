package inflearn.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf_2_9 {
	// 격자판 최대합
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
		
//		1)
//		int maxValue = 0;		// 최대합
//		
//		int leftDia = 0;		// 대각선(좌측 상단 -> 우측 하단)의 합
//		int maxHorizon = 0;		//수평의 합 최대값
//		for(int i = 0; i < arr.length; i++) {
//			int sumHorizon = 0;
//			for(int j = 0; j < arr[i].length; j++) {
//				if(i == j) {
//					leftDia += arr[i][j];
//				}
//				sumHorizon += arr[i][j];
//			}
//			maxHorizon = sumHorizon > maxHorizon ? sumHorizon : maxHorizon;
//		}
//		
//		maxValue = leftDia > maxHorizon ? leftDia : maxHorizon;
//		
//		int maxVertical = 0;	// 수직 합의 최대값
//		for(int j = 0; j < len; j++) {
//			int sumVertical = 0;
//			for(int i = 0; i < len; i++) {
//				sumVertical += arr[i][j];
//			}
//			maxVertical = sumVertical > maxVertical ? sumVertical : maxVertical;
//		}
//		maxValue = maxValue > maxVertical ? maxValue : maxVertical;
//		
//		int rightDia = 0;		// 대각선(좌측 하단 -> 우측 상단)의 합
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = arr[i].length - 1; j >= 0; j--) {
//				if(i + j == arr.length - 1) {
//					rightDia += arr[i][j];
//				}
//			}
//		}
//		maxValue = maxValue > rightDia ? maxValue : rightDia;
//		System.out.println(maxValue);
		
//		2)
		int answer = Integer.MIN_VALUE;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;				// 1-행의 합, 2-열의 합, 3,4 - 대각선의 합
		for(int i = 0; i < len; i++) {
			sum1 = sum2 = 0;				// 초기화
			for(int j = 0; j < len; j++) {
				sum1 += arr[i][j];			// 행의 합
				sum2 += arr[j][i];			// 열의 합
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
			
			sum3 += arr[i][i];
			sum4 += arr[i][len-i-1]; 
		}
		
		answer = Math.max(answer, sum3);
		answer = Math.max(answer, sum4);
		
		System.out.println(answer);
	}
}
