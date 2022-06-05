import java.util.Scanner;

//배열 - 최소, 최대 구하기
public class b_10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt(); 
		int[] a = new int[num]; 
		int max = -1000000;
		int min = 1000000;

		for (int i = 0; i < a.length; i++) { 
			a[i] = s.nextInt(); 

			if (max < a[i]) { 
				max = a[i];
			}
			else if (min > a[i]) 
				min = a[i];
		}
		
		System.out.print(min + " " + max);
	}

}
