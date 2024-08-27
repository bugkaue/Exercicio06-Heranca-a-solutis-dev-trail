package br.com.solutis.exercicio.um;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça " + getNome() + " está fazendo um som baixo.");

    }

    public void subirEmArvores(){
        System.out.println("A preguiça " + getNome() + " está subindo em arvores.");
    }

    @Override
    public String toString() {
        return "Preguica: " + super.toString();
    }
}
