import java.util.*;

//파티가 끝나고 난 뒤

public class b_2845 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//1m^2당 사람의 수
		int m = s.nextInt(); //면적
		int h = s.nextInt(); //사람의 수
		int c; 				 //참가자 변수
		
		//계산한 참가자의 수와 기사에 적혀져있는 참가자의 수 차이
		int sg = m*h; //상근이가 계산한 참가자의 수
		int sum = 0;  
		
		for (int i=0; i<5; i++) {
			c=s.nextInt();
			sum = c-(sg);
			System.out.print(sum + " ");
		}		
	}
}
