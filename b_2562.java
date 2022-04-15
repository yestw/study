import java.util.Scanner;

public class b_2562 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[9];
		int max = 0;
		int maxth = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(s.nextLine());
			if(a[i] > max) {
				max = a[i];
				maxth = i+1;
			}
		}
		System.out.println(String.format("%d %d", max, maxth));
	}
}
