package com.exercicio.valores;

import java.util.Scanner;

public class ExercicioVetoresTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Infome uma palavra: ");
        String palavra = input.nextLine().toUpperCase();
        input.close();

        ExercicioVetoresTres.invertePalavra(palavra);
    }

    public static void invertePalavra(String palavra) {
        char[] caracteres = new char[palavra.length()];

        int index = palavra.length() -1;
        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = palavra.charAt(index--);
        }

        String conteudoVetor = "";
        for (int i=0; i< caracteres.length; i++) {
            conteudoVetor += caracteres[i];
        }

        System.out.println("Palavra "+ palavra + " a contrario e: " + conteudoVetor);
    }
}
