import java.io.File;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        System.out.println("Selecione o arquivo:");
        File diretorio = new File("testes");
        File[] listaArquivos = diretorio.listFiles();
        int c = 1;
        for (File arquivo : listaArquivos) {
            System.out.println(c + ". " + arquivo.getName() + "\t\t" + arquivo.length() + " bytes");
            c++;
        }
        Scanner scanner = new Scanner(System.in);
        int seletor = 0;
        while (seletor < listaArquivos.length || seletor > 1) {
            seletor = scanner.nextInt();
            System.out.println("Arquivo não encontrado");
        }

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();

        // startTime = System.currentTimeMillis();
        // DNA.Sequencia("DNANDANDANDANADNDDDAN");
        // endTime = System.currentTimeMillis();
        // System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        DNA.Builder("DNA");
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        // startTime = System.currentTimeMillis();
        // DNA.Dicionario(
        // "");
        // endTime = System.currentTimeMillis();
        // System.out.println("That took " + (endTime - startTime) + " milliseconds");

        // startTime = System.currentTimeMillis();
        // ListaLinearDuplamenteEncadeada.listaLinear(
        // "DNANDANDANDANADNDDDAN");
        // endTime = System.currentTimeMillis();
        // System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
