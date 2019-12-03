import java.util.ArrayList;
        import java.util.List;

public class main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Labas");

        Sarasas<Integer> tiesinisSarasas = new TiesinisSarasas<>();
        tiesinisSarasas.prideti(250);

        Skaicuokle<Integer,Integer> skaicuokle = new Skaicuokle<Integer, Integer>();
        skaicuokle.suma(20, 20);

        for (Object elem :list) {
            String str = (String) elem;
        }



    }
}
