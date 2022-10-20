public class ListaL {
    public static No primeiro;
    public No ultimo;
    public int tamanho;
    public double NewQueue;


    public ListaL() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;

    }



    public ListaL(int i) {//DEL DEL DEL?
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }


    public No getUltimo() {
        return ultimo;
    }

    public No setUltimo(No ultimo) {
        this.ultimo = ultimo;
        return ultimo;
    }

    /**
     * boolean vazia(); // Verifica se a lista L está vazia
     */
    public boolean vazia() {
        if (primeiro == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("lista cheia");
        }
        return false;
    }

    /**
     * int retira_primeiro(); // Retira o primeiro elemento da Lista e retorna o valor da info do No
     */
    public int retira_primeiro() {
        if (primeiro == null) {
            System.out.println("lista vazia");
            return 0;
        } else {
            int temp = primeiro.getValor();
            primeiro = primeiro.getProximo();
            return temp;
        }
    }

    /**
     * void insere_primeiro( int info);    // Insere o elemento info como primeiro na lista L
     */
    public void insere_primeiro(int valor) {
        if (primeiro == null) {
            primeiro = new No(valor);
            this.tamanho++;
        } else {
            No newNode = new No(valor); //aqui ele cria um novo elemento, "bolinha" na lista
            newNode.setProximo(primeiro);
            primeiro = newNode;
            this.tamanho++;
        }
    }

    /**
     * void insere_ultimo(int info);       // Insere o elemento info como último na lista L
     */
    public void insere_ultimo(int valor) {
        if (primeiro == null) {
            primeiro = new No(valor);
        } else {
            No newNode = new No(valor);
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(newNode);
            this.tamanho++;
        }
    }

    /**
     * int retira_ultimo();           // Retira o último elemento da Lista e retorna a informação do Nó
     */
    public int retira_ultimo() {
        if (primeiro == null) {
            System.out.println("lita vazia");
            return 0;
        } else if (primeiro.getProximo() == null) {
            int temp = primeiro.getValor();
            primeiro = null;
            return temp;
        } else {
            No atual = primeiro;
            while (atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
            int temp = atual.getProximo().getValor();
            atual.setProximo(null);
            return temp;
        }
    }

    /**
     * void mostra_lista();                            // Mostra em Tela os Elementos da Lista L
     * @return
     */
    public Object mostra_lista() { //e remover o oibject
        No atual = primeiro;
        while (atual.getProximo() != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
        System.out.println(atual.getValor());
        return null;
    }

    /**
     * void insere_depois(Node * No, int info);  // Insere o elemento info depois do nó No
     */
    public void insere_depois(No prev_node, int valor) {
        if (prev_node == null) {
            System.out.println("vazioo");
        }
        No new_node = new No(valor);
        new_node.proximo = prev_node.proximo;
        prev_node.proximo = new_node;
    }

    /**
     * int retira_depois(Node No);             // Retira o elemento posterior ao nó No e retorna a sua informação
     */
    public int reitradepois(No prev_node) {
        if (prev_node == null) {
            System.out.println("vazio");
        } else if (prev_node.getProximo() == null) {
            System.out.println("vazio");
        } else {
            int removedValue = prev_node.proximo.getValor();
            // A ideia aqui é olhar o próximo valor e retirar ele, mas ele esta pegando um valor no meio da lista, tem que passar ele pros anteriores, tem que fazer isso até a lista acabar...

            prev_node.setProximo(null);
            System.out.println("o valor removido foi:" + removedValue);
            return removedValue;

        }
        return 0;
    }


    //aqui a funcao de deletar o ultimo foi reaproveitada
    public void exibeUlt() {
        No atual = primeiro;
        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }
        int temp = atual.getProximo().getValor();
        System.out.println("Ultimo elemento: " + temp);
    }




    public int tamanho() {
        return tamanho;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    //essa aqui é para o add_ordenado
    No numMenorQue(int valor){
        //aqui cria o 'No n' como um nó auxiliar, entao a leitura dele é possível se a lista nao estiver vazia.
        for(No n = this.primeiro; null != n; n = n.getProximo()){ //de forma que o nó auxiliar sempre vai ser o primeiro indo para o próximo.
            if (valor > n.getValor()) {
                if ((null == n.getProximo()) || (valor < n.getProximo().getValor())) { //aqui faz a comparação logica
                    return n;
                }
            }
        }
        return null;
    }


    //void insere_ordenado(int info); // Insere o elemento info de maneira ordenada na lista
    public void insere_ordenado(int valor) throws Exception{
        //aqui inicia a lista...
        if (this.primeiro == null){
            this.primeiro = new No(valor);
        }else{
            //caso a lista ja esteja iniciada, ele volta para a função do menorQue, assim, cria a ordem, começando do segundo valor ja
            if (null != numMenorQue(valor)) {
                No aux = numMenorQue(valor); //aqui ele cria um objeto auxiliar que será o proximo
                No newNode = new No(valor); //cria o espaço para o novo valor
                newNode.setProximo(aux.getProximo()); //faz o mesmo esquema do adicionar
                aux.setProximo(newNode); //recebe o proximo nodo como o nó atual (auxiliar, no caso)
            }
        }
    }

}