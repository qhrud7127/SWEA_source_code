package ex1986;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		int j;
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			j = 0;
			for (int i = 1; i <= N; i++) {
				if(i%2==0) {
					j = j + i*(-1);
				}
				else {
					j=j+i;
				}
			}
			sb.append("#"+tc+" "+j+"\n");
		}
		System.out.println(sb);
	}
}
