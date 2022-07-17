import java.util.*;
import java.io.*;

public class b_11721 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		ArrayList<Character> al = new ArrayList<>(a.length());
		
		for(int i =0; i<a.length(); i++) {
			al.add(a.charAt(i));
			
			bw.write(al.get(i));
			if((i+1)%10 ==0)
				bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
