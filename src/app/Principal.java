package app;

public class Principal {
	public static void main (String[] args) {
		Porco porco = new Porco ("PINK PIG");
		Ovelha ovelha = new Ovelha("Dolle");
		
		porco.emitirSom();
		porco.dormir();
		porco.fuçar();
		
		System.out.println("__________________________________");
		
		ovelha.emitirSom();
		ovelha.dormir();
		ovelha.produzirLa();
	}

}
