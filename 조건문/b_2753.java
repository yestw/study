import java.util.Scanner;

//윤년

public class b_2753 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		//연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 윤년
		//윤년이면 1 출력, 아니면 0 출력
		if (year%4 == 0 && year%100!=0 || year%400 ==0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
