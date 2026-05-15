import java.time.*;
import java.time.format.*;
import java.util.*;
public class adicionaDias{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a data: ");
    String data = scanner.nextLine();

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate dataOriginal = LocalDate.parse(data, formato);

    LocalDate addSete = dataOriginal.plusDays(7);
    LocalDate addTrinta = dataOriginal.plusDays(30);
    LocalDate addAno = dataOriginal.plusYears(1);

    System.out.println("Data original: " + dataOriginal.format(formato));
    System.out.println("+7 dias: " + addSete.format(formato));
    System.out.println("+30 dias: " + addTrinta.format(formato));
    System.out.println("+1 ano: " + addAno.format(formato));

    scanner.close();
   }
}