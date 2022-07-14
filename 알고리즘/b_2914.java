package baekjoon;

import java.util.Scanner;

//저작권

public class b_2914 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//  저작권이 있는 멜로디의 개수 / 앨범에 수록된 곡의 개수 = 평균값
		// 894 / 38
		
//		int melody = s.nextInt();
//		int song = s.nextInt();
//		double avg = (double)melody/song;
//		
//		System.out.format("%.0f", avg);
    
    
// 곡의 개수, 평균으로 저작권이 있는 멜로디의 개수 구하기
		int song = s.nextInt();
		int avg = s.nextInt();
				
		int melody = (song*avg) - (song-1);
		System.out.println(melody);
	}
}
