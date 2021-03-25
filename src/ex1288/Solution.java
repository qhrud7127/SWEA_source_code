package ex1288;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int nk;														//배수
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {	
			int k=1;												//곱하는 수
			int N = sc.nextInt();									//입력받는 N
			char[] letters;											//숫자 한글자 배열
			ArrayList<Character> list = new ArrayList<Character>();	//letters 중복제거 후 0~9 까지 저장
 			while(true) {
				nk = N*k;											//주어진수 * 곱하는수
				letters = Integer.toString(nk).toCharArray();		//한자씩 배열에 입력
				for (int i = 0; i < letters.length; i++) {
					if(!list.contains(letters[i])){					//중복되지 않으면
						list.add(letters[i]);						//list에 추가
					}		
				}
				if(list.size() == 10) {								//0~9 까지 10개면 while 탈출
					break;
				}
				k++;												//곱하는수 ++
			}
			sb.append("#"+tc+" "+nk+"\n");
		}
		System.out.println(sb);
	}
}
