package Acessos;

public class AcessosClasse {
	
	public String nome; /// público a todo o sistema;
	
	private int valor; /// visível apenas dentro da classe, acessado e modificado por getter e setter.
	public int getValor() {
		return this.valor;
	}
	public void setValor(int valor) {
		this.valor= valor;
	}
	protected String cpf; // visível no mesmo pacote ou por herança;
	
	public void falar() {
		System.out.println("Olá");
	}
	
	
 public static void main(String[] args) {
	//demonstrando;
	 
	 AcessosClasse aC = new AcessosClasse();
	 
	 aC.nome = "Dimitri"; // público e acessado.
	 aC.valor = 15; // main na própria classe, acessa, se eu estiver em outra classe, não acessaria.
	 aC.cpf = "está no mesmo pacote";
}
}
