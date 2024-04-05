public class Main {
    public static void main(String[] args) {

      ListaLigada lista = new ListaLigada();
      Aluno a1 = new Aluno("Glevson");
      Aluno a2 = new Aluno("Vanessa");
      Aluno a3 = new Aluno("Lis");
      Aluno a4 = new Aluno("Miguel");


      lista.adiciona(a1);
      lista.adiciona(a2);
      lista.adiciona(a3);
      lista.adiciona(a4);


      System.out.println(lista);

      System.out.println(lista.tamanho());


    }
}