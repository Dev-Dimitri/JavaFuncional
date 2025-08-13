package POO;

public class NovaPessoa {
	  private String nome;
	  private String sobrenome;

	    public NovaPessoa(String nome, String sobrenome) { // construtor que recebe o nome
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	    }
	    
	    public NovaPessoa() {
	    	
	    }

	    @Override
	    public String toString() {
	        return nome + " - " + sobrenome + " sobrenome";
	    }
}
