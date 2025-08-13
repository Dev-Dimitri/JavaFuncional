package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCount {
	
	public static void main(String[] args) {
		
		//instancia a lista.
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		//mapToInt, converte do tipo Stream<Integer> para uma List<Integer>, depois soma.
		int somaTotal = listaNumeros.stream().mapToInt(Integer::intValue).sum();
		System.out.println(somaTotal);
		
		Stream<Integer> listaDobro = listaNumeros.stream().map(x -> x * 2);
		List<Integer> terceiraLista = new ArrayList<>();
		listaDobro.forEach(terceiraLista::add);
		
		
		System.out.println(terceiraLista);
		
		Long contador = terceiraLista.stream().count();
		
		System.out.println(contador);
		
		

	}

}
