import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o cpf: ");
        String cpf = scanner.nextLine();

        int soma = 0;
        int contador = 10;
        int igual = 0;
        for (int i = 0; i < 9; i++) {
            if (cpf.charAt(i) == cpf.charAt(0))
                igual += 1;

            if (igual == 9) {
                System.out.println("CPF inválido (dígitos iguais)");
                return;
            }
            soma += (cpf.charAt(i) - 48) * (contador - i);
        }


        int resto = soma % 11;
        int digitVerificador = 0;
        if (11 - resto <= 9) {
            digitVerificador = 11 - resto;
        }

        contador = 11;
        soma = 0;
        int digitVerificador2 = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - 48) * (contador - i);
        }
        soma += digitVerificador * 2;
        
        resto = soma % 11;
        if (11 - resto <= 9) {
            digitVerificador2 = 11 - resto;
        }

        if (digitVerificador != cpf.charAt(9) - 48 || digitVerificador2 != cpf.charAt(10) - 48) {
            System.out.println("\nCPF inválido!");
            return;
        }

        System.out.println("\nCPF válido!");
        scanner.close();
    }
}
