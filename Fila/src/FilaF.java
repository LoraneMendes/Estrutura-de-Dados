import java.util.Arrays;

public class FilaF {

    private int primeiro;
    private int ultimo;
    public int MAX;
    private int[] dado;
    public int tamanho;
    String elementos;


    // --------------- CONSTRUTORES ---------------
    public FilaF(int tamanho) {
        // inicializa��es
        this.ultimo = -1; //aqui sao objetos OU  atributos?
        this.primeiro = 0;
        dado = new int[tamanho];
        this.MAX = tamanho;
        this.tamanho = 0;
    }




    // --------------- METODOS ---------------
    public void insere(int elemento) { //int elemento � uma instancia da classe
        if (this.tamanho < this.MAX) {
            if (this.ultimo == MAX - 1)
                this.ultimo = 0;
            else
                this.ultimo++;
            dado[this.ultimo] = elemento;
            this.tamanho++;
        } else
            System.out.println("Fila cheia");
    }

    public int remove(int elemento){
        if(this.tamanho!=0){
            int valor_primeiro = dado[primeiro];
            if(primeiro == MAX -ultimo){
                primeiro =0;
            } else{
                primeiro++;
                tamanho--;
                return valor_primeiro;
            }
        }
        return elemento;
    }

    public boolean vazia() {
        if(primeiro == -1) {
            return true;
        }
        else {
            return false;
        }
    }


    public int primeiro() {
        if(!vazia()) {
            return dado[primeiro];
        }
        else {
            return -1;
        }
    }


    public int ultimo(int elemento) {
        if (!vazia()) {
            return dado[ultimo];
        } else {
            return -1;
        }
    }


    public FilaF merge(FilaF f1,FilaF f2) {
        FilaF f3 = new FilaF(f1.tamanho+f2.tamanho);
        for(int i=0; i<f1.tamanho; i++) {
            if(f1.dado[i] != 0 || f1.dado[i] != 1) {
                f3.insere(f1.dado[i]);
            }}
        for(int j=0; j<f2.tamanho; j++) {
            if(f2.dado[j] !=0 || f2.dado[j] != 1) {
                f3.insere(f2.dado[j]);
            }
        }
        Arrays.sort(f3.dado);
        return f3;
    }

    // --------------- getters e setters ---------------


    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public void setMAX (int MAX){
        this.MAX = MAX;
    }

    public int getTamanho () {
        return tamanho;
    }

    public int[] getDado () {

        return dado;
    }

    public void setTamanho ( int tamanho){
        this.tamanho = tamanho;
    }

    public void setDado ( int[] dado){
        this.dado = dado;
    }

    public int getPrimeiro () {
        return primeiro;
    }

    public int getUltimo () {
        return ultimo;
    }

    public void setPrimeiro ( int primeiro){
        this.primeiro = primeiro;
    }

    public void setUltimo ( int ultimo){
        this.ultimo = ultimo;
    }

    public int getMAX () {
        return MAX;
    }

}
