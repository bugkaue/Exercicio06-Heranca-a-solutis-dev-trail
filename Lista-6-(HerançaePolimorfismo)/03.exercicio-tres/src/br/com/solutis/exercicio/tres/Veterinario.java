package br.com.solutis.exercicio.tres;

import br.com.solutis.exercicio.um.Animal;
import br.com.solutis.exercicio.um.Cachorro;
import br.com.solutis.exercicio.um.Cavalo;
import br.com.solutis.exercicio.um.Preguica;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.getNome());
        animal.emitirSom();
    }

        public static void main(String[] args) {
            // Criando instâncias dos animais
            Animal cachorro = new Cachorro("Rambo", 10);
            Animal cavalo = new Cavalo("Patron", 7);
            Animal preguica = new Preguica("Jailson", 3);

            Veterinario veterinario = new Veterinario();

            // Examinando os animais
            veterinario.examinar(preguica);
            veterinario.examinar(cachorro);
            veterinario.examinar(cavalo);
        }
    }