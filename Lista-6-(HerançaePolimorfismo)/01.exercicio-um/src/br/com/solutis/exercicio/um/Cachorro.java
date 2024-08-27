package br.com.solutis.exercicio.um;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + getNome() + " está latindo.");
    }

    public void correr() {
        System.out.println("O cachorro " + getNome() + " está correndo.");
    }

    @Override
    public String toString() {
        return "Cachorro: " + super.toString();
    }
}
