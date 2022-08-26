package Examen;

    import java.util.ArrayList;

    public class ListaNombre {
        public static void main(String[] args) {
            ArrayList<String> listaNombres = new ArrayList<String>();
            listaNombres.add("Miguel");
            listaNombres.add("Monica");
            listaNombres.add("Luis");
            listaNombres.add("Pedro");
            listaNombres.add("Elizabeth");
            for(String ln: listaNombres) {
                System.out.println(ln);
            }
        }
    }
