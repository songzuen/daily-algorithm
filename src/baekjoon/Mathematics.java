package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mathematics {


	public static void main(String[] args) throws Exception {
//		quest2753();
//		quest11720();
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
}
