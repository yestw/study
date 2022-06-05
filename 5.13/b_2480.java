import java.util.Scanner;

//주사위 세개

public class b_2480 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt(); //첫번째 주사위
		int n2 = s.nextInt(); //두번째 주사위
		int n3 = s.nextInt(); //세번째 주사위
		int max = 0;		  //
		
		if(n1 == n2 && n2==n3 && n1==n3) { //주사위 숫자가 모두 똑같은 경우
			int a = n1;
			System.out.println(10000 +a*1000);
		}
		else if (n1 == n2 || n2==n3 || n1==n3) { //주사위 3개중 2개만 같은 경우
			if(n1 == n2) {
				int a1 = n1;
				System.out.println(1000 + a1*100);
			}
			else if (n2 == n3) {
				int a2 = n2;
				System.out.println(1000 + a2*100);
			}
			else {
				int a3 = n3;
				System.out.println(1000 +a3*100 );
			}
		}
		else if (!(n1 == n2 && n2==n3 && n1==n3)) { //주사위 3개가 모두 다른경우
			if (n1>n2 && n1 >n3) {
				max = n1;
				System.out.println(max*100);
			}
			else if(n2 > n1 && n2 > n3) {
				max = n2;
				System.out.println(max*100);
			}
			else if(n3 > n1 && n3 > n2) {
				max = n3;
				System.out.println(max*100);
			}	
		}
	}
}
