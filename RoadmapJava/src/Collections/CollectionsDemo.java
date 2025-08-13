package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsDemo {
		public static void main(String[] args) {
		
		///LIST -> permite duplicata.
		List<String> listaUm = new ArrayList<>(); 
		List<String> listaDois = List.of("Dimitri", "Teste");
		List<String> listaTres = Arrays.asList("Oi");
		listaUm.add("Adicionando valor");
		listaUm.add(1, "add");
		listaUm.add(1, "add");
		System.out.println(listaUm);
		
		//LinkedList -> lista duplamente ligada, acesso por indice é mais lento.
		List<String> linked = new LinkedList<>();
		linked.add("A");
		linked.add("B");
		((LinkedList<String>) linked).addFirst("C"); // início rápido
		System.out.println(linked); // [C, A, B]
		
		
		/// baseado em hashtable, não garante ordem.
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("A"); // ignorado
		System.out.println(set); // [A, B] (ordem pode variar)
		
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("C");
		lhs.add("A");
		lhs.add("B");
		System.out.println(lhs); // [C, A, B]
		
		
		///Ordena automaticamente 
		Set<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(1);
		ts.add(3);
		System.out.println(ts); // [1, 3, 5]
		
		Map<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("C", 1);
		lhm.put("A", 2);
		System.out.println(lhm); // {C=1, A=2}
		
		Map<String, Integer> tm = new TreeMap<>();
		tm.put("B", 2);
		tm.put("A", 1);
		System.out.println(tm); // {A=1, B=2}
		
		Queue<String> pq = new PriorityQueue<>();
		pq.add("C");
		pq.add("A");
		pq.add("B");
		System.out.println(pq.poll()); // A (ordem natural)
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 30);
		map.put("Bob", 25);
		System.out.println(map); // {Alice=30, Bob=25}
		
		//hashset não aceita valores duplicados.
		Set<String> tags = new HashSet<>();
		tags.add("java");
		tags.add("java"); // ignorado (duplicata)
		tags.add("backend");
		System.out.println(tags.contains("java")); // true
		System.out.println(tags);
		
		Map<String, Integer> keyValue = new HashMap<>();
		keyValue.put("Dimitri", 8);
		keyValue.put("Almeida",5);
		keyValue.put("Mendonça", 10);
		keyValue.put("Cajazeiras",15);
		keyValue.put("Reis", 10);
		keyValue.put("Dale",25);
		
		Map<String, Integer> keyValueSorted = new TreeMap<>();
		
	
		
		//para percorrer Map, é necessário iterar com Map.Entry -> entrySet
		
		for(Map.Entry<String, Integer> entry: keyValue.entrySet()) {
			keyValueSorted.put(entry.getKey(), entry.getValue());
		}
		System.out.println(keyValueSorted + "valor antes da ordenação por valor");
		List<Map.Entry<String, Integer>> valuesSorted = new ArrayList<>(keyValue.entrySet());
		valuesSorted.sort(Map.Entry.comparingByValue());	
		Map<String, Integer> ordenedValue = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry: valuesSorted) {
			ordenedValue.put(entry.getKey(), entry.getValue());
		}
		System.out.println(ordenedValue + "valor depois da ordenação por valor");
		
		///dicas: acesso rápido por indice: ArrayList
				List<String> nomes = new ArrayList<>(List.of("Ana", "João", "Maria"));
				nomes.sort(Comparator.naturalOrder()); // Ordenar
				nomes.removeIf(n -> n.startsWith("J")); // Remover por condição
				boolean existe = nomes.contains("Ana"); // Verificar existência
				
				System.out.println(nomes);
				System.out.println(existe);
	}
		
		
	

}
