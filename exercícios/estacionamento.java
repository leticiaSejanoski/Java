import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a placa: ");
        String placa = scanner.nextLine();

        System.out.print("Digite a hora de entrada: (hh:mm): ");
        String entrada = scanner.nextLine();

        System.out.print("Digite a hora de saída: (hh:mm): ");
        String saida = scanner.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaEntrada = LocalTime.parse(entrada, formato);
        LocalTime horaSaida = LocalTime.parse(saida, formato);

        Duration diferenca;

        diferenca = Duration.between(horaEntrada, horaSaida);

        long minutos = diferenca.toMinutes();

        if (minutos < 0) {
            minutos += 24 * 60;
        }

        double total = 5.00;
        int i = 0;
        long minutosTotais = minutos - 60;
        while (minutosTotais > 0) {
            minutosTotais -= 15;
            i += 1;
        }

        total += i * 2;

        System.out.println("--------------------");
        System.out.println("Recibo");
        System.out.println("--------------------");
        System.out.printf("Placa: %s\n", placa);
        System.out.printf("Entrada: %s\n", horaEntrada.format(formato));
        System.out.printf("Saída: %s\n", horaSaida.format(formato));
        System.out.printf("Tempo total (em minutos): %d\n", minutos);
        System.out.printf("Total a pagar: R$%.2f\n", total);
        System.out.println("--------------------");

        scanner.close();
    }
}
