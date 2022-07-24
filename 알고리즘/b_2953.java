import java.util.Scanner;

public class b_2953 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		int temp=0;
		int maxth=0;
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<4;j++) {
				n = s.nextInt();
				sum+=n;
				if(sum > temp) {
					temp = sum;
					maxth = i;
				}
			}
		}
		System.out.println(maxth+1+ " " +temp);
	}
}
