import java.util.Scanner;

//심부름 가는 길

public class b_5554 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//총 이동 시간이 몇분 몇초인지 출력
		
		//첫 번째 줄에 집에서 학교까지의 이동 시간을 나타내는 초
		int first = s.nextInt();
		//두 번째 줄에 학교에서 PC방까지의 이동 시간을 나타내는 초
		int second = s.nextInt();
		//세 번째 줄에 PC방에서 학원까지의 이동 시간을 나타내는 초
		int third = s.nextInt();
		//마지막 줄에 학원에서 집까지의 이동 시간을 나타내는 초
		int last = s.nextInt();
		
		int sum= first+second+third+last; //총 이동시간
		
		int m = sum/60; 	//분
		int c = sum%60;		//초
		System.out.println(m + "\n" + c);

	}
}
