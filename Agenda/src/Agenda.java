import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public static void menuPrincipal(){
        System.out.println("\n\n======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }

    
    public static void menuEditar(){
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void adicionarContato(ArrayList<Contato> lista, Scanner scanner){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contato c = new Contato(nome, telefone, email);
        lista.add(c);
        System.out.println("Contato adicionado!");
    }

    public static void editarTelefone(ArrayList<Contato> lista, Scanner scanner) {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nome)){
                System.out.println("Novo telefone: ");
                String novoTelefone = scanner.nextLine();
                lista.get(i).setTelefone(novoTelefone);
                System.out.println("Telefone alterado!");
            }else{
                System.out.println("Contato não existe!");
            }
        }
    }

    public static void editarEmail(ArrayList<Contato> lista, Scanner scanner) {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nome)){
                System.out.println("Novo Email: ");
                String novoEmail = scanner.nextLine();
                lista.get(i).setEmail(novoEmail);
                System.out.println("Email alterado!");
            }else{
                System.out.println("Contato não existe!");
            }
        }
    }

    public static void editarContato(ArrayList<Contato> lista, Scanner scanner){
        if(lista.isEmpty()){
            System.out.printf("Lista vazia!");
            return;
        }

        int opcao = 0;

        while(opcao != 3){
            menuEditar();
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 3){
                return;
            }

            switch (opcao) {
                case 1:
                 editarTelefone(lista, scanner);
                 break;
                case 2: 
                 editarEmail(lista, scanner);
                 break;
                default: 
                 System.out.println("Opção inválida!");
                 break;
            }
        }
    }

    public static void excluirContato(ArrayList<Contato> lista, Scanner scanner){
        if(lista.isEmpty()){
            System.out.printf("Lista vazia!");
            return;
        }

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nome)){
                lista.remove(i);
                System.out.println("Contato excluído!");
            }else{
                System.out.println("Contato não existe!");
            }
        }
    }

    public static void listarContatos(ArrayList<Contato> lista) {
        if(lista.isEmpty()){
            System.out.printf("Lista vazia!");
            return;
        }

        for (Contato contato : lista) {
            System.out.printf("\n%-20s | %14s | %-20s", contato.getNome(), contato.getTelefone(), contato.getEmail());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();

        int opcao = 0;

        while (opcao != 5) {
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 5){
                return;
            }

            switch (opcao) {
                case 1:
                    adicionarContato(lista, scanner);
                    break;
                case 2:
                    editarContato(lista, scanner);
                    break;
                case 3:
                    excluirContato(lista, scanner);
                case 4:
                    listarContatos(lista);
                break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

