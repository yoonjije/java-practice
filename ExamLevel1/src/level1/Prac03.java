package level1;

import java.util.Scanner;

public class Prac03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int grade;
		
		String name;

		while(true) {
			System.out.print("�л� �̸� �Է� :");
			name = in.next();
			System.out.println("���� �Է��ϼ���.");
			grade = in.nextInt();

			if(grade >= 90) {
				System.out.println("A����");
			}
			else if(grade < 89 || grade > 80 ) {
				System.out.println("B����");
			}
			else if(grade <= 79 ) {
				System.out.println("F����");
			}
		}
	}
}
