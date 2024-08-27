package br.com.solutis.exercicio.um;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo " + getNome() + "está relinchando.");
    }


    public void correr() {
        System.out.println("O cavalo " + getNome() + " está correndo. ");
    }

    @Override
    public String toString() {
        return "Cavalo: " + super.toString();
    }
}
