/* Biblioteca para leitura de dados do teclado e arquivos */
import java.util.Scanner;
/* Biblioteca para usar listas dinâmicas (ArrayList) */
import java.util.ArrayList;
/* Biblioteca para representar e manipular arquivos */
import java.io.File;
import java.util.Comparator;

 
class Consumo {
    public static void main(String[] args) throws Exception {
 
        /* Lista que armazenará os contatos em memória */
        ArrayList<Usuario> lista = new ArrayList<>();
 
        /* Representa o arquivo consumo.txt */
        File arquivo = new File("ConsumoEmDisco/consumo.txt");
 
        /* Verifica se o arquivo existe */
        if (arquivo.exists()) {
 
            /* Scanner usado para ler o arquivo */
            Scanner leitor = new Scanner(arquivo);
 
            /* Enquanto houver linhas no arquivo */
            while (leitor.hasNextLine()) {
 
                /* Lê uma linha completa */
                String linha = leitor.nextLine();
 
                /* Divide a linha usando ";" */
                String[] partes = linha.split(";");
 
                /* Guarda cada parte em variáveis */
                String usuario = partes[0];
                String espaco = partes[1];

                /* Cria um objeto Usuario e adiciona ao ArrayList */
                lista.add(new Usuario(usuario, Double.parseDouble(espaco)));
            }
 
            /* Fecha o leitor do arquivo */
            leitor.close();
        }
                lista.sort(Comparator.comparing(Usuario::getUsuario));
                System.out.printf("%-5s| %-22s | %-20s| %-10s\n", "Nr.", "Usuário", "Espaço utilizado", "% de uso");

                System.out.println("------------------------------------------------------------------------------");

                
                int i = 1;
                double total = 0;
                

                for (Usuario u : lista) {
                     total += (u.getEspaco()/ 1024) / 1024;
                }

                for (Usuario u : lista) {
                     double mb = (u.getEspaco()/ 1024) / 1024;
                     double porcentagem = (mb/total) * 100;
                     System.out.printf("%-5d| %-20s MB| %-20.2f| %-10.2f\n", i, u.getUsuario(), mb, porcentagem);
                     i++;
                }

                double media = total / (i-1);

                System.out.println("-----------------------------------------------------------------------------");

                System.out.printf("Espaço total ocupado: %.2f MB\n", total);
                System.out.printf("Espaço médio ocupado: %.2f MB\n", media);

            }
        }

