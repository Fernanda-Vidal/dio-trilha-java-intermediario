package OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Integer> numerosInteiros;

    public SomaNumero() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int n : numerosInteiros) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int numero = 0;
        if (!numerosInteiros.isEmpty()) {
            numero = numerosInteiros.get(0);
            for (int n : numerosInteiros) {
                if (n > numero) {
                    numero = n;
                }
            }
        }
        return numero;
    }

    public int encontrarMenorNumero() {
         int numero = 0;
        if (!numerosInteiros.isEmpty()) {
            numero = numerosInteiros.get(0);
            for (int n : numerosInteiros) {
                if (n < numero) {
                    numero = n;
                }
            }
        }
        return numero;
    }

    public void exibirNumeros() {
        if (!numerosInteiros.isEmpty()) {
            System.out.println(numerosInteiros);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumero somaNumero = new SomaNumero();

        somaNumero.exibirNumeros();
        System.out.println("A soma dos números é: " + somaNumero.calcularSoma());

        somaNumero.adicionarNumero(900);

        somaNumero.adicionarNumero(8);
        somaNumero.adicionarNumero(2);
        
        somaNumero.exibirNumeros();
        System.out.println("A soma dos números é: " + somaNumero.calcularSoma());
        
        somaNumero.adicionarNumero(1);
        somaNumero.adicionarNumero(2);
        somaNumero.adicionarNumero(20);
        somaNumero.adicionarNumero(900);
        somaNumero.adicionarNumero(9);
        somaNumero.adicionarNumero(11);
        
        somaNumero.exibirNumeros();
        System.out.println("O maior número é o: " + somaNumero.encontrarMaiorNumero());
        System.out.println("O menor número é o: " + somaNumero.encontrarMenorNumero());
        
    }
}
