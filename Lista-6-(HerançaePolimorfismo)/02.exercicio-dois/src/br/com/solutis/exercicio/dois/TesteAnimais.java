package br.com.solutis.exercicio.dois;

import br.com.solutis.exercicio.um.Animal;
import br.com.solutis.exercicio.um.Cachorro;
import br.com.solutis.exercicio.um.Cavalo;
import br.com.solutis.exercicio.um.Preguica;

public class TesteAnimais {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rambo", 10);
        Animal cavalo = new Cavalo("Patron", 7);
        Animal preguica = new Preguica("Jailson", 3);

        preguica.emitirSom();
        cachorro.emitirSom();
        cavalo.emitirSom();
    }
}