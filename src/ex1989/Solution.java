package ex1989;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		char letters[] =null;									//문자 배열
		int result = 0;
		for (int tc = 1; tc <= T; tc++) {
			String word = sc.next();
			letters = word.toCharArray();						//단어 잘라서 배열입력
			
			for (int i = 0; i < letters.length; i++) {
				if(letters[i] == letters[letters.length-1-i]) {	//letters.length-1-i 배열 거꾸로 비교하는 조건
					result = 1;
				}
				else {
					result = 0;
					break;										// 한번이라도 실패시 0 리턴
				}
				
			}
			sb.append("#"+tc+" "+result+"\n");
		}
		System.out.println(sb);
	}
}
