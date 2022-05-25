import java.util.Scanner;

//팩토리얼

public class b_10872 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int fac  = 1;
		
		for (int i = 1; i <=n; i++) {
			fac *= i;
		}
		System.out.println(fac);

		
	}

}
