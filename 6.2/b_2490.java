import java.util.Scanner;

public class b_2490 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 3; i ++) {
			int sum = 0;
			for(int j =0; j <4; j++ ) {
			int n = s.nextInt();
			sum += n;
			}
			if (sum == 0)		//윷
				System.out.println("D");
			else if (sum == 1)	//걸
				System.out.println("C");
			else if (sum == 2)	//개
				System.out.println("B");
			else if (sum == 3)	//도
				System.out.println("A");
			else if (sum == 4)	//모
				System.out.println("E");
		}
	}
}
