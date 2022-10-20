/**
 * AQUI CRIA UMA NOVA ESTRUTURA FIFO (FIRST IN FIRST OUT) PARA FAZER5 O MERGE DO EXERCICIO 2
 * https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/ explicacao, codigo diferente, nao foi utilizado aqui.
 *
 * */
public class MergeQueue {
    private static ListaL NewQueue;
    private static int tamanho;

    public MergeQueue(){
        this.tamanho = tamanho;
    }


    public static double MergeIntQueues(ListaL listaX, ListaL ListaY) throws Exception {
        NewQueue = new ListaL((listaX.tamanho() + ListaY.tamanho()));
        for (byte i = 0; i < NewQueue.tamanho(); i++) {
            try {
                if (listaX.vazia()) {
                    NewQueue.insere_ordenado(ListaY.retira_ultimo());
                } else if (ListaY.vazia()) {
                    NewQueue.insere_ordenado(listaX.retira_ultimo());
                }//else if (listaX.getPrimeiro() <= ListaY.getPrimeiro()){
                // this.NewQueue.insere_ordenado(listaX.Remove());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

}