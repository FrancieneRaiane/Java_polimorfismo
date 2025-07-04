package app;

public abstract class animal {
    protected String nome;

    public animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public abstract void emitirSom();  // método que deve ser implementado pelas subclasses
}


