package br.com.entra21.javaavancado.principal.henrique.aula07;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.entra21.javaavancado.principal.henrique.Aula;

public class Aula07 extends Aula {

	public Aula07(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {
		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			aprenderTratarErros();
			break;
		case 2:
			obterDetalheErro();
			break;
		case 3:
			break;
		default:
			System.out.println("Op��o invalida para a Aula 7!");
			break;
		}
		return opcao;
	}

	private void aprenderTratarErros() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Informe um numero n�o muito alto, por favor?");
			byte naoEstouPreparado = input.nextByte();
		} catch (InputMismatchException e) {

			System.out.println("N�o vou parar o projeto s� por causa desse errinho!");
			System.out.println("Voc� vai capturar at� dar certo!");
			aprenderTratarErros();
		}

	}
	private void obterDetalheErro() {
		Scanner entrada = new Scanner (System.in);
		try {
			System.out.println("INFORME UM VALOR PEQUENO");
			byte estouPreparado = entrada.nextByte();
		} catch (InputMismatchException e) {
			System.out.println("Voc� n�o sabia mas eu estava preparado para essa situa��o "+e.getMessage()+ " ou "+e.getCause());
		
		}
		
	}
	private void usarCustomException() {
	
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Informe sua data de nascimento no formato YYYY-MM-DD: ");
            LocalDate dataNascimento = LocalDate.parse(entrada.next());
            if(dataNascimento.isAfter(LocalDate.now())) {
                throw new DataFuturaNaoPermitidaException();
            } 
            if(dataNascimento.isEqual(LocalDate.now())) {
                throw new DataFuturaNaoPermitidaException("Voc� nasceu hoje? ");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Tem alguma coisa errada com essa data, motivo -> " + e.getMessage());
        } catch (DataFuturaNaoPermitidaException e) {
            System.out.println(e.getMessage());

        }
	}
}
