package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    BinaryOperator<Integer> somar = Integer::sum;

    // Usar o BinaryOperator para somar todos os números no Stream
        // Optional<Integer> resultado = numeros.stream()
        // .reduce(new BinaryOperator<Integer>() {
        //   @Override
        //   public Integer apply(Integer n1, Integer n2) {
        //     return n1 + n2;
        //   }          
        // });
        // Ou

        // int resultado = numeros.stream()
        // .reduce(0, (n1, n2) -> n1 + n2);
        // Ou

    int resultado = numeros.stream()
        .reduce(0, Integer::sum);

    // Imprimir o resultado da soma
    System.out.println("A soma dos números é: " + resultado);
  }
}