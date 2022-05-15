import java.util.Scanner;

public class b_20492 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int js = n-(int)(n*0.22);	//전체 상금의 22% 제세공과금 납부
		
		int gb = n-(int)(n*0.8);	//상금의 80% 경비로 인정한다면
		int gb_js = n-(int)(gb*0.22);//나머지 금액중 22% 제세공과금 납부
		
		System.out.println(js);
		System.out.println(gb_js);

	}

}
