package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public Lista() {
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Rodrigo");
        list.add("Renan");
        list.add("Ronaldo");
        list.add("Allan");
        list.add("Alex");
        list.add("Arthur");
        list.add("Aloízio");
        list.add("Pedro");
        list.add(2, "Carlos");

        for(String daLista : list) {
            System.out.println(daLista);
        }

        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("--------------------");
        list.removeIf((daListax) -> daListax.charAt(0) == 'R');
        System.out.println("Resultado depois da remoção - (R)");

        for(String daLista : list) {
            System.out.println(daLista);
        }

        System.out.println("--------------------");
        System.out.println("Index do Allan: " + list.indexOf("Allan"));
        System.out.println("Index do Daniel (não existe): " + list.indexOf("Daniel"));
        System.out.println("--------------------");
        List<String> resultado = (List)list.stream().filter((daListax) -> daListax.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("Resultado depois do filtro - (A)");

        for(String daLista : resultado) {
            System.out.println(daLista);
        }

        System.out.println("--------------------");
        System.out.println("Resultado depois de verificar quem possui J (sem resultado é null)");
        String nomeFiltro = (String)list.stream().filter((daListax) -> daListax.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nomeFiltro);
    }
}
