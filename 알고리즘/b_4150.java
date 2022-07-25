import java.math.BigInteger;
import java.util.Scanner;

public class b_4150 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		BigInteger[] arr=new BigInteger[n];
		arr[0] = BigInteger.valueOf(1);
		if(n>1) 
			arr[1] = BigInteger.valueOf(1);
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
		System.out.print(arr[n-1]);
	}
}
