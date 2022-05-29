import java.util.Scanner;

//공약수

public class b_5618 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n==2) {
			int a = s.nextInt();
			int b = s.nextInt();

				for(int i = 1; i<=a; i ++) 
					if(a%i ==0 && b%i ==0)
						System.out.println(i);
		}
		else if (n==3) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
				for(int i = 1; i <=a; i++) {
					if(a%i ==0 && b%i ==0 && c%i==0)
						System.out.println(i);
					}	
		}
	}
}