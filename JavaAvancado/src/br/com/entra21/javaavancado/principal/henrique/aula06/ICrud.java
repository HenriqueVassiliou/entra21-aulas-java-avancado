package br.com.entra21.javaavancado.principal.henrique.aula06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//<QualquerLetra> serve como alias para um tipo que ser� informado por quem implementar essa interface
//em cada assinatura de m�todo que possuir o alias 
//ser� criado um m�todo para implementar com o retorno ou parametro j� atualizado conforme solicitado
public interface ICrud<T> {

	// atributos s�o est�ticos em interfaces e podem ser utilizados para fornecer de
	// forma facil um lista
	ArrayList<String> opcoes = new ArrayList<String>(
			Arrays.asList("Listar", "Adicionar", "Buscar", "Editar", "Deletar"));

	
	public void listar(HashMap<String, T> lista);
	// Perfeita forma de generics, solicitar parametro de uma Collection
	// que gerencia um 'Tipo' que eu ainda nem sei oq �

	
	public void adicionar();// m�todo simples em uma interface, nao tem parametros nem retorno

	
	public T buscar(T chave);
	// 3� forma de generics, retornar e solicitar parametro de um 'Tipo' que eu ainda
	// nem sei oq �

	
	public void editar(T chave);
	// 2� forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq �


	
	public void deletar(T chave);
	// 2� forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq �


	
	public T capturarChave();
	// 1� forma de generics, retonar um 'Tipo' que eu ainda nem sei oq �


	
	public T capturarValores();
	// 1� forma de generics, retornar um 'Tipo' que eu ainda nem sei oq �


	
	public void exibirDetalhes(T completo);
	// 2� forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem
	// sei oq �
}
