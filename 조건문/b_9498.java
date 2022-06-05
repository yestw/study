import java.util.*;

public class b_9498 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        
        if (num <= 100 && num >= 90)
            System.out.println("A");
        else if (num < 90 && num >= 80)
           System.out.println("B");
        else if (num < 80 && num >= 70)
            System.out.println("C");
        else if (num < 70 && num >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
