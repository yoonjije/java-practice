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
				System.out.println("�л� �̸� �Է� : " );
				name[i]= in.next();
				System.out.println("���� �Է� : ");
				score[i] = in.nextInt();	
				sum += score[i] ;

				
				if(sum > 101) {
					System.out.println("���α׷��� ����");
					break exit;
				}
			}
			
		}//	while(true) 
	}

}
