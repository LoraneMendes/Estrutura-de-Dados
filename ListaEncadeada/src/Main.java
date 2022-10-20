import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaL lista = new ListaL();
        System.out.println("\n==========================================\nTDE 2 Implementação de Listas e Aplicações\n");
        lista.vazia();
        lista.insere_primeiro(100);
        lista.insere_ultimo(200);
        lista.insere_primeiro(300);
        lista.insere_ultimo(400);
        lista.exibeUlt();//        int ultimo_elemento();   // Retorna a informação do último elemento da Lista

        System.out.println("\n==========================================\nprinta a lista completa");
        lista.mostra_lista();
        lista.vazia();

        lista.retira_ultimo();
        lista.retira_primeiro();
        System.out.println("\n==========================================\nprinta a lista depois dos remove\n");
        lista.mostra_lista();


        System.out.println("\n==========================================\n inseriu o 400 e inseriu o 333 depois:\n");
        lista.insere_ultimo(400);
        lista.insere_depois(lista.primeiro, 333);
        lista.mostra_lista();
        System.out.println("\n==========================================\nretira depois no meio da lista");
        lista.reitradepois(lista.primeiro.getProximo());
        lista.mostra_lista();
        System.out.println("\n==========================================\nINSERE ORDENADO");
        lista.insere_ordenado(288);

        lista.insere_ordenado(130);
        lista.insere_ordenado(129);

        lista.mostra_lista();
        System.out.println("\n==========================================\nEXERCICIO 1\n==========================================");


        ListaL listaX = new ListaL();
        listaX.insere_primeiro(10);
        listaX.insere_ultimo(15);
        listaX.insere_primeiro(12);
        listaX.insere_ultimo(17);

        ListaL listaY = new ListaL();
        listaY.insere_primeiro(14);
        listaY.insere_ultimo(11);
        listaY.insere_primeiro(16);
        listaY.insere_ultimo(13);


        //int xy = listaX.questaoUm() * listaY.questaoUm(); DEL DEL DEL
        /**
         * 1) (Valor 0.5) Cálculo de similaridade entre duas listas com MESMO tamanho n utilizando a função do cosseno:
         * */
        //System.out.println("v1) Similaridade do cosseno entre as listas X e Y:" + StrictMath.cos(xy)); //ESSE AQUI TA MATEMATICAMENTE ERRADO DEL DEL DEL
        //System.out.println(MergeQueue.MergeIntQueues(listaX,listaY)); //ver esse aqui...
        System.out.println("v2) Similaridade do cosseno entre as listas X e Y: "+StrictMath.cos(MergeQueue.MergeIntQueues(listaX,listaY)));


        /**(Valor  0.5)  Determinação  da  interseção  entre  duas  listas  de  inteiros  de
         tamanho  quaisquer.  Dadas  duas  listas  X  e  Y,  retorne  uma  terceira  lista
         ORDENADA que contém os elementos comuns entre elas.
         * */
        System.out.println("\n==========================================\nEXERCICIO 2\n==========================================");
        ListaL listaZ = new ListaL();
        listaZ.insere_ordenado((int) MergeQueue.MergeIntQueues(listaX,listaY));
        System.out.println(new StringBuilder().append("Exercício 2: A lista criada a aprtir de outras duas listas é: ").append(listaZ.toString()).toString());
        //arrumar
        double newQ = MergeQueue.MergeIntQueues(listaX,listaY);
        System.out.println(newQ);
    }
}
