import java.util.Arrays;
import java.util.Scanner;

public class InteracaoUsuario {
    public static void main(String[] args) {
        int idade;

        double altura = 0, peso = 0;

        String nome = "", documento = "", estadoCivil = "";
        String[] estadoCivilPermitido = {"solteiro", "casado", "divorciado", "viúvo"};

        Scanner input = new Scanner(System.in);

        System.out.println("Iniciando sistema....");
        System.out.println("Seja Bem-vindo(a)");

        do {
            System.out.println("Digite seu nome completo: ");
            nome = input.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Seu nome não pode estar vazio!\n");
            }
        } while (nome.isEmpty());

        do {
            System.out.println("Digite seu CPF: ");
            documento = input.nextLine().trim();
            if (documento.isEmpty()) {
                System.out.println("Seu CPF não pode estar vazio!");
            }

        } while (documento.isEmpty());

        do {
            System.out.println("Digite seu estado civil (solteiro, casado, divorciado, viúvo): ");
            estadoCivil = input.nextLine().trim().toLowerCase();
            if (estadoCivil.isEmpty()) {
                System.out.println("Seu estado civil estar vazio!");
            } else if (!Arrays.asList(estadoCivilPermitido).contains(estadoCivil)) {
                estadoCivil = "";
                System.out.println("Estado civil inválido!");
            }
        } while (estadoCivil.isEmpty());

        do {
            System.out.println("Digite sua idade: ");
            while (!input.hasNextInt()) {
                System.out.println("Entrada inválida. Digite novamente:");
                input.next();
            }
            idade = input.nextInt();
            if (idade <= 0) {
                System.out.println("O valor deve ser positivo.");
            }

        } while (idade <= 0);

        do {
            System.out.println("Digite seu peso: ");
            while (!input.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite novamente:");
                input.next();
            }
            peso = input.nextDouble();
            if (peso <= 0) {
                System.out.println("O valor deve ser positivo.");
            }
        } while (peso <= 0);

        do {
            System.out.println("Digite sua altura: ");
            while (!input.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite novamente:");
                input.next();
            }
            altura = input.nextDouble();
            if (altura <= 0) {
                System.out.println("O valor deve ser positivo.");
            }
        } while (altura <= 0);

        input.close();
    }
}
