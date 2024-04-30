import java.util.stream.IntStream;

public class Piramida {
    public static void piramida() {
        int rows = 5;
        String character = "*";

        IntStream.rangeClosed(1, rows)
                .mapToObj(i -> " ".repeat(rows - i) + character .repeat(2 * i - 1))
                .forEach(System.out::println);
    }

}
