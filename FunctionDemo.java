import java.util.function.Function;

//pridicate always output boolean
// function input is anything and output is anything
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> fn = s -> s.concat(" Singh");
        System.out.println(fn.apply("Pankaj"));
        System.out.println(fn.apply("Dhiraj"));
        System.out.println(fn.apply("Niraj"));

        String[] fruites = { "apple", "orange", "mango" };

        Function<String, String> fn1 = s -> s.concat(" is good for health");
        for (String frute : fruites) {
            System.out.println(fn1.apply(frute));

        }

    }
}
