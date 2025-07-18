import java.util.Scanner;

public class Vetores {
    static int[] vetor = new int[0];
    static String[] vetorString = new String[0];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tamanho do vetor:");
        int tamanhoVetor = input.nextInt();
        //vetor = new int[tamanhoVetor];
        vetorString = new String[tamanhoVetor];

        Vetores.printString(input, tamanhoVetor);
    }

    public static void printInt(Scanner input, int tamanhoVetor) {
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Valor da posição " + i + " do vetor:");
            int valorPosicao = input.nextInt();

            vetor[i] = valorPosicao;
        }

        System.out.println("Multiplicar por: ?");
        double multiplicacao = input.nextDouble();

        input.close();

        String posicoes = "[ ";
        for (int i = 0; i < vetor.length; i++) {
            if (i != 0) {
                posicoes += ", " + vetor[i] * multiplicacao;
            } else {
                posicoes += vetor[i] * multiplicacao;
            }
        }
        posicoes += " ]";
        System.out.println("Valores do vetor: " + posicoes);
    }

    public static void printString(Scanner input, int tamanhoVetor) {
        input.nextLine();
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite um valor para posição [" + i + "] :");
            String valor = input.nextLine();
            vetorString[i] = valor;
        }

        System.out.println("Qual palavra adicionar ?");
        String palavraAdicional = input.nextLine();

        for (int i = 0; i < tamanhoVetor; i++) {
            vetorString[i] = (vetorString[i] + " " + palavraAdicional).toUpperCase();
            //vetorString[i] = vetorString[i].concat(palavraAdicional).toUpperCase(); // alternativo
            // primeiroPosicao = vetorString[i].charAt(0);
            vetorString[i] = vetorString[i] + vetorString[i].charAt(0);
            //vetorString[i] = vetorString[i].concat(String.valueOf(primeiroPosicao)); // alternativo
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            if (i > 0) {
                String temp = vetorString[i - 1];
                vetorString[i - 1] = vetorString[i];
                vetorString[i] = temp;
            }
        }

        String posicoes = "[ ";
        for (int i = 0; i < vetorString.length; i++) {
            if (i != 0) {
                posicoes += ", " + vetorString[i];
            } else {
                posicoes += vetorString[i];
            }
        }
        posicoes += " ]";

        System.out.println("Valores do vetor: " + posicoes);
    }
}
