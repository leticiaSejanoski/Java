
import java.util.*;
 
class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Double> conta = new ArrayList<>();
        
        double saldo_inicial, operacao, creditos = 0, debitos = 0, cpmf, saldo_final;
        
        System.out.print("Saldo inicial: ");
        saldo_inicial = scanner.nextDouble();
        
        do{
            System.out.print("Operacao: ");
            operacao = scanner.nextDouble();
            
            if(operacao != 0){
            conta.add(operacao);
            }
        }while(operacao != 0);
        
            
            for(double op : conta){
                if(op > 0){
                creditos += op;
            }
            else{
                debitos += op;
            }
    }
            
        debitos = debitos * -1;
        cpmf = debitos * 0.004f;
        saldo_final = saldo_inicial + creditos - debitos - cpmf;
        
        System.out.printf("------------------------\n");
        System.out.printf("Creditos.....: R$ %.2f\n", creditos);
        System.out.printf("Debitos......: R$ %.2f\n", debitos);
        System.out.printf("C.P.M.F......: R$ %.2f\n", cpmf);
        System.out.printf("Saldo........: R$ %.2f\n", saldo_final);
        System.out.printf("------------------------\n");
        scanner.close();
    }
}

