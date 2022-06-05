import java.util.Scanner;

//정수 N개의 합

public class b_15596 {

	static long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		return  sum;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);		
		int num = s.nextInt();
		
		int[] nums = new int[num];
		for (int i = 0; i< nums.length; i++ ) {
			nums[i] = s.nextInt();
		}
		
		System.out.println(sum(nums));
		
		
	}

}
