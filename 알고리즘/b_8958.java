package baekjoon;

import java.util.Scanner;

public class b_8958 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num = Integer.parseInt(s.nextLine());
		String str;
		
		for(int i=0; i<num; i++) {
			str = s.nextLine();
			int count=0;
			int sum=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) =='O') {
					count++;
					sum+=count;
				}
				else count=0;
				
			}
			System.out.println(sum);	
		}
	}
}
