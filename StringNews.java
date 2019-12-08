public class StringNews {

    public static void main (String ... str) {

        System.out.println("na ".repeat(16) +"Batman!");

        var noText="    ";

        System.out.println("".equals(noText.trim()));

        System.out.println(noText.isBlank());


        var text = "\n \t      text  \u2005";

        System.out.println(noText.strip());
        System.out.println(noText.trim());

        //Lines

        var multipleLines = "1\n2\n3\n4";

        multipleLines.lines().forEach(s -> {
            s = s.concat("w");
            System.out.print(s);
        });



    }


}
