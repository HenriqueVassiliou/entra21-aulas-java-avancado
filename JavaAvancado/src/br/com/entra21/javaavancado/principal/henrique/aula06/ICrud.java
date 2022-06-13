package br.com.entra21.javaavancado.principal.henrique.aula06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//<QualquerLetra> serve como alias para um tipo que será informado por quem implementar essa interface
//em cada assinatura de método que possuir o alias 
//será criado um método para implementar com o retorno ou parametro já atualizado conforme solicitado
public interface ICrud<T> {

	// atributos são estáticos em interfaces e podem ser utilizados para fornecer de
	// forma facil um lista
	ArrayList<String> opcoes = new ArrayList<String>(
			Arrays.asList("Listar", "Adicionar", "Buscar", "Editar", "Deletar"));

	
	public void listar(HashMap<String, T> lista);
	// Perfeita forma de generics, solicitar parametro de uma Collection
	// que gerencia um 'Tipo' que eu ainda nem sei oq é

	
	public void adicionar();// método simples em uma interface, nao tem parametros nem retorno

	
	public T buscar(T chave);
	// 3º forma de generics, retornar e solicitar parametro de um 'Tipo' que eu ainda
	// nem sei oq é

	
	public void editar(T chave);
	// 2º forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq é


	
	public void deletar(T chave);
	// 2º forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem sei
	// oq é


	
	public T capturarChave();
	// 1º forma de generics, retonar um 'Tipo' que eu ainda nem sei oq é


	
	public T capturarValores();
	// 1º forma de generics, retornar um 'Tipo' que eu ainda nem sei oq é


	
	public void exibirDetalhes(T completo);
	// 2º forma de generics, solicitar parametro de um 'Tipo' que eu ainda nem
	// sei oq é
}
