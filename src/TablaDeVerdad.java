public class TablaDeVerdad {

    public static void main(String[] args) {
        System.out.println("Tabla de Verdad para A or B\n");
        System.out.println("---------------------");
        System.out.println("A      B      A or B");
        System.out.println("---------------------");
        System.out.println("true | true  |" + (true || true));
        System.out.println("true | false |" + (true || false));
        System.out.println("false| true  |" + (false || true));
        System.out.println("false| false |" + (false || false));
       
    }
}
