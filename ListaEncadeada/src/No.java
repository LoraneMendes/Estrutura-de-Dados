public class No {
    int valor;
    No proximo;
    private No ultimo;
    private No primeiro;


    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.ultimo = null;
        this.primeiro = null;

    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
}
