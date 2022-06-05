import java.util.Scanner;

public class b_2439 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int a = num-2;
		
		for(int i = 0 ; i < num; i++) {
			for(int j =0; j<num; j++) {
				if(j>a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			a--;
			System.out.println();
    }
	}
}
