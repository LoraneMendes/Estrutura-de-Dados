package ArvoreSTR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static ArvoreSTR.ArvoreSTR.raiz;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("================================= LER ARQUIVO 1  =============================================");
        File A1 = new File("C:/Users/Teste/Documents/untitled22/src/ArvoreSTR/A1.txt");
        Scanner scanner = new Scanner(A1);
        String arquivoUm = scanner.next();
        String[] Arq1 = arquivoUm.split("[,]");
        //System.out.println(arquivoUm.getClass().getSimpleName());

        for (int i = 0; i < Arq1.length; i++) {
            ArvoreSTR.inserirStr(Arq1[i]);
        }

        System.out.println("================================= LER ARQUIVO 2  =============================================");
        File A2 = new File("C:/Users/Teste/Documents/untitled22/src/ArvoreSTR/A2.txt");
        Scanner scanner2 = new Scanner(A2);
        String arquivoDois = scanner2.next();
        String[] Arq2 = arquivoDois.split("[,]");
        //System.out.println(arquivoUm.getClass().getSimpleName());

        for (int i = 0; i < Arq2.length; i++) {
            ArvoreSTR.inserirStr(Arq2[i]);
        }

        System.out.println("================================= LER ARQUIVO 3  =============================================");
        File A3 = new File("C:/Users/Teste/Documents/untitled22/src/ArvoreSTR/A3.txt");
        Scanner scanner3 = new Scanner(A3);
        String arquivoTres = scanner3.next();
        String[] Arq3 = arquivoTres.split("[,]");
        //System.out.println(arquivoTres.getClass().getSimpleName());

        for (int i = 0; i < Arq3.length; i++) {
            ArvoreSTR.inserirStr(Arq3[i]);
        }

        System.out.println("===================================== IN-ORDEM  ================================================");
        System.out.println("- percorra a subárvore esquerda;\n- visite a raiz da árvore;\n- percorra a subárvore direita.");
        //ArvoreSTR.ordemDECRESCENTE(raiz);
        ArvoreSTR.inOrdem(raiz);

        System.out.println("===================================== PESQUISA  ================================================");
//      Entre com um termo a ser pesquisado: "computador"
        Scanner scannerBusca = new Scanner(System.in);
        while(true) {
            System.out.println("Entre com um termo a ser pesquisado:");
            String val = scannerBusca.nextLine();
            System.out.println(ArvoreSTR.pesquisa(val));

            //System.out.println("arquivo 1: ");
            int count = 0;
            for (int i = 0; i < Arq1.length; i++) {
                // if match found increase count
                if (val.equals(Arq1[i])) {
                    count++;
                    System.out.println("arquivo A1.txt: " + count);
                }
            }

            //System.out.println("arquivo 2: ");
            int count2 = 0;
            for (int i = 0; i < Arq2.length; i++) {
                // if match found increase count
                if (val.equals(Arq2[i])) {
                    count2++;
                    System.out.println("arquivo A2.txt: " + count2);
                }
            }

            //System.out.println("arquivo 3: ");
            int count3 = 0;
            for (int i = 0; i < Arq3.length; i++) {
                // if match found increase count
                if (val.equals(Arq3[i])) {
                    count3++;
                    System.out.println("arquivo A3.txt: " + count3);
                }
            }
        }
    }
}