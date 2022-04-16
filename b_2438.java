import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}