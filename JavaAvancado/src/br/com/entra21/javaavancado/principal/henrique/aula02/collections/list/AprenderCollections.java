package br.com.entra21.javaavancado.principal.henrique.aula02.collections.list;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {
			System.out.println("Escolha uma das opções:\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);
		System.out.println("Volte sempre quando quiser aprender collections - list");

	}

	private static void aprenderArrayList() {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ariana");
		nomes.add("Fulano");
		nomes.add("Ciclano");
		nomes.add(0, "Primeiro");
		System.out.println("Quantos nomes? " + nomes.size());
		for (String item : nomes) {
			System.out.println("O nome no momento é " + item);
		}
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor " + nomes.get(nome));

		}
		System.out.println("O primeiro nome é " + nomes.get(0));
		System.out.println("O quarto é " + nomes.get(3));
		nomes.set(0, "O Primeiro"); // o primeiro lugar no indice passa a ter outro nome desse jeito
		nomes.set(0, nomes.get(0).toUpperCase()); // assim ele pega o valor atual e coloca tudo em caixa alta
		nomes.set(0, nomes.get(3).toLowerCase()); // atualizei um valor e deixei tudo em caixa baixa
		System.out.println("Agora o primeiro nome é: " + nomes.get(0));

		System.out.println("Onde será que está o Rubem? " + nomes.indexOf("Rubem")); // usando o index para pegar a
																						// posição do elemento
		System.out.println("Vou deletar quem estiver no índice 2 " + nomes.get(2));
		nomes.remove(2); // removendo o item no indice 2
		nomes.remove(nomes.indexOf("Rubem")); // removendo o índice onde o Rubem está
		// fazendo dessa maneira consigo fazer de forma dinamica, já que a lista está
		// sempre sendo alterada

		
	}

	// Criar uma lista de interesses
	// Inclua 5 interesses
	// Liste todos os interesses
	// Dessa lista escolha 2 que são favoritos para mostrar
	// Exclua um item por posição e outro por valor.
	// um syso para cada ação dessa
	private static void aprenderLinkedList() {


			 

	        LocalDate today = LocalDate.now();
	        System.out.println("Hoje é: " + today);

	 

	        LocalDate birthday = LocalDate.of(1994, 8, 3);
	        System.out.println("Seu aniversário é: " + birthday);

	 

	        LocalDate thisThursday = LocalDate.of(2022, Month.JUNE, 3); // Month.JUNE -> ENUM.
	        System.out.println("Essa Quinta: " + thisThursday);

	 

	        // Formata a data para uma melhor visualização
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY"); // MMM aparece o mes(august)
	        System.out.println("\n" + formatter.format(birthday));

	 

	        System.out.println("----------\n" + DateTimeFormatter.ofPattern("YYYY").format(thisThursday));

	 

	        Period lifetime = Period.between(birthday, today);
	        System.out.println("\nEu vivi um total de: " + lifetime.getYears() + " anos, " + lifetime.getMonths()
	                + " meses e " + lifetime.getDays() + " dias.");

	 

	        LocalTime lanche = LocalTime.of(20, 10);
	        LocalTime finalAula03 = LocalTime.of(22, 15);
	        LocalTime avaliacao = LocalTime.of(22, 0);

	 

	        System.out.println("Fomos lanchar as: " + lanche + " Vamos avaliar a aula as " + avaliacao
	                + " temos que aprender tudo até " + finalAula03);

	}
}
