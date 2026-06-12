public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro("Java Basico", "João Silva", 2020, 200);
        Livro l2 = new Livro("POO na Prática", "Maria Souza", 2022, 150);

        System.out.print(l1);
        System.out.println("-----");
        System.out.print(l2);
        System.out.println("\n");

        l1.emprestarLivro();
        l1.emprestarLivro();
        l1.lerPaginas(50);
        l1.lerPaginas(250);
        l1.devolverLivro();
        l1.calcularProgressoLeitura();
        l1.mostrarStatus();
    }
}
