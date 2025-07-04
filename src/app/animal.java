package app;

public class animal {
	protected String nome;
	
	public animal(String nome) {
		this.nome = nome;
	}
	public void dormir() {
		System.out.println(nome + " está dormindo.");
	}
}
