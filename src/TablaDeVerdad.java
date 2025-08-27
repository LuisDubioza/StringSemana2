public class TablaDeVerdad {

    public static void main(String[] args) {
        System.out.println("A\tB\tA AND B\tA OR B\tNOT A");
        System.out.println("---------------------------------------");
        boolean[] valores = {true, false};
        for (boolean A : valores) {
            for (boolean B : valores) {
                System.out.printf("%b\t%b\t%b\t%b\t%b%n", A, B, A && B, A || B, !A);
            }
        }
    }

}
