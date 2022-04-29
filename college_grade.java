import java.util.Scanner;

public class college_grade {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("총 과목의 수를 적으세요."); 
		int gradeNum = Integer.parseInt(s.nextLine()); //총 과목의 수 입력
		double sum_score = 0; //점수의 총합 담는 변수
		double[] subjectScore = new double[gradeNum];  //점수 담는 배열
		double sum_grade =0; //학점의 총합 담는 변수
		double[] grades = new double[gradeNum]; //학점 담는 배열
		
		for (int i = 0; i < grades.length; i++) { //4번 - 성적, 학점
			System.out.print("첫번째 과목의 점수? :");
			subjectScore[i] = s.nextDouble();
			System.out.print("첫번째 과목의 학점? :");
			grades[i] = s.nextDouble();
			
			
			sum_score += subjectScore[i]*grades[i];
			sum_grade += grades[i];
		}
		System.out.println(String.format("총 학점 : %.3f",sum_score/(int)sum_grade));
		System.out.println(sum_score + " " + sum_grade);
	}
}