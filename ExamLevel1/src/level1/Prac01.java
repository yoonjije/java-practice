package level1;

import java.util.Scanner;

public class Prac01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		
		int max = 0;
		int i;
		int[] gra = new int[3];
		
		System.out.println("�л� �̸��� �Է��ϼ��� : ");
		name = scanner.next();
		
		for (i = 0; i < gra.length; i++) {
			System.out.println("������ �Է��ϼ��� : ");
			 gra[i] = scanner.nextInt();
		}
		
		for(i = 0; i < gra.length; i++) {
			
			if(gra[i] > max ) {
				max = gra[i];
			}
		}
		System.out.println(max);			
	}
}
