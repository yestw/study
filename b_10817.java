import java.util.Scanner;

//세 수

public class b_10817 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a >= b && b >= c)
			System.out.println(b);
		else if(c >= b && b >= a)
			System.out.println(b);
		else if(a >= c && c >= b)
			System.out.println(c);
		else if(b >= c && c >= a)
			System.out.println(c);
		else if(c >= a && a >= b)
			System.out.println(a);
		else if(b >= a && a >= c)
			System.out.println(a);
		
	}

}
