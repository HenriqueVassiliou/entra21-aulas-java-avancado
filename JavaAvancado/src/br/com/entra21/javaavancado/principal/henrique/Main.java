package br.com.entra21.javaavancado.principal.henrique;

import java.util.Scanner;

import br.com.entra21.javaavancado.principal.henrique.aula01.enums.PersonagemJogo;
import br.com.entra21.javaavancado.principal.henrique.aula02.collections.list.AprenderCollections;
import br.com.entra21.javaavancado.principal.henrique.aula03.Aula03;
import br.com.entra21.javaavancado.principal.henrique.menu.aula04.MenuAula04;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}
	
	
	public static void main(String[] args) {
		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				aprenderWrapper();
				break;
			case 2:
				aprenderEnum();
				break;
			case 3:
				AprenderCollections.aprender();
				break;
			case 4:
				Aula03.aprender();
				break;
			case 5:
                MenuAula04.aprender();
                break;
			default:
				System.out.println("Escolha uma opcao valida.");
				break;
			}

		} while (option != 0);

	}

	public static String exibirMenu() {
		String menu = "Vamos aprender sobre conceitos avancados em JAVA!";
		menu += "\n0 - Sair";
		menu += "\n1 - WRAPPER";
		menu += "\n2 - ENUM";
		menu += "\n3 - Aprender Collections";
		menu += "\n4 - Anotações e Datas";
		menu += "\n5 - HashSet e CRUD";
		menu += "\nEscolha uma das opcoes";
		

		return menu;
	}
	
	private static void aprenderWrapper() {
		
		//Conversao de tipos primitivos
		
		//Caracter
		char letra = Character.valueOf('e');
		
		//Booleans
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade3 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");
		
		//Inteiros
		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("1000000");
		
		//Decimal
		float decimalUm = Float.parseFloat("1000.10");
		double decimalDois = Double.parseDouble("2000.20 ");
		
	}
	
	private static void aprenderEnum() {
		
		System.out.println("Testando Enum: "+DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje?"sim":"nao");
		
		for (int dia =0;dia< DiasSemana.values().length;dia++) {
			System.out.println((dia+1)+" - "+DiasSemana.values()[dia]);
		}
		
		System.out.println("Gosto deste tipo de personagem "+PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe "+PersonagemJogo.ANAO+" tem HP = "+PersonagemJogo.ANAO.getHP());
		System.out.println("Veja a caracteristica masi comum dele: "+PersonagemJogo.ANAO.getDESCRICAO());
		
		System.out.println("O mago esta no indice do enum "+PersonagemJogo.MAGO.ordinal());
        System.out.println("\n Veja a descrição completa do " + PersonagemJogo.MAGO + " sua vida é "
                + PersonagemJogo.MAGO.getHP() + " e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());
        
        System.out.println(PersonagemJogo.BARBARO.getDetails());
        
        System.out.println("");
        for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			
        	System.out.println("Contador = "+personagem+" posicao do Enum = "+PersonagemJogo.values()[personagem].ordinal());
        	System.out.println("O personagem "+PersonagemJogo.values()[personagem].name());
        	System.out.println(PersonagemJogo.values()[personagem].getHP());
        	System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
        	System.out.println("-----------------------------------------");
		}
        
        for(PersonagemJogo variavel:PersonagemJogo.values() ) {
        	System.out.println(variavel.ordinal() + " - " +variavel.getDetails());
        }
        System.out.println("");
        System.out.println("O Druida esta na posicao "+PersonagemJogo.DRUIDA.ordinal());

		}
	}


