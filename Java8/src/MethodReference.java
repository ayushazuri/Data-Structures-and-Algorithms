import java.util.Locale;

public class MethodReference {
    public static void main(String[] args) {
        String s = "Ayush Singh";

        MyPrinter mp = new MyPrinter();

        mp.print(s, new Parser() {
            @Override
            public String parse(String s) {
                return StringParser.convert(s);
            }
        });

        mp.print(s, x -> StringParser.convert(s));

        mp.print(s, StringParser::convert);
    }
}

class MyPrinter{
    public void print(String s, Parser p){
        s = p.parse(s);
        System.out.println(s);
    }
}

interface Parser{
    String parse(String s);
}

class StringParser{
    static String convert(String s){
        if(s.length() >= 3)
            s = s.toLowerCase();
        else
            s = s.toUpperCase();

        return s;
    }
}

