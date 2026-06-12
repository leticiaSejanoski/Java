public class Livro {
   private String titulo;
   private String autor;
   private int anoPublicacao;
   private int quantidadePaginas;
   private int paginasLidas = 0;
   private boolean emprestado = false;
   
   public Livro(String titulo, String autor, int anoPublicacao, int quantidadePaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.quantidadePaginas = quantidadePaginas;
   }

   public String getTitulo() {
    return titulo;
   }

   public void setTitulo(String titulo) {
    if(titulo.trim() == ""){
        System.out.println("Título inválido!");
        return;
    }
    this.titulo = titulo;
   }

   public String getAutor() {
    return autor;
   }

   public void setAutor(String autor) {
    if(autor.trim() == ""){
        System.out.println("Nome do autor inválido!");
        return;
    }
   }

   public int getAnoPublicacao() {
    return anoPublicacao;
   }

   public void setAnoPublicacao(int anoPublicacao) {
    if(anoPublicacao <=0){
        System.out.println("Ano de publicação inválido!");
        return;
    }
    this.anoPublicacao = anoPublicacao;
   }

   public int getQuantidadePaginas() {
    return quantidadePaginas;
   }

   public void setQuantidadePaginas(int quantidadePaginas) {
    if(quantidadePaginas <= 0){
        System.out.println("Quantidade de páginas inválida!");
        return;
    }
    this.quantidadePaginas = quantidadePaginas;
   }

   public void emprestarLivro(){
    if(this.emprestado == true){
        System.out.println("Este livro já está emprestado!");
        return;
    }
        this.emprestado = true;
        System.out.println("Livro emprestado!");

   }

   public void lerPaginas(int qtd){
    if(qtd > quantidadePaginas){
        System.out.println("Você não pode ler mais páginas do que o livro possui!");
        return;
    }
    System.out.printf("Mais %d páginas lidas.\n", qtd);
    paginasLidas += qtd;
   }

   public void devolverLivro(){
       if(this.emprestado == false){
           System.out.println("Este livro já está disponível na biblioteca!");
           return;
        }

        this.emprestado = false;
        this.paginasLidas = 0;
        System.out.println("Livro Devolvido!");

   }

   public void mostrarStatus(){
        if(!this.emprestado){
            System.out.printf("O livro %s está disponível.", this.titulo);
        }else{
            System.out.printf("O livro %s está emprestado e já teve %d páginas lidas de %d.\n", this.titulo, this.paginasLidas, this.quantidadePaginas);
        }
   }

   public void calcularProgressoLeitura(){
    double progresso = (double) this.paginasLidas / this.quantidadePaginas;
    System.out.printf("O percentual de leitura do livro \"%s\" é de %.1f%%.\n", this.titulo, progresso * 100);
   }

   @Override
   public String toString() {
    return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + anoPublicacao + "\nQuantidade páginas: " + quantidadePaginas + "\n";
   }

}
