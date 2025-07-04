package app;


public class Porco extends Animal{
	public Porco(String nome) {
		super(nome);
	}
 @Override
 public void emitirSom() {
	 System.out.println(nome + "diz: ronk ronk");
 }
 public void fuçar() {
	 System.out.println(nome + "esta fuçando a lama");
 }
}
