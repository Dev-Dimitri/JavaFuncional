package Exceptions;

public class NullPointerDemo {

    public static void main(String[] args) {
        try {
            String nome = null;
            imprimirNome(nome);
        } catch (NullPointerException e) {
            System.out.println("Exceção capturada no main:");
            System.out.println(e.getMessage());
        }
    }

    public static void imprimirNome(String nome) {
        try {
            System.out.println("Tamanho do nome: " + nome.length());
        } catch (NullPointerException e) {
            // Captura a exceção e relança com uma nova mensagem
            throw new NullPointerException("O nome está nulo. Forneça um valor válido.");
        }
    }
}