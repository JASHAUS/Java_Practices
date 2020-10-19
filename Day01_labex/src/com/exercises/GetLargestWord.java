package com.exercises;

import java.util.StringTokenizer;

public class GetLargestWord {

	public static String lengthiestString(String s1) {
		int max = 0;
		String s2 = new String();
		StringTokenizer token = new StringTokenizer(s1, " ");
		while (token.hasMoreTokens()) {
			String s3 = token.nextToken();
			int n = s3.length();
			if (n > max) {
				max = n;
				s2 = s3;
			}
		}
		return s2;
	}

}
