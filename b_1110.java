import java.util.Scanner;

//더하기 사이클

public class b_1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); //26
		int n4 = n; //26
		int count = 0;
		
		do {		//26	60	8	//68	14
			n =((n%10)*10) + ((n/10+n%10)%10) ;	//8
			
			count+=1;
		} while (n4 != n);
		
		System.out.println(count);
	}
}
