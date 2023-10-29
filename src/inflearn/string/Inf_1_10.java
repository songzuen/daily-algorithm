package inflearn.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Inf_1_10 {
	// 가장 짧은 문자거리
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		
		char[] str = strArr[0].toCharArray();
		char t = strArr[1].charAt(0);
		
		int[] indexArr = new int[str.length];
		int p = 1000;
		for(int i = 0; i < str.length; i++) {
			if(str[i] == t) {
				p = 0;
			} else {
				p++;
			}
			indexArr[i] = p;
		}
		
		int q = 1000;
		for(int j = str.length - 1; j >= 0; j-- ) {
			if(str[j] == t) {
				q = 0;
			} else {
				q++;
				indexArr[j] = Math.min(indexArr[j], q);
			}
		}
		
		for(int k : indexArr) {
			System.out.print(k + " ");
		}
	}
}