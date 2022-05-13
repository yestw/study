import java.util.Scanner;

public class b_2576 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] nums = new int[7];
		int sum = 0;
		int min = 100;
		
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();

			if(nums[i]%2 ==1) {
				sum += nums[i];
				if(nums[i] < min)
					min = nums[i];
			}
		}
		if( sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
		System.out.println(min);
		}
	}

}
