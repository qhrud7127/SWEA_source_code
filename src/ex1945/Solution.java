package ex1945;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();		//sb.append
		int N;
		int left=0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for (int tc = 1; tc <= T ; tc++) {
			N = sc.nextInt();
			while(N !=1) {	
				while(true) {		//2로 나누어지지 않을때까지 나눔
					left = N%2;
					if(left==0) {
						N = N/2;
						a++;
					}
					else {
						break;
					}
				}
				while(true) {		//3로 나누어지지 않을때까지 나눔
					left = N%3;
					if(left==0) {
						N = N/3;
						b++;
					}
					else {
						break;
					}
				}
				while(true) {		//5로 나누어지지 않을때까지 나눔
					left = N%5;
					if(left==0) {
						N = N/5;
						c++;
					}
					else {
						break;
					}
				}
				while(true) {		//7로 나누어지지 않을때까지 나눔
					left = N%7;
					if(left==0) {
						N = N/7;
						d++;
					}
					else {
						break;
					}
				}
				while(true) {		//11로 나누어지지 않을때까지 나눔
					left = N%11;
					if(left==0) {
						N = N/11;
						e++;
					}
					else {
						break;
					}
				}
				sb.append("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e+"\n");
				a=0;
				b=0;
				c=0;
				d=0;
				e=0;
			}
		}
		System.out.println(sb);
	}
}
