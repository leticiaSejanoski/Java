import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite o cpf: ");
        String cpf = "22233366638";


        int soma = 0;
        int contador = 10;
        int igual = 0;
        for(int i = 0; i < 9; i++){
            if(cpf.charAt(i) == cpf.charAt(0)) igual += 1;
                 
            if(igual == 9){
                System.out.println("CPF inválido (dígitos iguais)");
                return;
            }  
                soma += (cpf.charAt(i) - 48) * (contador - i) ;
            }
            
            System.out.println(soma);
            
            int resto = soma % 11;
            int digitVerificador = 0;
            if(11 - resto < 9){
                digitVerificador = cpf.charAt(9);
            } 

            
            System.out.print(digitVerificador);
            
            if(digitVerificador != cpf.charAt(9) - 48){
                System.out.println("\nCPF inválido!");
                return;
            }
            
            System.out.println("\nCPF válido!");
            scanner.close();
        }
    }
    
