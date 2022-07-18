import java.util.Scanner;

//수도요금

public class b_10707 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//첫 번째 줄에는 X사의 1리터당 요금 A가 입력된다.
		int a = s.nextInt();
		//두 번째 줄에는 Y사의 기본요금 B가 입력된다.
		int b = s.nextInt();
		//세 번째 줄에는 Y사의 요금이 기본요금이 되는 사용량의 상한 C가 입력된다.
		int c = s.nextInt();
		//네 번째 줄에는 Y사의 1리터 당 추가요금 D가 입력된다.
		int d = s.nextInt();
		//다섯 번째 줄에는 JOI군의 집에서 사용하는 한 달간 수도의 양 P가 입력된다.
		int p = s.nextInt();
		
		int x_p = a*p; //x사 요금
		
		if(p>c) {
			d=((p-c)*d) + b;
			if(x_p > d) System.out.println(d);
			else System.out.println(x_p);
		}
		else {
			if(x_p > b) System.out.println(b);
			else System.out.println(x_p);
		}
	}
}
