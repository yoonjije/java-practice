package level1;

import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[] name = new String[3];
		int[] score = new int[3];

		int i = 0;
		int sum = 0;

		exit:
		while(true) {
			for ( i = 0; i < score.length; i++) {
				System.out.println("학생 이름 입력 : " );
				name[i]= in.next();
				System.out.println("성적 입력 : ");
				score[i] = in.nextInt();	
				sum += score[i] ;

				
				if(sum > 101) {
					System.out.println("프로그램이 종료");
					break exit;
				}
			}
			
		}//	while(true) 
	}

}
