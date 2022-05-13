import java.util.Scanner;

public class b_3058 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] nums = new int[7];
		
		for(int i = 0; i < n; i ++ ) {
			
			int sum = 0;
			int min = 100;
			for (int j = 0; j <7 ; j++) {
				nums[j] = s.nextInt();

				if(nums[j]%2 ==0) {
					sum += nums[j];
					if(nums[j] < min)
						min = nums[j];
				}
			}

			System.out.println(sum);
			System.out.println(min);
			}
		}
	}
