import java.util.Optional;

public class OptinalNews {

    public static void main (String ... str){


        var opt = Optional.ofNullable(null);

        System.out.println(opt.isEmpty());
        System.out.println(opt.isPresent());

    }
}
