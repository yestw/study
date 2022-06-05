import java.util.Scanner;

//직각삼각형

public class b_4153 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = 1, b = 1, c = 1;
		
		while (true) {
		a = s.nextInt(); //6
		b = s.nextInt(); //8
		c = s.nextInt(); //10
		
		if( a == 0 && b == 0 && c == 0)
			break;
		else if((a*a) + (b*b) == c*c)
			System.out.println("right");
		else if (b*b + c*c == a*a)
			System.out.println("right");
		else if (a*a + c*c == b*b)
			System.out.println("right");
		else
			System.out.println("wrong");
		}
	}
}
