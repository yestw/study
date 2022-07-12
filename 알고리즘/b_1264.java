import java.io.*;

//모음의 개수

public class b_1264 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while (true) {
			String a = bf.readLine();
			String aa = a.toLowerCase();
			bw.newLine(); //= System.out.println();
			int count=0;
			
			for(int i =0; i<a.length(); i++) {
				a.toLowerCase();
				if(aa.charAt(i) == 'a' || aa.charAt(i) == 'e' ||
						aa.charAt(i) == 'i' || aa.charAt(i) == 'o' ||
								aa.charAt(i) == 'u') count++;
			}	
			if(a.charAt(0) == '#') break;
			System.out.println(count);
		}
			bw.flush(); //남아있는 데이터 모두 출력
			bw.close(); //스트림 닫기
	}
}
