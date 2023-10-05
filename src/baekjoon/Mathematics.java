package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mathematics {


	public static void main(String[] args) throws Exception {
//		quest2753();
		quest2884();
	}

//	1000.A+B
	public static void quest1000() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		System.out.println(a+b);
	}
//	2753. 윤년
	public static void quest2753() throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int isLeapyear = 0;
		int year = Integer.parseInt(br.readLine());
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapyear = 1;	//윤년
		} else {
			isLeapyear = 0;
		}
		
		System.out.println(isLeapyear);
	}
	
	// 11720.
	public static void quest11720() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		int length = Integer.parseInt(br.readLine());
		String[] numArr = br.readLine().split("");
		
		for(int i = 0; i < length; i++) {
			sum += Integer.parseInt(numArr[i]);
		}
		
		System.out.println(sum);
	}
	
	// 2884. 알람 45분 빨리 맞추기
	public static void quest2884() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] hmm = br.readLine().split(" ");
		
		int h = Integer.parseInt(hmm[0]);		// 시
		int m = Integer.parseInt(hmm[1]);		// 분

		if(m < 45) {
			h--;
			m = 60 - (45 - m);
			if( h < 0) {
				h = 23;
			}
		} else {
			m = m - 45;
		}
		System.out.println(h+" "+m);
	}
}
