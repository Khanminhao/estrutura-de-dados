public class ListaLigada {

    private Celula primeira;
    private Celula ultima;

    private int totalDeAlunos;

    public void adiciona(Object elemento) {
        if (this.totalDeAlunos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeAlunos++;
        }
    }
    public void adiciona(int posicao, Object elemento) {
        if (posicao < 0 || posicao > this.totalDeAlunos) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeAlunos) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.totalDeAlunos++;
        }
    }
    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }
    private Celula pegaCelula(int posicao) {
        if (posicao < 0 || posicao >= this.totalDeAlunos) {
            throw new IllegalArgumentException("Posição inválida");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
    public void remove(int posicao){
        if (posicao < 0 || posicao >= this.totalDeAlunos) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.totalDeAlunos - 1) {
            this.removeDoFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula removida = anterior.getProxima();
            anterior.setProxima(removida.getProxima());
            removida.setProxima(null);
            this.totalDeAlunos--;
        }
    }
    public int tamanho() {return this.totalDeAlunos;}
    public boolean contem(Object o) {return false;}

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;

        if(this.totalDeAlunos == 0){
            this.ultima = this.primeira;
        }
        totalDeAlunos++;
    }
    public void removeDoComeco() {
        if (this.totalDeAlunos == 0) {
            throw new IllegalStateException("Lista vazia");
        }
        Celula removida = this.primeira;
        this.primeira = removida.getProxima();
        removida.setProxima(null);
        this.totalDeAlunos--;
    }
    public void removeDoFim() {
        if (this.totalDeAlunos == 0) {
            throw new IllegalStateException("Lista vazia");
        }
        if (this.totalDeAlunos == 1) {
            this.removeDoComeco();
            return;
        }
        Celula penultima = this.pegaCelula(this.totalDeAlunos - 2);
        Celula removida = penultima.getProxima();
        penultima.setProxima(null);
        this.ultima = penultima;
        this.totalDeAlunos--;
    }

    @Override
    public String toString() {
        // Verificando se a Lista está vazia
        if(this.totalDeAlunos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeAlunos-1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }
        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}
