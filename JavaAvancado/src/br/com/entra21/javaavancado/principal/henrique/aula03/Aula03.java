package br.com.entra21.javaavancado.principal.henrique.aula03;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import br.com.entra21.javaavancado.principal.henrique.aula02.collections.list.DateTimeFormatter;
import br.com.entra21.javaavancado.principal.henrique.aula02.collections.list.LocalDate;
import br.com.entra21.javaavancado.principal.henrique.aula02.collections.list.LocalTime;
import br.com.entra21.javaavancado.principal.henrique.aula02.collections.list.Period;

public class Aula03 {

	static Scanner input = new Scanner(System.in);
	
	public static void aprender() {
		
	        byte opcao;
	        do {
	            System.out.println("-1 - Sair de fininho");
	            System.out.println("0 - Voltar");
	            System.out.println("1 - Datas");
	            System.out.println("2 - Anotações");
	            opcao = input.nextByte();

	 

	            switch (opcao) {
	            case -1:
	                System.exit(3);// Exit retorna um valor para quem chamou o programa
	                break;
	            case 0:
	                System.out.println("Retornando ao menu principal");
	                break;
	            case 1:
	                aprenderDatas();
	                break;
	            case 2:

	 

	                break;
	            default:
	                break;
	            }
	        } while (opcao != 0);

	 

	    }

	 

	    private static void aprenderDatas() {
	       
	        Instant inicio = Instant.now();
	        
	        
	        
	        
	        System.out.println("Escolha um numero aleatorio, menos esse que voce acabou de pensar");
	        long numero = input.nextLong();
	        
	        
	        
	        
	        
	        Instant fim = Instant.now();
	        Duration tempo = Duration.between(inicio, fim);
	        System.out.println("Voce demorou "+tempo.toSeconds()+" segundos para escolher o numero "+numero );
	        System.out.println("Para datas, levamos "+tempo.toSeconds()+" segundos");
	    }
	    
	        private static void aprenderDatasHumanizadas() {

				 

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
