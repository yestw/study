import java.util.Scanner;

public class b_10871 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int num2 = s.nextInt();
		
		for(int i = 0; i < num; i++) {
			int num3 = s.nextInt();
			if(num2 >num3)
				System.out.print(num3+" ");
		}
		
	}

}
