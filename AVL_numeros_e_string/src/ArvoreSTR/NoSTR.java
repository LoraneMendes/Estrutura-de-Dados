package ArvoreSTR;

public class NoSTR {
    String valorDaString;
    NoSTR noEsquerda, noDireita;
    int maisAlto;

    public NoSTR(String valor) {
        this.valorDaString = valor;
    }

    public NoSTR raiz;

    public String getValor() {
        return valorDaString;
    }

    public void setValor(String valor) {
        this.valorDaString = valor;
    }

    public NoSTR getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(NoSTR noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public NoSTR getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(NoSTR noDireita) {
        this.noDireita = noDireita;
    }

    public int getMaisAlto() {
        return maisAlto;
    }

    public void setMaisAlto(int maisAlto) {
        this.maisAlto = maisAlto;
    }

    public NoSTR getRaiz() {
        return raiz;
    }

    public void setRaiz(NoSTR raiz) {
        this.raiz = raiz;
    }


}
