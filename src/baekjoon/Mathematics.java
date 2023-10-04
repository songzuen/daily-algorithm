package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mathematics {


	public static void main(String[] args) throws Exception {
		quest1000();
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
}
