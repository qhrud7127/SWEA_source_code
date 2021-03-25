package ex1284;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		int price;
		for (int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			price = 0;
			if (W>R) {
				if((Q+(W-R)*S)<P*W) {
					price = Q+(W-R)*S;
				}
				else {
					price = P*W;
				}
			}
			else {
				if(Q<P*W) {
					price = Q;
				}
				else {
					price = P*W;
				}
			}
			sb.append("#"+tc+" "+price+"\n");
		}
		System.out.println(sb);
	}
}
