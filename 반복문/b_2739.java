import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        int a = Integer.parseInt(s.nextLine());
        
        for(int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
