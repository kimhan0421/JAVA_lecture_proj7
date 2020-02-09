package chap09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArraysToken {

	public static void main(String[] args) {
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		StringTokenizer str = new StringTokenizer(s,". ");
		int cnt = str.countTokens();
		System.out.println("단어 개수: " + cnt);
		
		String arr[] = new String[cnt];
		int i = 0;
		while(str.hasMoreTokens()) {
			arr[i] = str.nextToken();
			i++;
		}
		Arrays.sort(arr);

		System.out.println("정렬된 토큰: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ",");
		}

	}

}
