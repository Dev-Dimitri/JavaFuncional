package POO;

public class Encapsulamento {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	///encapsulamento consiste na proteção e acesso de dados por meio de getters e setters
	
    //exemplo de getter e setter:
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
