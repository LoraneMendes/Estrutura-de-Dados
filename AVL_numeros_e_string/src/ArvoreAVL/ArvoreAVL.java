package ArvoreAVL;


public class ArvoreAVL {
    public static void inserir(NoAVL noAVL, int valor){
        //condicao para quando a raiz = null, vazia
        if( noAVL == null){
            NoAVL raiz = new NoAVL(valor); //cria uma nova raiz
        } else { //se a condicao for falsa, então...
            if(valor < noAVL.valor){ //valor é a variável i, se menor que o valor do nó,
                if(noAVL.noEsquerda != null){ //e o nó da esquerda diferente de null
                    inserir(noAVL.noEsquerda, valor); //insere a esquerda
                } else {
                    System.out.println("Inserindo "+ valor + " a esquerda de "+ noAVL.valor); //se o nó for vazio, adiciona ali:
                    noAVL.noEsquerda = new NoAVL(valor);//se o nó for vazio, adiciona ali:
                }

            } else { //se a condição do valor lido for maior que o nó:
                if(noAVL.noDireita != null) { //e diferente de null
                    inserir(noAVL.noDireita, valor); //insere à direita
                } else { //se for == null
                    System.out.println("Inserindo "+ valor + " a direita de "+ noAVL.valor);
                    noAVL.noDireita = new NoAVL(valor); //insere o novo elemento maior a direita.
                }
            }
        }
    }

    public static NoAVL removerMinimo(NoAVL noAVL){
        if(noAVL == null){ //se o nó for vazio:
            System.out.println("Arvore vazia"); //avisa que esta vazio
        } else if (noAVL.noEsquerda != null){ //se a condicao for falsa, e o nó não for vazio:
            noAVL.noEsquerda = removerMinimo(noAVL.noEsquerda); //chamada recursiva em que cria a stack (empilha) de valores do noEsquerda e dai substitui o valor:
            return noAVL; //aqui, substitui o valor por meio do return
        } else { //vai para a direita:
            return noAVL.noDireita;
        }
        return null; //retorna null porque remove, nao void, sem valor.
    }

    public NoAVL removerMaximo(NoAVL noAVL){ //tem a mesma logica do removeMinimo, mas com o maximo, que está à direita
        if(noAVL == null){
            System.out.println("Arvore Vazia");
        }
        else if (noAVL.noDireita != null){
            noAVL.noDireita = removerMaximo(noAVL.noDireita);
            return noAVL;
        }
        else{
            return noAVL.noDireita;
        }
        return null;
    }

    public static NoAVL encontraMinimo(NoAVL noAVL){
        if (noAVL != null){
            while (noAVL.noEsquerda != null){ //se No.esquerda diferente de null:
                noAVL = noAVL.noEsquerda; //ele atribui ao nó, o nó da esquerda
            }
            System.out.println("menor valor"+ noAVL.valor); //e printa o int valor
        }
        return noAVL; //retorna o no
    }

    public static NoAVL encontraMaximo(NoAVL noAVL){ //seque a msm logica do encontra minimo
        if(noAVL != null){
            while (noAVL.noDireita != null){
                noAVL = noAVL.noDireita;
            }
            System.out.println("Maior valor "+ noAVL.valor);
        }
        return noAVL;
    }


    public static NoAVL remover(NoAVL noAVL, int valor){
        System.out.println("Passando pelo nó " + noAVL.valor);
        if(noAVL == null){
            System.out.println("Arvore vazia");
        }
        if (valor < noAVL.valor){ //se o valor temporario for menor que o valor do nó
            noAVL.noEsquerda = ArvoreAVL.remover(noAVL.noEsquerda, valor); //cria a stack e substitui na memoria
        }
        else if (valor > noAVL.valor){//se o valor temporario for maior que o valor do nó
            noAVL.noDireita = ArvoreAVL.remover(noAVL.noDireita, valor);//cria a stack e substitui na memoria
        }
        else if(noAVL.noEsquerda != null && noAVL.noDireita != null){ //se os nós esquerda e direita forem diferentes de null
            noAVL.valor = encontraMinimo(noAVL.noDireita).valor; //atribui ao valor da memória, o minimo que foi encontrado no nó direita
            noAVL.noDireita = removerMinimo(noAVL.noDireita); // remove da direita
            System.out.println("No "+ noAVL.valor+" removido"); //pega o valor da memória que foi removido na stack
        }
        else { //se todas as condiçoes acima forem falsas,
            System.out.println("No "+ noAVL.valor+" removido"); //vai fazer uma das 2 condiçoes:
            if (noAVL.noEsquerda == null){ //se somente se o esquerda for nulo
                noAVL = noAVL.noEsquerda; //atibuir ao valor ao esquerda
            }
            else{ //mas se o no esquerda nao for nulo, vai:
                noAVL = noAVL.noDireita;//atibuir ao no direita
            }
        }
        return noAVL; //dai retorna o valor que foi atribuido
    }
    /**    pré-ordem:
     1. visite a raiz da árvore;
     2. percorra a subárvore esquerda;
     3. percorra a subárvore direita.*/
    public static void preordem(NoAVL noAVL){ //esquerda 1º, dai direita
        if(noAVL != null){
            System.out.println(noAVL.valor+ ", ");
            ordem(noAVL.raiz);
            preordem(noAVL.noEsquerda); //faz a stack da esquerda
            preordem(noAVL.noDireita);//faz a stack da direita
        }
    }
    /**pré-ordem:
     1. visite a raiz da árvore;
     2. percorra a subárvore esquerda;
     3. percorra a subárvore direita.
     * */
    public static void ordem(NoAVL noAVL){
        if(noAVL != null){
            //System.out.println("ELE NAO RECONHECE A RAIZ"+noAVL.raiz);
            ordem(noAVL.raiz);
            ordem(noAVL.noEsquerda);//faz a stack da esquerda
            ordem(noAVL.noDireita);//faz a stack da direita
            System.out.println(noAVL.valor + ", ");
        }
    }
    /**
     * pós-ordem:
     * 1. percorra a subárvore esquerda;
     * 2. percorra a subárvore direita;
     * 3. visite a raiz da árvore.
     */
    public static void posordem(NoAVL noAVL){
        if(noAVL != null){
            posordem(noAVL.noEsquerda);//faz a stack da esquerda
            posordem(noAVL.noDireita);//faz a stack da direita
            System.out.println(noAVL.valor + ", ");
        }
    }

    public static int folhas(NoAVL noAVL){
        if(noAVL == null){
            return 0;
        }
        if(noAVL.noEsquerda == null && noAVL.noDireita == null){
            return 1;
        }
        return folhas(noAVL.noEsquerda) + folhas(noAVL.noDireita);
    }

    public static int contarNos(NoAVL noAVL){
        if(noAVL == null){
            return 0;
        }
        else{
            return (1 + contarNos(noAVL.noEsquerda) + contarNos(noAVL.noDireita));
        }
    }

    public static int altura(NoAVL noAVL){
        if(noAVL == null || (noAVL.noEsquerda == null && noAVL.noDireita == null)){
            return 0;
        }
        else {
            if(altura(noAVL.noEsquerda) > altura(noAVL.noDireita)){
                return ( 1+ altura (noAVL.noEsquerda));
            }
            else {
                return(1 + altura(noAVL.noDireita));
            }
        }
    }
}

