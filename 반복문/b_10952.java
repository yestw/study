import java.util.Scanner;

public class b_10952 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		do {
			int a = s.nextInt();
			int b = s.nextInt();
			sum = a+b;
			if(sum>0)
				System.out.println(sum);
			if(a==0&&b==0)
				break;
		} while (true);
	}

}
