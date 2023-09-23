import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // DESAFIO 1
        // numeros.stream()
        // .sorted()
        // .forEach(System.out::println);

        // DESAFIO 2
        // int resultado = numeros.stream()
        // .filter(n -> n % 2 == 0)
        // .reduce(0, Integer::sum);

        // System.out.println(resultado);

        // DESAFIO 3
        // numeros.stream()
        // .filter(n -> n > 0)
        // .forEach(System.out::println);
        
        // // DESAFIO 4
        // List<Integer> semImpares = new ArrayList<>(numeros);
        // semImpares.removeIf(n -> n % 2 != 0);
        // System.out.println(semImpares);

        // DESAFIO 5
        // numeros.stream()
        // .mapToInt(n -> n)
        // .average()
        // .ifPresent(System.out::println);

        // DESAFIO 6
        // numeros.stream()
        // .filter(n -> n > 10)
        // .forEach(System.out::println);

        // DESAFIO 7
        OptionalInt maior = numeros.stream()
        .mapToInt(n -> n)
        .max();

        System.out.println(maior);

    }
}
