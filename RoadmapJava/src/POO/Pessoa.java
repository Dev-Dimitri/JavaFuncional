package POO;

public class Pessoa {
	  private String nome;
	  private String sobrenome;

	    public Pessoa(String nome) { // construtor que recebe o nome
	        this.nome = nome;
	    }
	    
	    public Pessoa() {
	    	
	    }

	    @Override
	    public String toString() {
	        return nome + " - " + "nome" + sobrenome + " sobrenome";
	    }


}
