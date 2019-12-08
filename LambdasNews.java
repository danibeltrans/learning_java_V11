import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LambdasNews {

    public static void main (String ... str) {

        Stream<String> strings = Arrays.stream(new String[]{"A", "B", "C", "", " "});

        strings.filter(Predicate.not(String::isBlank)).forEach(System.out::println);

        BinaryOperator<String> function = (s1 , s2) -> s1.concat(s2);
        BinaryOperator<String> function2 = (var s1 , var s2) -> s1.concat(s2);


        //BinaryOperator<String> function3 = (var s1 , s2) -> s1.concat(s2);
        //BinaryOperator<String> function3 = (var s1 , String s2) -> s1.concat(s2);
        //UnaryOperator<String> unaryOperator =  var s -> s.toUpperCase();





    }

}
