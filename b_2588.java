import java.util.Scanner;

public class b_2588 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int n3 = a*(b%10);
		int n4 = a*((b%100)/10);
		int n5 = a*(b/100);
		
		int sum = 0;
		
		sum = a*b;
		
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(sum);

	}

}
