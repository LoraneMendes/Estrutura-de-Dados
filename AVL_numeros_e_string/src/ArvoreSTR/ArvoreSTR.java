package ArvoreSTR;

public class ArvoreSTR {
    public static NoSTR raiz;

    public static void inserirStr(String data) {
        if (raiz == null) {
            raiz = new NoSTR(data);
            return;
        }
        //se nao for null:
        NoSTR p = raiz;
        for (int i = 0; i < data.length(); i++) {
            while (true) {
                if (data.compareTo(p.getValor()) <= 0) {
                    if (p.getNoEsquerda() != null) {
                        p = p.getNoEsquerda();
                    } else {
                        p.setNoEsquerda(new NoSTR(data));
                        break;
                    }
                } else {
                    if (p.getNoDireita() != null) {
                        p = p.getNoDireita();
                    } else {
                        p.setNoDireita(new NoSTR(data));
                        break;
                    }
                }

                System.out.println("inserindo: " + p.valorDaString + " a esquerda de: " + raiz.getValor() + ".");
            }
            if (data.compareTo(p.getValor()) > 0 && p.getNoDireita() != null) {
                p = p.getNoDireita();
                System.out.println("inserindo: " + p.valorDaString + " a direita de: " + raiz.getValor() + ".");
            } else {
                break;
            }
        }

        NoSTR newNode = new NoSTR(data);
        if (data.equals(p.getValor())) {
            p.setNoEsquerda(newNode);
            System.out.println("inserindo " + p.valorDaString + " a esquerda de " + newNode.getValor() + ".");
        } else if (data.compareTo(p.getValor()) < 0) {
            p.setNoEsquerda(newNode);
            System.out.println("inserindo " + p.valorDaString + " a esquerda de " + newNode.getValor() + ".");
        } else {
            p.setNoDireita(newNode);
            System.out.println("inserindo " + p.valorDaString + " a direita de " + newNode.getValor() + ".");
        }
    }

    /**
     * pré-ordem:
     * 1. visite a raiz da árvore;
     * 2. percorra a subárvore esquerda;
     * 3. percorra a subárvore direita.
     */
    public static void preordem(NoSTR noSTR) { //esquerda 1º, dai direita
        if (noSTR != null) {
            System.out.println(noSTR.getValor() + ", ");
            ordemDECRESCENTE(noSTR.getRaiz());
            preordem(noSTR.getNoEsquerda()); //faz a stack da esquerda
            preordem(noSTR.getNoDireita());//faz a stack da direita
        }
    }

    /**
     * in-ordem:
     * 1. percorra a subárvore esquerda;
     * 2. visite a raiz da árvore;
     * 3. percorra a subárvore direita.
     *
     * @param noSTR
     */
    public static void inOrdem(NoSTR noSTR) {
        if (noSTR != null) {
            //System.out.println("ELE NAO RECONHECE A RAIZ"+noAVL.raiz);
            inOrdem(noSTR.noEsquerda);//faz a stack da esquerda
            inOrdem(noSTR.raiz);
            inOrdem(noSTR.noDireita);//faz a stack da direita
            System.out.println(noSTR.valorDaString + ", ");
        }
    }


    public static void ordemDECRESCENTE(NoSTR noSTR) {
        if (noSTR != null) {
            //System.out.println("ELE NAO RECONHECE A RAIZ"+noAVL.raiz);
            ordemDECRESCENTE(noSTR.raiz);
            //ordemDECRESCENTE(noSTR.noEsquerda);//faz a stack da esquerda
            ordemDECRESCENTE(noSTR.noDireita);//faz a stack da direita
            System.out.println(noSTR.valorDaString + ", ");
        }
    }

    /**
     * pós-ordem:
     * 1. percorra a subárvore esquerda;
     * 2. percorra a subárvore direita;
     * 3. visite a raiz da árvore.
     */
    public static void posordem(NoSTR noSTR) {
        if (noSTR != null) {
            posordem(noSTR.noEsquerda);//faz a stack da esquerda
            posordem(noSTR.noDireita);//faz a stack da direita
            System.out.println(noSTR.valorDaString + ", ");
        }
    }

    //NAO FUNCIONA, RETORNA NULL MSM COM A RAIZ NAO ESTANDO NULL
    public static Object pesquisa(String data) {
        System.out.print("achou? ");
        //NoSTR p = raiz.getRaiz();
        NoSTR p = raiz;
        if (p == null) {
            System.out.println("eh null eh null");
            return null;
            //p =raiz.noDireita.getRaiz();
        } else {
            while (p != null) {
                if (data.compareTo(p.getValor()) == 0) {
                    return p.getValor();
                } else if (data.compareTo(p.getValor()) < 0) {
                    p = p.noEsquerda;
                } else {
                    p = p.noDireita;
                }
            }
        }
        //noinspection ConstantConditions
        return p;
    }
}