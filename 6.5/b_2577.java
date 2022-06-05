import java.util.Scanner;

//숫자의 갯수

public class b_2577 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int mul = a*b*c; //총합
		String Strsum = Integer.toString(mul); //총합문자열로 바꿈
		
		for (int i = 0; i < 10; i++) {	//문자열 길이만큼 반복
			int count = 0;
			
			for(int j = 0; j < Strsum.length(); j++) { //
				if(Strsum.charAt(j)-'0'== i)
					count++;
			}
			System.out.println(count);
		}
	}
}
