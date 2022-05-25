import java.util.Scanner;

public class b_14730 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sum = 0;
		int n1, n2;
		
		for(int i = 1; i <= n; i++) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			
			sum += n1*n2;
		}
		System.out.println(sum);

	}

}
