package app;


public class Ovelha extends animal {
	public Ovelha(String nome) {
		super(nome);
	}
@Override
public void emitirSom() {
	System.out.println(nome + " diz: Mee");
}
public void produzirLa() {
	System.out.println(nome + " está produzindo lã.");
}
}
