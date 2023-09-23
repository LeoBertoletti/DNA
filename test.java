import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
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
        try {
            Scanner scanner = new Scanner(System.in);
            int seletor = scanner.nextInt();
            while (seletor > listaArquivos.length || seletor < 1) {
                System.out.println("Selecao invalida");
                seletor = scanner.nextInt();
            }

            BufferedReader br = new BufferedReader(new FileReader(listaArquivos[seletor - 1].getPath()));
            String linha = br.readLine();
            long startTime = System.currentTimeMillis();
            DNA.builder(linha);
            long endTime = System.currentTimeMillis();
            System.out.println("Analise concluida em " + (endTime - startTime) + " milisegundos");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo");
        } catch (InputMismatchException e) {
            System.out.println("O sistema so aceita numeros");
        }

        // startTime = System.currentTimeMillis();
        // DNA.Sequencia("DNANDANDANDANADNDDDAN");
        // endTime = System.currentTimeMillis();
        // System.out.println("That took " + (endTime - startTime) + " milliseconds");

        // startTime = System.currentTimeMillis();
        // DNA.Dicionario(
        // "");
        // endTime = System.currentTimeMillis();
        // System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
