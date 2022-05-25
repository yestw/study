import java.util.ArrayList;
import java.util.Scanner;

//17608 막대기

public class b_17608 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int n = s.nextInt();
		int count = 0;
		int temp = 0;
		for(int i = 0; i < n; i++) {	//처음에 입력한 수만큼 입력, 리스트에 채워넣기
			a.add(s.nextInt());
		}
		
		for(int i = 1; i <= n; i++) {
		if(temp <a.get(n-i)) {		//오른쪽->왼쪽으로 가면서 크기 비교 오른쪽이 더 큰경우 왼쪽의 막대기를 셀수 없으니 오른쪽이 더 클때만 카운트 증가								
			temp = a.get(n-i);		//만약 오른쪽이 더 크다면 그 숫자를 temp에 넣어서 계속 비교
			count++;
			}
		}
		
		System.out.println(count);

	}

}
