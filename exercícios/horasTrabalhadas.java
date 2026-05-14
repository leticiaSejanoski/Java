import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class horasTrabalhadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Entrada: ");
        String entrada = scanner.nextLine();

        System.out.printf("Saída: ");
        String saida = scanner.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaEntrada = LocalTime.parse(entrada, formato);
        LocalTime horaSaida = LocalTime.parse(saida, formato);

        Duration diferenca = Duration.between(horaEntrada, horaSaida);

        long totalMinutos = diferenca.toMinutes();
        
        
        if(horaSaida.isBefore(horaEntrada)){
            totalMinutos += 24 * 60;
        }
        
        long horas = totalMinutos / 60;
        long minutos = totalMinutos % 60;


        boolean extra = false;

        if(horas >= 8) extra = true;

        System.out.printf("-----------------------------\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Entrada: %s\n", horaEntrada.format(formato) );
        System.out.printf("Saída: %s\n", horaSaida.format(formato));
        System.out.printf("Horas trabalhadas: %s horas e %s minutos\n", horas, minutos);
        System.out.printf("Horas extras: %s\n", extra? "Sim" : "Não");
        System.out.printf("-----------------------------\n");


        scanner.close();

    }
}
