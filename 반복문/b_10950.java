import java.util.*;

public class b_10950 {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();; //반복횟수 입력
        
        
        for(int i = 0; i < a; i++) {
           	int num1 = s.nextInt();
            int num2 = s.nextInt();
            System.out.println(num1+num2);
        }
        
    }
}
