import java.util.*;

public class b_2857 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		
		String[] a = new String[5];

		for(int i=0; i<5; i++) {
			a[i] = s.nextLine();
			
			if(a[i].contains("FBI")) {
				System.out.print(i+1 + " ");
				count++;
			}
		}
		if(count == 0)
			System.out.println("HE GOT AWAY!");
	}
}
