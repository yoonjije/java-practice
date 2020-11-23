package level1;

import java.util.Scanner;

public class Prac03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int grade;
		
		String name;

		while(true) {
			System.out.print("학생 이름 입력 :");
			name = in.next();
			System.out.println("성적 입력하세요.");
			grade = in.nextInt();

			if(grade >= 90) {
				System.out.println("A학점");
			}
			else if(grade < 89 || grade > 80 ) {
				System.out.println("B학점");
			}
			else if(grade <= 79 ) {
				System.out.println("F학점");
			}
		}
	}
}
