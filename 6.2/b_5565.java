import java.util.Scanner;

public class b_5565 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int sum = 0;
		
		for(int i = 0; i< 9; i++) {
			int b = s.nextInt();
			sum += b;
		}
		System.out.println(a-sum);

	}

}
