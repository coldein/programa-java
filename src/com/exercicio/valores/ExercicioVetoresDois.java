package com.exercicio.valores;

import java.util.Scanner;

public class ExercicioVetoresDois {
    static int[] vetorInteiro = new int[5];

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        ExercicioVetoresDois.inserirValoresVetor(input);
    }

    public static void inserirValoresVetor(Scanner input) {
        System.out.println("Iniciando....");
        System.out.println("Preencha o valores abaixo, usando inteiros:");
        for (int i=0; i< vetorInteiro.length; i++) {
            System.out.println("Digite um valor para ["+ i +"]:");
            vetorInteiro[i] = input.nextInt();
        }
        input.close();

        ExercicioVetoresDois.processarVetor();
    }

    public static void processarVetor() {
        for (int i=0; i< vetorInteiro.length; i++) {
            if(vetorInteiro[i] % 2 ==0){
                vetorInteiro[i] = vetorInteiro[i] * 2;
            }else{
                vetorInteiro[i] = (int) Math.pow(vetorInteiro[i], 2);
            }
        }

        String conteudoVetor = "[ ";
        for (int i=0; i< vetorInteiro.length; i++) {
            if(i == 0) {
                conteudoVetor += vetorInteiro[i];
            }else {
                conteudoVetor += ", "+ vetorInteiro[i];
            }
        }
        conteudoVetor += " ]";

        System.out.println(conteudoVetor);
    }

}
