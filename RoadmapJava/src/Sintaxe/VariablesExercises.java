package Sintaxe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VariablesExercises {
	
	public static void main(String[] args) {
		
		///exercicio 1: // contar a reincidência de palavras e adicionar em um novo HashMap
		List<String> entradas = Arrays.asList("java", "stream", "java", "map", "java", "map");
		
		
		
		 Map<String, Integer> contador = new HashMap<>();
		
		 ///for iterando entradas, para cada iteração, contador.put atualizará o valor de filtro, checa a reincidência e soma +1
		 ///getOrDefault busca a chave, se não existir, retorna 0. 
		 //Se existir a palavra, soma +1 na reincidencia. ex: java  =3
		for(String filtro: entradas) {
			///contador.put(k, v);
			contador.put(filtro, contador.getOrDefault(filtro, 0) +1);
		}
	
	    System.out.println(contador);
	    
	    
	    ///exercicio 2 Entrada: Map<String, Integer> com nomes e idades.
	    //Objetivo: Criar um novo Map apenas com pessoas maiores de idade.
	    
	    Map<String, Integer> pessoas = new HashMap<>();
	    pessoas.put("Ana", 17);
	    pessoas.put("Bruno", 22);
	    pessoas.put("Carlos", 16);
	    pessoas.put("Daniela", 19);
	    
	    Map<String, Integer> filteredPerson = new HashMap<>();
	    
	    for(Map.Entry<String, Integer> entry: pessoas.entrySet()) {
	    	
	    	if(entry.getValue() > 18) {
	    		filteredPerson.put(entry.getKey(), entry.getValue());
	    	}
	    }
	    
	    System.out.println(filteredPerson);
	    
	    //🟢 3. Ordenar por chave (nome)
	    //Com o mapa acima, ordene alfabeticamente por nome (dica: use TreeMap).
	    
	    
	    Map<String, Integer> ordenedConstructor = new TreeMap<>(pessoas);
	    
	    Map<String, Integer> ordened = new TreeMap<>();
	    
	    for(Map.Entry<String, Integer> entry: pessoas.entrySet()) {
	    	ordened.put(entry.getKey(), entry.getValue());
	    }
	    
	    System.out.println(ordened);
	    System.out.println(ordenedConstructor);
	    
	    ///🟢 4. Ordenar por valor (idade)
	    //Ordene o Map por idade (valor).
	    //📌 Dica: use entrySet().stream().sorted(...) e depois colecione em LinkedHashMap.
	    
	    List<Map.Entry<String, Integer>> lista = new ArrayList<>(pessoas.entrySet());
	    
	    
	    lista.sort(Map.Entry.comparingByValue());
	    
	    System.out.println(lista);
	    
	    Map<String, Integer> ordenedValue = new LinkedHashMap<>();
	    
	   for(Map.Entry<String, Integer> entry: lista) {
		   ordenedValue.put(entry.getKey(), entry.getValue());
	   }
	   
	   System.out.println(ordenedValue);
	    
	}

}
