package codeup;

import java.util.Scanner;

//구구단 출력하기

public class solve_1351 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		//a부터 b까지의 구구단 출력
		if (a < b) {
			for (int i = a; i <= b; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(String.format(" %d * %d = %d", i, j, i * j));
				}
				System.out.println();
			}
		} 
		// b부터 a까지의 구구단 출력
		else if (a > b) {
			for (int i = b; i <= a; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(String.format(" %d * %d = %d", i, j, i * j));
				}
				System.out.println();
			}
		}
		// a와 b 같을경우 그 숫자의 구구단만 출력
		else {
			for (int i = a; i <= b; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(String.format(" %d * %d = %d", i, j, i * j));
				}
				System.out.println();
			}
		}
	}

}
