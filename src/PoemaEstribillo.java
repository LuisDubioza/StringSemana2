import java.util.Scanner;

public class PoemaEstribillo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer verso de un poema o estribillo: \n");
        String poema1 = scanner.nextLine();
        System.out.println("Ingrese el segundo verso de un poema o estribillo: \n");
        String poema2 = scanner.nextLine();
        System.out.println("Ingrese el tercer verso de un poema o estribillo: \n");
        String poema3 = scanner.nextLine();
        System.out.println("Ingrese el cuarto verso de un poema o estribillo: \n");
        String poema4 = scanner.nextLine();
        System.out.println("ingrese el quinto verso de un poema o estribillo: \n");
        String poema5 = scanner.nextLine();
        System.out.println("ingrese el sexto verso de un poema o estribillo: \n");
        String poema6 = scanner.nextLine();

        String poema1m = poema1.toUpperCase();
        String poema3m = poema3.replaceAll("[aeiouAEIOU]", "\\$");
        String poema4m = poema4.toLowerCase();
        String poema6m = poema6.replace(" " , "");

        System.out.println(poema1m);
        System.out.println(poema2);
        System.out.println(poema3m);
        System.out.println(poema4m);
        System.out.println(poema5);
        System.out.println(poema6m);
        scanner.close();
    

    }

}
