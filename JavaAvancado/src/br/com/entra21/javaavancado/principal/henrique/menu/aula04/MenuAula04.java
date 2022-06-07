package br.com.entra21.javaavancado.principal.henrique.menu.aula04;

import java.util.HashSet;
import java.util.Scanner;

public class MenuAula04 {

	static Scanner entrada = new Scanner(System.in);

	public static void aprender() {

		byte opcao;
		do {
			System.out.println("Assuntos Aula 04");
			System.out.println("0 - Voltar");
			System.out.println("1 - Definir HashSet");
			System.out.println("2 - Gerenciar C.R.U.D");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Até a proxima!");
				break;
			case 1:
				aprenderHashSet();
				break;

			case 2:
				aprenderCRUD();
				break;

			default:
				System.out.println("Escolha uma opção válida para aprender um assunto avançado sobre JAVA");
				break;
			}

		} while (opcao != 0);
	}

	private static void aprenderHashSet() {

		HashSet<String> linguagens = new HashSet<>();
		System.out.println("Quantidade de itens na minha lista " + linguagens.size());
		System.out.println("Minha lista esta vazia? " + linguagens.isEmpty());
		System.out.println("Minha lista esta vazia? " + (linguagens.isEmpty() ? "sim" : "nao"));

	}

	private static void aprenderCRUD() {
		HashSet<String> linguagens = new HashSet<>();
		// CREATE
		linguagens.add("Java");
		linguagens.add("C#");
		linguagens.add("Pyton");
		System.out.println(linguagens);
		linguagens.add("JAVA");
		linguagens.add("java");
		System.out.println(linguagens);
		HashSet<Integer> numeros = new HashSet<>();
		numeros.add(3);
		numeros.add(1);
		numeros.add(2);
		numeros.add(5);
		numeros.add(4);
		numeros.add(1);
		System.out.println(numeros);

		for (Integer numero : numeros) {
			System.out.println(numero);

		}
		// read
		System.out.println("------READ");
		for (String linguagem : linguagens) {
			System.out.println("Linguagem==" + linguagem);

		}
		System.out.println("JAVA existe na minha lista?" + linguagens.contains("JAVA"));
		System.out.println("SQL existe na minha lista?" + linguagens.contains("SQL"));

		// read buscar
		String busca = null;
		for (String linguagem : linguagens) {
			if (linguagem.equals("C#")) {
				System.out.println("Encontrei ELE!!!");
				busca = linguagem;

			}

		}
		System.out.println(busca);

		// update
		System.out.println("-----UPDATE");
		System.out.println("lista antes" + linguagens);
		linguagens.remove("java");
		linguagens.add("java2");
		System.out.println("lista depois" + linguagens);
		// delete
		System.out.println("-----DELETE");
		System.out.println("lista antes" + linguagens);
		linguagens.remove("java3");
		System.out.println("lista depois" + linguagens);

	}
}
