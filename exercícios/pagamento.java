import java.time.*;
import java.time.format.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class pagamento{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Data prevista: ");
    String dataPrevista = scanner.nextLine();

    System.out.print("Data pagamento: ");
    String dataPagamento = scanner.nextLine();

    System.out.print("Valor: ");
    double valor = scanner.nextDouble();

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate dataPrev = LocalDate.parse(dataPrevista, formato);
    LocalDate dataPgmt = LocalDate.parse(dataPagamento, formato);

    long diferenca = ChronoUnit.DAYS.between(dataPgmt, dataPrev);


    if(diferenca < 0) {
       double juros = valor * 0.02;
       valor += juros;
       System.out.println("\nPagamento em atraso.");
       System.out.printf("Dias de atraso: %d\n", diferenca * (-1));
       System.out.printf("Juros: R$%.2f\n", juros);
       System.out.printf("Valor final: R$%.2f\n", valor );
    }else{
      System.out.println("\nPagamento realizado no prazo." );
      System.out.printf("Valor Final: R$%.2f\n", valor );
    }
   
    scanner.close();
   }
}