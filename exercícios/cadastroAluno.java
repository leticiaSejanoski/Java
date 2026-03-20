import java.util.*;

 
class SistemaCadastro {
    
    //public enum Menu{Adicionar = 1, Listar, Buscar, Remover, Sair }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        
        int opcao;
        
        while(true){
            System.out.print("\n===== MENU =====\n");
            System.out.print("[1] Adicionar aluno\n");
            System.out.print("[2] Listar alunos\n");
            System.out.print("[3] Buscar aluno\n");
            System.out.print("[4] Remover aluno\n");
            System.out.print("[5] Sair\n");
            
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            
            if(opcao == 5){
                break;
            }
            
            switch(opcao){
                case 1:
                System.out.print("Digite o nome do aluno: ");
                alunos.add(scanner.next());
                System.out.print("Aluno adicionado com sucesso!\n");
                break;
                    
                case 2:
                    if(alunos.isEmpty()){
                    System.out.print("Nenhum aluno cadastrado.\n");
                    break;
                    }
                    
                    Collections.sort(alunos);
                    System.out.print("Alunos cadastrados: \n");
                    
                    int i = 1;
                    for(String aluno : alunos){
                        System.out.printf("%d - %s\n", i, aluno);
                        i++;
                    }
                break;
                
                case 3:
                    if(alunos.isEmpty()){
                    System.out.print("Nenhum aluno cadastrado.\n");
                    break;
                    }
                    
                    System.out.print("Digite o nome do aluno para buscar: ");
                    
                    if(alunos.contains(scanner.next())){
                        System.out.print("Aluno encontrado!\n");
                    }else{
                         System.out.print("Aluno nao encontrado!\n");
                    }
                    
                break;
                    
                case 4:
                    if(alunos.isEmpty()){
                    System.out.print("Nenhum aluno cadastrado.\n");
                    break;
                    }
                    
                    System.out.print("Digite o nome do aluno para remover: ");
                    
                    String nome = scanner.next();
                    if(alunos.contains(nome)){
                        alunos.remove(nome);
                        System.out.print("Aluno removido com sucesso!\n");
                    }else{
                         System.out.print("Aluno nao encontrado!\n");
                    }
                break;
                
                default:
                System.out.print("Opcao invalida!");
                break;
            }
        }
        scanner.close();
    }
}