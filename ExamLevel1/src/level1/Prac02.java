package level1;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int grade;
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.print("�̸� �Է� : ");
			name = sc.next();
			System.out.print("���� �Է� : ");
			grade = sc.nextInt();

			if(grade % 2 == 0 ) {

				System.out.println("¦��");
			}
			else if(grade%2 != 0 ) {
				System.out.println("Ȧ��");
			}
//			System.out.println("�����Ͻðھ��ϴ�?");
//			String anwser = sc.next();
//			if (anwser.equals("��")) {
//				System.out.println("����");
//				break;
//			}else if (anwser.equals("�ƴϿ�") ) {
//				
//			}

		}
	}

}
