package level1;

import java.util.Scanner;

public class Prac06 {
	
	Scanner in = new Scanner(System.in);

	String[] name = new String[3];
	int[] score = new int[3];
	int i = 0;
	
	public Prac06() {
		run();
	}
	
	private void run() {
		// TODO Auto-generated method stub
		input();
		output();
		
	}

	public void input( ) {
		for ( i = 0; i < name.length; i++) {
			System.out.print("�л� �̸��� �Է��ϼ��� : ");
			name[i] = in.next();
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = in.nextInt();
		} 
	}
	
	public void output( ) {
		for (int j = 0; j < score.length; j++) {
			System.out.println(name[j] + score[j]);
		}
	}

	public static void main(String[] args) {
		
	Prac06 prac = new Prac06();
		
	}

}
