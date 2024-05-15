import java.util.ArrayList;
import java.util.List;

public class AlgoritimoCnjunto {
    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3};
        List<List<Integer>> todosSubconjuntos = gerarSubconjuntos(conjunto);
        System.out.println("Todos os subconjuntos: " + todosSubconjuntos);
    }

    public static List<List<Integer>> gerarSubconjuntos(int[] conjunto) {
        List<List<Integer>> resultado = new ArrayList<>();
        List<Integer> subconjuntoAtual = new ArrayList<>();
        backtrack(conjunto, 0, subconjuntoAtual, resultado);
        return resultado;
    }

    private static void backtrack(int[] conjunto, int inicio, List<Integer> subconjuntoAtual, List<List<Integer>> resultado) {
        resultado.add(new ArrayList<>(subconjuntoAtual));

        for (int i = inicio; i < conjunto.length; i++) {

            subconjuntoAtual.add(conjunto[i]);

            backtrack(conjunto, i + 1, subconjuntoAtual, resultado);

            subconjuntoAtual.remove(subconjuntoAtual.size() - 1);
        }
    }
}
