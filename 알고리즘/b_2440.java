import java.io.*;

//별찍기

public class b_2440 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int num = a-1;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(j <= num) {
					bw.write("*");
				} else bw.write(" ");
			}
			num--;
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
