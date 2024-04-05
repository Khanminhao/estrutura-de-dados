public class AlunoLista {
    private String nome;
    private int idade;

    private AlunoLista proximo;

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public String toString(){
        return this.nome;
    }

    public boolean equals(Object o){
        AlunoLista outro = (AlunoLista)o;
        return this.nome.equals(outro.nome);
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
