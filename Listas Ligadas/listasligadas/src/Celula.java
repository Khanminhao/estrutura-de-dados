public class Celula {

    private Celula proxima;

    private Object elemento;

    public Celula(Celula proximo, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula(Object elemento){
        this.elemento = elemento;
    }

    public void setProxima(Celula proxima){
        this.proxima = proxima;
    }

    public Celula getProxima() {
        return proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    @Override
    public String toString() {
        return "Celula{" +
                "proxima=" + proxima +
                ", elemento=" + elemento +
                '}';
    }
}
