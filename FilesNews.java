import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesNews {


    public static void main (String ... str) throws IOException {

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This is jackass" );
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);

    }
}
