import java.util.Scanner;


public class SumaDeFecha {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: \n");
        String dia = scanner.nextLine();
        System.out.print("Ingrese el mes: \n");
        String mes = scanner.nextLine();    
        System.out.print("Ingrese el año: \n");
        String ano = scanner.nextLine();

        Integer diaInt = Integer.parseInt(dia);
        Integer mesInt = Integer.parseInt(mes);
        Integer anoInt = Integer.parseInt(ano);

        int suma = diaInt + mesInt + anoInt;
        System.out.println("La suma de la fecha es: " + suma);
        scanner.close();


    }
}
