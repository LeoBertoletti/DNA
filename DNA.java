import java.util.ArrayList;
import java.util.Arrays;

public class DNA {
    long startTime;
    long endTime;

    public static void sequencia(String sequencia) {

        ArrayList<Character> lista = new ArrayList<Character>();
        for (int i = 0; i < sequencia.length(); i++) {
            lista.add(sequencia.charAt(i));
        }

        int c = 0;
        while (lista.size() != c + 1) {
            if (lista.get(c) == lista.get(c + 1)) {
                c++;
                continue;
            }
            ArrayList<Character> lista2 = new ArrayList<Character>((Arrays.asList('D', 'N', 'A')));
            lista2.remove(lista.get(c + 1));
            lista2.remove(lista.get(c));
            lista.remove(c);
            lista.remove(c);
            lista.add(lista.size(), lista2.get(0));
            if (c > 0) {
                c--;
            }
        }

        System.out.println(lista.toString());
    }

    public void builder(String sequencia) {
        startTime = System.currentTimeMillis();
        StringBuilder cadeia = new StringBuilder(sequencia);
        int index = 0;
        while (cadeia.length() != index + 1) {
            String indexChar = cadeia.substring(index, index + 1);
            String indexChar2 = cadeia.substring(index + 1, index + 2);
            if (indexChar.equals(indexChar2)) {
                index++;
                continue;
            }

            cadeia.append(getCharSubstituto(indexChar, indexChar2));
            cadeia.delete(index, index + 2);

            if (index > 0) {
                index--;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println(cadeia.toString());
        System.out.println("Analise concluida em " + (endTime - startTime) + " milisegundos");
    }

    private String getCharSubstituto(String char1, String char2) {
        if (("N".equals(char1) || "N".equals(char2)) && ("A".equals(char1) || "A".equals(char2))) {
            return "D";
        } else if (("D".equals(char1) || "D".equals(char2)) && ("A".equals(char1) || "A".equals(char2))) {
            return "N";
        } else if (("D".equals(char1) || "D".equals(char2)) && ("N".equals(char1) || "N".equals(char2))) {
            return "A";
        }
        return "";
    }

    public static void dicionario(String sequencia) {
        int c = 0;
        while (sequencia.length() != c + 1) {
            // System.out.println(sequencia);
            if (sequencia.substring(c, c + 1).equals(sequencia.substring(c + 1, c + 2))) {
                c++;
                continue;
            }
            String lista2 = "DNA";
            lista2 = lista2.replace(sequencia.substring(c, c + 1), "");
            lista2 = lista2.replace(sequencia.substring(c + 1, c + 2), "");
            sequencia = sequencia.replaceFirst(sequencia.substring(c, c + 2), "");
            sequencia = sequencia + lista2;
            if (c > 0) {
                c--;
            }
        }
        System.out.println(sequencia);
    }

}
