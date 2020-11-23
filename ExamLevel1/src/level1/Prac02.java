package level1;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int grade;
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("성적 입력 : ");
			grade = sc.nextInt();

			if(grade % 2 == 0 ) {

				System.out.println("짝수");
			}
			else if(grade%2 != 0 ) {
				System.out.println("홀수");
			}
//			System.out.println("종료하시겠씁니다?");
//			String anwser = sc.next();
//			if (anwser.equals("네")) {
//				System.out.println("종료");
//				break;
//			}else if (anwser.equals("아니오") ) {
//				
//			}

		}
	}

}
