package ArvoreAVL;

public class Main {

    public static void main(String[] args) {
        NoAVL raiz = new NoAVL(10);
        System.out.println("Árvore binaria balanceada");
        System.out.println("Criando arvore com a raiz " + raiz.valor);
        System.out.println("=================================== INSERIR ==============================================");
        //a) 10  15  12  25  18  07  08  14
        //ArvoreAVL.inserir(raiz, 10);
        ArvoreAVL.inserir(raiz, 15);
        ArvoreAVL.inserir(raiz, 4);
        ArvoreAVL.inserir(raiz, 2);
        ArvoreAVL.inserir(raiz, 3);
        ArvoreAVL.inserir(raiz, 1);
        ArvoreAVL.inserir(raiz, 12);
        ArvoreAVL.inserir(raiz, 25);
        ArvoreAVL.inserir(raiz, 18);
        System.out.println("==================================== REMOVER ===============================================");
        ArvoreAVL.remover(raiz, 1);
        ArvoreAVL.inserir(raiz, 7);
        ArvoreAVL.inserir(raiz, 8);
        ArvoreAVL.inserir(raiz, 14);

        System.out.println("=================================== PREORDEM ==============================================");
        ArvoreAVL.preordem(raiz);
        System.out.println("=================================== IN ORDEM ==============================================");
        ArvoreAVL.ordem(raiz);
        System.out.println("=================================== POS ORDEM ==============================================");
        ArvoreAVL.posordem(raiz);
        System.out.println("============================================================================================");
        ArvoreAVL.encontraMaximo(raiz);
        System.out.println("quantidade folhas" + ArvoreAVL.folhas(raiz));
        System.out.println("Quantiade nos " + ArvoreAVL.contarNos(raiz));
        System.out.println("Altura " + ArvoreAVL.altura(raiz));

    }
}
