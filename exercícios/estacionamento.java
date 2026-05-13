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

        Duration diferenca = Duration.between(horaEntrada, horaSaida);

        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;

        double total = 0;
     
        System.out.println("--------------------");
        System.out.println("Recibo");
        System.out.println("--------------------");
        System.out.println("Placa:");
        System.out.println("Entrada:");
        System.out.println("Saída:");
        System.out.println("Tempo total (em minutos):");
        System.out.println("Total a pagar: ");
        System.out.println("--------------------");

     }
}
