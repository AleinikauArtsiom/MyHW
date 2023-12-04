package Lessons17.Hm5;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        StringBuilder t = new StringBuilder("Hello how are you");
        Supplier<StringBuilder> supplierStr = () -> t.reverse();
        System.out.println(supplierStr.get());
    }
}
