package br.com.solutis.exercicio.cinco;

import br.com.solutis.exercicio.um.Animal;
import br.com.solutis.exercicio.um.Cachorro;
import br.com.solutis.exercicio.um.Cavalo;
import br.com.solutis.exercicio.um.Preguica;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        this.jaulas = new Animal[10];
    }

    public void adicionarAnimalNaJaula(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora do alcance. Escolha um número entre 0 e 9.");
        }
    }

    public void percorrerJaulas() {
        // Primeiro, percorrer cachorros
        for (Animal animal : jaulas) {
            if (animal instanceof Cachorro) {
                System.out.println(animal);
                animal.emitirSom();
                ((Cachorro) animal).correr();
                System.out.println();
            }
        }

        // Em seguida, percorrer cavalos
        for (Animal animal : jaulas) {
            if (animal instanceof Cavalo) {
                System.out.println(animal);
                animal.emitirSom();
                ((Cavalo) animal).correr();
                System.out.println();
            }
        }

        // Por último, percorrer preguiças
        for (Animal animal : jaulas) {
            if (animal instanceof Preguica) {
                System.out.println(animal);
                animal.emitirSom();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        // Adicionando animais nas jaulas
        zoologico.adicionarAnimalNaJaula(0, new Cachorro("Rex", 5));
        zoologico.adicionarAnimalNaJaula(3, new Cachorro("Bolt", 4));
        zoologico.adicionarAnimalNaJaula(6, new Cachorro("Max", 2));
        zoologico.adicionarAnimalNaJaula(9, new Cachorro("Buddy", 3));

        zoologico.adicionarAnimalNaJaula(1, new Cavalo("Spirit", 8));
        zoologico.adicionarAnimalNaJaula(4, new Cavalo("Thunder", 6));
        zoologico.adicionarAnimalNaJaula(7, new Cavalo("Wind", 9));

        zoologico.adicionarAnimalNaJaula(2, new Preguica("Sid", 3));
        zoologico.adicionarAnimalNaJaula(5, new Preguica("Lazy", 7));
        zoologico.adicionarAnimalNaJaula(8, new Preguica("Chill", 4));

        zoologico.percorrerJaulas();
    }
}

