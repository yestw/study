import java.util.Scanner;

//핸드폰 요금

public class b_1267 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // 몇번 입력
		int ys = 0;
		int ms = 0;
		
		for(int i = 0; i < n; i++) {
		
			int num = s.nextInt();
			
			ys += (num/30 +1) * 10;
			ms += (num/60 +1) * 15;
		}
	
		
		
		if ( ys > ms)
			System.out.println("M " + ms);
		else if (ys < ms)
			System.out.println("Y " + ys);
		else if (ys==ms)
			System.out.println("Y M " + ys);
	}
}