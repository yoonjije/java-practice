package level1;

import java.util.Scanner;

public class Prac04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] name = new String[3];
		int[] score = new int[3];

		int i = 0;

		for ( i = 0; i < name.length; i++) {
			System.out.print("�л� �̸��� �Է��ϼ��� : ");
			name[i] = in.next();
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = in.nextInt();
		} 
		
		
		
		for (int j = 0; j < score.length; j++) {

			System.out.println(name[j] + score[j]);
		}
	}
}
