package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercicesFinal {
    public static void main(String[] args) {

        // 1. Quantidade de letras de cada nome (usando forEach)
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carla");
        System.out.print("Tamanho de cada nome: ");
        nomes.forEach(x -> System.out.print(x.length() + " "));
        System.out.println(); // quebra de linha

        // 2. Quadrado de cada número
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> quadrados = numeros.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println("Quadrados: " + quadrados);

        // 3. Filtrar números pares
        List<Integer> valores = Arrays.asList(3, 7, 10, 15, 20);
        List<Integer> pares = valores.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + pares);

        // 4. Filtrar números maiores que 10
        List<Integer> maioresQue10 = valores.stream()
                .filter(x -> x > 10)
                .collect(Collectors.toList());
        System.out.println("Maiores que 10: " + maioresQue10);

        // 5. Contar múltiplos de 5
        long multiplosDe5 = valores.stream()
                .filter(x -> x % 5 == 0)
                .count();
        System.out.println("Quantidade de múltiplos de 5: " + multiplosDe5);

        // 6. Palavras com mais de 3 letras, convertidas para maiúsculo
        List<String> palavras = Arrays.asList("java", "stream", "API", "MAP", "Filter");
        List<String> palavrasMaiusculas = palavras.stream()
                .filter(x -> x.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Palavras maiúsculas (>3 letras): " + palavrasMaiusculas);

        // 7. Palavras que começam com 'M' (ignora maiúsculas/minúsculas)
        List<String> palavrasComM = palavras.stream()
                .filter(x -> x.toUpperCase().startsWith("M"))
                .collect(Collectors.toList());
        System.out.println("Palavras que começam com M: " + palavrasComM);
    }
}
