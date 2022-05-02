import java.util.Scanner;

//사분면 고르기

public class b_14681 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		if (n1 >0 && n2>0)     		  //n1이 양수, n2가 양수
			System.out.println(1);
		else if (n1<0 && n2>0)		  //n1이 음수, n2가 양수
			System.out.println(2);
		else if (n1<0 && n2<0)	      //n1이 음수, n2가 음수
			System.out.println(3);
		else						  //n1이 양수, n2가 음수
			System.out.println(4);
	}

}
