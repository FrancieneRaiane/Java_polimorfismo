package app;


public class Ovelha extends Animal {
	public Ovelha(String nome) {
		super(nome);
	}
@Override
public void emirirSom() {
	System.out.println(nome + " diz: Mee");
}
public void produzirLa() {
	System.out.println(nome + " está produzindo lã.");
}
}
