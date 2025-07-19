package com.exercicio.valores;

import java.util.Scanner;

public class ExercicioVetoresUm {
    static int[] vetorInteiro = new int[5];
    static char[] vogais = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        ExercicioVetoresUm.inserirValoresVetor(input);
        ExercicioVetoresUm.contarString(input);
    }
    public static void inserirValoresVetor(Scanner input) {
        System.out.println("Iniciando....");
        System.out.println("Preencha o valores abaixo, usando inteiros:");
       for (int i=0; i< vetorInteiro.length; i++) {
           System.out.println("Digite um valor para ["+ i +"]:");
           vetorInteiro[i] = input.nextInt();
       }
       ExercicioVetoresUm.mostrarVetorOrdenado();
    }

    public static void mostrarVetorOrdenado() {
        for (int i=0; i< vetorInteiro.length; i++) {
            for (int j= i; j< vetorInteiro.length; j++) {
                int temp = vetorInteiro[i];
                if(vetorInteiro[i] > vetorInteiro[j]) {
                    vetorInteiro[i] = vetorInteiro[j];
                    vetorInteiro[j] = temp;
                }
            }
        }

        String valores = "[ ";
        for(int a=0; a< vetorInteiro.length; a++) {
            if(a != 0) {
                valores += ", " +  vetorInteiro[a];
            }else{
                valores += vetorInteiro[a];
            }
        }
        valores += " ]";
        System.out.println(valores);
    }

    public static void contarString(Scanner input){
        input.nextLine();
        System.out.println("Infome uma palavra:");
        String palavra = input.nextLine().toLowerCase();

        input.close();

        int quantidadeVogais = 0;
        String vogaisEncontradas = "";
        for(int a=0; a < palavra.length(); a++) {
            for (int b=0; b< vogais.length; b++) {
                if(palavra.charAt(a) == vogais[b]) {
                    quantidadeVogais++;
                    if(vogaisEncontradas.isEmpty()) {
                        vogaisEncontradas += vogais[b];
                    }else{
                        vogaisEncontradas += ", " + vogais[b];
                    }
                }
            }
        }

        System.out.println("A palavra '" + palavra + "' tem " +quantidadeVogais +" vogais, são elas: ("+ vogaisEncontradas +")");
    }
}
