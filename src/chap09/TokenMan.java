package chap09;

import java.util.StringTokenizer;

public class TokenMan {

	public static void main(String[] args) {
		String data = "홍길동,남,65/김새영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165";
		double weight = 0;
		double count = 0;

		StringTokenizer str = new StringTokenizer(data, "/");
		while (str.hasMoreTokens()) {
			StringTokenizer str2 = new StringTokenizer(str.nextToken(),",");
			while (str2.hasMoreTokens()) {
				if (str2.nextToken().equals("남")) {
					count++;
					weight += Integer.parseInt(str2.nextToken());
				}
			}

		}
		System.out.println("몸무게 평균 : " + weight / count);
	}

}
