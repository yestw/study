import java.util.Scanner;
//R2
public class b_3046 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//R1, R2
		//두수의 평균 S = (R1+R2)/2
		//R1과 S를 통해 R2를 구하는 문제
		//2*S = R1+R2
		//2*S-R1 = R2
		
		int R1 = s.nextInt();
		int S = s.nextInt();
		int R2 = 2*S - R1;
		System.out.println(R2);
	}
}
