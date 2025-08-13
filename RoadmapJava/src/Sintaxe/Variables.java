package Sintaxe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Variables {
public static void main(String[] args) {
	String meuNome = "Dimitri"; /// String;

	
	Boolean isBool = false; // boolean falso
	Boolean IsTruthy = true; // boolean true;
	
	//uso de inteiros;
	int minhaIdade = 20; // int
	long numberLong = 1293821838238283l;
	byte numberByte = 127;
	short numberShort = 32767; 
	
	float numberFloat = 39.7f;
	double numberDouble = 
	
	//aqui eu consigo atribuir valores de mesma tipagem a cada linha de comando
	minhaIdade = 21;
	minhaIdade = 22;
	
	///erro aqui, pois a variável foi tipada como inteira, ao passar string vai dar erro.
	//minhaIdade = "Fernanda";
	
	////Collections
	///Instanciando um array de inteiro, vazio.
	List<String> teste = List.of("Olá", "Dimitri");
	List<Integer> listaInteiro = new ArrayList<>();
	listaInteiro.add(1);
	listaInteiro.add(10);
	//listaInteiro.add("String"); /// erro pois é String.
	
	//Lista fixa, não pode adicionar ou remover, apenas alterar o que já existe.
	List<Integer> lista = Arrays.asList(1, 2, 3);
	
	// Essa lista é imutável – você não pode nem adicionar, nem remover, nem alterar:
	List<String> nomes = List.of("Ana", "Bruno", "Carla");
	
	String[] nomes5 = new String[5];
	nomes5[0] = "valor 0"; /// contem 5 posições 0 a 4.
	
	List<String> listaLinked = new LinkedList<>();
	listaLinked.add("A");
	
	//Chave valor HASHMAP
	Map<String, Integer> idades = new HashMap<>();
	
	
	///atualiza dados.
	idades.put("Ana", 25);
	idades.put("Bruno", 30);
	idades.put("Carla", 22);
	idades.get("Ana"); ///retorna valor -> 25
	idades.get("dimi"); ///retorna valor -> 25
	
	//principais métodos, put, get, remove, keySet, values
	
	idades.remove("dimi"); /// remove chave.
	
	System.out.println(idades);
	System.out.println(idades.containsKey("Bruno")); /// retorna um boolean.
	System.out.println(idades.get("Bruno"));
	System.out.println(idades.keySet()); /// retorna todas as chaves;
	System.out.println(idades.values());
	
	
	//Como HashMap, mas mantém ordem de inserção
	Map<String, String> mapa = new LinkedHashMap<>();
	mapa.put("primeiro", "1");
	mapa.put("segundo", "2");
	mapa.put("terceiro", "3");

	System.out.println(mapa); // mantém a ordem
	
	
	///Organiza as chaves automaticamente.
	Map<String, Integer> ordenado = new TreeMap<>();
	ordenado.put("banana", 3);
	ordenado.put("abacate", 1);
	ordenado.put("carambola", 2);

	System.out.println(ordenado); // {abacate=1, banana=3, carambola=2}
	
	Set<String> nomesSet = new HashSet<>();
	nomesSet.add("Ana");
	nomesSet.add("Bruno");
	nomesSet.add("Ana"); // ignorado (duplicado)

	System.out.println(nomes); // [Ana, Bruno]
}
}
