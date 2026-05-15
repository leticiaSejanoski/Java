import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class ferias{
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a data (dd/mm/aaaa):");
        String data = scanner.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataFutura = LocalDate.parse(data,formato); 
        LocalDate dataAtual = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(dataAtual, dataFutura);

        System.out.printf("Faltam %d dias para as férias.", dias);

        scanner.close();
    }
}