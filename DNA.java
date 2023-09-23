import java.util.ArrayList;
import java.util.Arrays;

public class DNA {

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

    public static void builder(String sequencia) {
        StringBuilder sb = new StringBuilder(sequencia);
        int c = 0;
        while (sb.length() != c + 1) {
            if (sb.charAt(c) == sb.charAt(c + 1)) {
                c++;
                continue;
            }
            StringBuilder lista2 = new StringBuilder("DNA");
            lista2.deleteCharAt(lista2.indexOf(sb.substring(c, c + 1)));
            lista2.deleteCharAt(lista2.indexOf(sb.substring(c + 1, c + 2)));
            sb.deleteCharAt(c);
            sb.deleteCharAt(c);
            sb.append(lista2.charAt(0));
            if (c > 0) {
                c--;
            }
        }
        System.out.println(sb.toString());
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
