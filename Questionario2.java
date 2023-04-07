package quizPi;

import java.util.Scanner;

public class Questionario2 {
	String nome;
	int pontos = 0;
	int resposta;
	double bonus = 100.000;
	int opcao = 0;
	int escolha = 0;

	public void iniciar2() {
		
		System.out.println("Informe seu nome !");
		Scanner scan = new Scanner(System.in);

		// texto inicial//
		nome = scan.next();
		System.out.println("texto de introducão ao questionario nivel 2");
		System.out.println("###################################");
		System.out.println("###################################");
		System.out.println("###################################");
		System.out.println("###################################");
		// inicio do jogo
		System.out.println("");
		System.out.println("Vamos iniciar o Quiz " + nome);
		System.out.println("###################################");
		// inicio das perguntas
		// PERGUNTA 01
		System.out.println("###################################");
		System.out.println();
		System.out.println(" pergunta 1 ###################################");
		System.out.println(" 1- resposta ");
		System.out.println(" 2- resposta ");
		System.out.println(" 3- resposta ");
		System.out.println(" 4- resposta ");
		System.out.println("###################################");
		resposta = scan.nextInt();
		int erro = 5;
		while (resposta >= erro) {
			// espaço para pergunta
			System.out.println(" pergunta 1 ###################################");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println("###################################");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		// case alternativa correta da pergunta
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			pontos++;
			break;
		default:
			System.out.println("###################################");
			System.out.println("resposta errada ");
			opcao++;
			break;
		}
		// PERGUNTA 02
		System.out.println(" pergunta 2 ##################################");
		System.out.println("###################################");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4-  ");
		System.out.println();
		System.out.println("###################################");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println(" pergunta 2 ");
			System.out.println("  ");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println();
			System.out.println(" ");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		// ALTERNATIVA CORRETA
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			pontos++;
			break;
		default:
			System.out.println("  ");
			System.out.println("  ");
			opcao++;
			break;
		}
		// PERGUNTA 03
		System.out.println("pergunta 3 ");
		System.out.println(" ");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println(" ");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println("");
			System.out.println(" pergunta 3  ");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println(" ");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			System.out.println();
			pontos++;
			break;
		default:
			opcao++;
			System.out.println("  ");
			System.out.println(" " + pontos + " pontos ");
			break;
		}
		// PERGUNTA 04
		System.out.println("pergunta 4 ");
		System.out.println("");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println(" ");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println("");
			System.out.println(" pergunta 4  ");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println(" ");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			System.out.println();
			pontos++;
			break;
		default:
			opcao++;
			System.out.println("  ");
			System.out.println(" " + "  ");
			break;
		}
		// PERGUNTA 05
		System.out.println(" ");
		System.out.println(" pergunta 5");
		System.out.println(" ");
		System.out.println(" 1  ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println(" ");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println("pergunta 5 :");
			System.out.println("");
			System.out.println("  ");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println("");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		// ALTERNATIVA DA RESPOSTA CORRETA
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			System.out.println();
			pontos++;
			break;
		default:
			opcao++;
			System.out.println(" ");
			System.out.println(" " + " ");
			break;
		}
		// PERGUNTA 06
		System.out.println(" ");
		System.out.println(" perguntas 6");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println("");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println(" ");
			System.out.println(" pergunta 6");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" 1-");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println("");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			System.out.println();
			pontos++;
			break;
		default:
			System.out.println("  ");
			System.out.println(" ");
			opcao++;
			break;
		}
		// PERGUNTA 07
		System.out.println(" Pergunta 7 ");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println("");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println("");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" Pergunta 7:  ");
			System.out.println(" 1- 2");
			System.out.println(" 2- 3");
			System.out.println(" 3- 4");
			System.out.println(" 4- 1");
			System.out.println("");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		// ALTERNATIVA DA RESPOSTA CORRETA
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			pontos++;
			break;
		default:
			System.out.println("  ");
			System.out.println(" " + pontos + " pontos ");
			opcao++;
			break;
		}
		// PERGUNTA 08
		System.out.println(" pergunta 8");
		System.out.println(" ");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println("");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println("");
			System.out.println(" Pergunta 8:  ");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println(" ");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			System.out.println();
			pontos++;
			break;
		default:
			System.out.println(" ");
			opcao++;
			break;
		}
		// PERGUNTA 09
		System.out.println(" pergunta 9");
		System.out.println("");
		System.out.println("");
		System.out.println(" 1 ");
		System.out.println(" 2 ");
		System.out.println(" 3- ");
		System.out.println(" 4-");
		System.out.println("");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println(" oergunta 9");
			System.out.println("");
			System.out.println("");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println("");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			System.out.println();

			pontos++;
			break;
		default:
			System.out.println(" ");
			System.out.println(" perguntas acertadas" + pontos + " pontos ");
			opcao++;
			break;
		}
		// PERGUNTA 10
		System.out.println("pergunta 10");
		System.out.println("");
		System.out.println("");
		System.out.println(" 1- ");
		System.out.println(" 2- ");
		System.out.println(" 3- ");
		System.out.println(" 4- ");
		System.out.println("");
		resposta = scan.nextInt();
		while (resposta >= erro) {
			System.out.println();
			System.out.println(" ");
			System.out.println(" Pergunta 10: ");
			System.out.println(" 1- ");
			System.out.println(" 2- ");
			System.out.println(" 3- ");
			System.out.println(" 4- ");
			System.out.println("");
			resposta = scan.nextInt();
		}
		switch (resposta) {
		case 1:
			System.out.println(nome + " A resposta esta correta: ");
			pontos++;
			break;
		}
		if (pontos <= 4) {
			System.out.println();
			System.out.println(" GAME OVER ");
			System.out.println("");
			pontos--;
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
		}
		// PERGUNTA BONUS
		else if (pontos >= 5) {
			System.out.println("");
			System.out.println(" PARA RESPONDER A PERGUNTA BONUS DIGITE 1 ");
			System.out.println("");
			System.out.println(" PARA NAO RESPONDER DIGITE 2 ");
			resposta = scan.nextInt();
			// BONUS
			if (resposta == 1) {
				System.out.println(" pergunta bonus");
				System.out.println("");
				System.out.println(" 1- ");
				System.out.println(" 2- ");
				System.out.println(" 3- ");
				System.out.println(" 4- ");
				System.out.println(" ");
				resposta = scan.nextInt();
				while (resposta >= erro) {
					System.out.println("pergunta bonus ");
					System.out.println("");
					System.out.println(" 1- ");
					System.out.println(" 2- ");
					System.out.println(" 3- ");
					System.out.println(" 4-  ");
					System.out.println(" ");
					resposta = scan.nextInt();
				}
			} else if (resposta == 2) {
				System.out.println(" ");
			}
			if (resposta == 2) {
				System.out.println(" fim de jogo");
				System.out.println(nome + "");
				System.out.println("" + bonus + "  " + "");
				System.out.println("pontos" + pontos);
				System.out.println("");
				System.out.println("");
				opcao++;
			}
		}
	}
}

