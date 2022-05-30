import java.util.Scanner;

public class b_10824 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		String aa = Integer.toString(a);
		String bb =	Integer.toString(b);
		String ab = aa+bb;
		String cc = Integer.toString(c);
		String dd =	Integer.toString(d);
		String cd = cc+dd;
		
		long sum = Long.parseLong(ab)+Long.parseLong(cd);
		
		System.out.println(sum);
	}

}
