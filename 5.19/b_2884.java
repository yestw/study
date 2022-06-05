import java.util.Scanner;

//알람 시계 - 45분 일찍 알람 설정하기
public class b_2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		 
		int h = s.nextInt();	//시간 입력
		int m = s.nextInt();	//분 입력
		
		m = m-45;				//45분 일찍 알람을 설정하기 위해 분에서 45빼주기
		if (m < 0) {			//만약 분이 음수가 된다면
			m = 60 + m;			//60을 더해줘서 60-음수하면 분이 나옴
			h--;				//그리고 분이 0보다 더 줄었을때 시간도 줄어들기에 시간-1
			if(h < 0) {			//여기서 만약 시간도 0이된다면 23시로 가야하기에
				h = 23;			//시간이 음수일때 23 값주기
			}
		}
		System.out.println(h + " " + m);
	}

}
