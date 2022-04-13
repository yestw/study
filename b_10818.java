import java.util.Scanner;
//배열 - 최소, 최대 구하기
public class b_10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = Integer.parseInt(s.nextLine()); //몇개 입력할건지 결정
		int[] a = new int[num];	//입력된 수만큼의 배열 생성
		int max = 0; //최대값 구하는 변수
		int min = 0; //최소값 구하는 변수
		
		for (int i = 0; i < a.length; i++) { //배열의 길이만큼 반복
			a[i] = s.nextInt();		//배열의 칸 수만큼 배열에 값 넣기
			
			if(max < a[i]) {		//만약 배열안에 있는 값이 max보다 클경우 max에 넣기
				max = a[i];
			}
			else if (min > a[i])	//만약 배열안에 있는 값이 min보다 작을경우 min에 넣기
				min = a[i];

		}
		System.out.print(String.format("%d %d", min, max));
	}

}
