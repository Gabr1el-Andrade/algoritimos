import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgoritimoMoedas {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};

        List<Integer> resultado = calcularMenorNumeroDeMoedas(quantia, moedas);

        if (resultado != null) {
            System.out.println("Menor número de moedas para quantia " + quantia + ": " + resultado);
        } else {
            System.out.println("Não é possível fornecer o troco para a quantia " + quantia + " com as moedas disponíveis.");
        }
    }

    public static List<Integer> calcularMenorNumeroDeMoedas(int quantia, int[] moedas) {
        List<Integer> resultado = new ArrayList<>();

        List<Integer> listaMoedas = new ArrayList<>();
        for (int moeda : moedas) {
            listaMoedas.add(moeda);
        }
        Collections.sort(listaMoedas, Collections.reverseOrder());

        for (int moeda : listaMoedas) {
            while (quantia >= moeda) {
                quantia -= moeda;
                resultado.add(moeda);
            }
        }

        if (quantia != 0) {
            return null;
        }

        return resultado;
    }
}
