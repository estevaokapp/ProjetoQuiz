package quizPi;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int questionario = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("escolha um dos 3 questionarios");
		System.out.println("para testarmos os seu nivel de conhecimento");
		System.out.println("1-Tema do questionario");
		System.out.println("2-Tema do questionario");
		System.out.println("3-Tema do questionario");
		questionario = scan.nextInt();

		switch (questionario) {
		case 1:
			Questionario1 Questionario1 = new Questionario1();
			Questionario1.iniciar();
			break;
		default:
		}

		switch (questionario) {
		case 2:
			Questionario2 Questionario2 = new Questionario2();
			Questionario2.iniciar2();
			break;
		default:
		}

		switch (questionario) {
		case 3:
			Questionario3 Questionario3 = new Questionario3();
			Questionario3.iniciar3();
			break;
		default:
		}

	}

}
