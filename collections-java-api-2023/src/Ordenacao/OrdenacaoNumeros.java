package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosInteiros;

    public OrdenacaoNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosInteiros);
        if (!numerosInteiros.isEmpty()) {
            Collections.sort(numerosAscendentes);
        }
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(numerosInteiros);
        if (!numerosInteiros.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
        }
        return numerosDescendentes;
    }

    public void exibir() {
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.exibir();

        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(8956);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(1556);
        ordenacaoNumeros.adicionarNumero(89);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(9338);
        ordenacaoNumeros.adicionarNumero(13);

        ordenacaoNumeros.exibir();
        
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

}
