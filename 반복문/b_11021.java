import java.util.Scanner;

public class b_11021 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			sum = a+b;
			System.out.println("Case #"+i+": "+sum);
			
		}
	}
}
