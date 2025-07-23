package com.orientacao.objeto;

import java.util.Scanner;

public class OrientacaoObjeto {
    static Carro[] carro = new Carro[0];
    static char[] vogais = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iniciando sistema...");

        OrientacaoObjeto.receberEntradas(input);
        OrientacaoObjeto.mostrarResultados();
    }

    public static void mostrarResultados() {
        double valorTotal = 0;

        String modelos = "";
        for (int i = 0; i < OrientacaoObjeto.carro.length; i++) {
            valorTotal += OrientacaoObjeto.carro[i].preco;
            if (i != 0) {
                modelos += ", " + OrientacaoObjeto.carro[i].modelo;
            } else {
                modelos += OrientacaoObjeto.carro[i].modelo;
            }
        }

        System.out.println("\nTotal de carros criados foram: " + OrientacaoObjeto.carro.length);
        System.out.println("Sendos os modelo(s): " + modelos);
        System.out.println("Com valor total de: " + valorTotal);
    }

    public static void receberEntradas(Scanner input) {
        System.out.println("Quanto carros deseja criar ?");
        int quantidadeCarros = input.nextInt();

        OrientacaoObjeto.carro = new Carro[quantidadeCarros];

        for (int i = 0; i < quantidadeCarros; i++) {
            input.nextLine();
            if (i != 0) {
                System.out.println("Proximo carro...\n");
            }
            System.out.println("Digite o modelo do carro: ");
            String modeloCarro = input.nextLine();

            System.out.println("Digite a cor do carro: ");
            String corCarro = input.nextLine();

            System.out.println("Digite o preço do carro: ");
            double precoCarro = input.nextDouble();

            Carro adicionarCarro = new Carro();

            adicionarCarro.modelo = modeloCarro;
            adicionarCarro.cor = corCarro;
            adicionarCarro.preco = precoCarro;

            OrientacaoObjeto.carro[i] = adicionarCarro;
        }

        input.close();
    }
}
