//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        System.out.printf("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();


        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("Teste");
        a6.setNome("KKKKKKk");
        a7.setNome("é brincadeira hein");
        a8.setNome("aoooo potencia");
        a9.setNome("cavalo");
        a10.setNome("uuuui");
        a11.setNome("xiiiiiii");
        a12.setNome("dança gatinho dança");
        a13.setNome("uepaaa");
        a14.setNome("PARE");
        a15.setNome("è nÉ");
        a16.setNome("corre berg");
        a17.setNome("seinfi");

        System.out.println("\nAlunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);
        lista.Adiciona(a16);
        lista.Adiciona(a17);


        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        System.out.println(lista);

        //System.out.println(lista.contem(a5));


        lista.remove(3);
        lista.remove(14);
        lista.remove(5);
        lista.remove(15);
        lista.adicionaPosicao(3, a16);
        lista.adicionaPosicao(5, a17);
        System.out.println(lista);
    }
}