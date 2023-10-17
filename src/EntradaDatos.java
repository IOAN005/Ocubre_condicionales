import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        int numero;
        Scanner tecladoEntrada =new Scanner(System.in);
        System.out.println("escriba un numero");
        numero = tecladoEntrada.nextInt();
        System.out.println("el n umero que se leyo fue"+numero);
        //RECIBIENDO POR CONSOLA EL SUELDOO
        double sueldo;
        System.out.println("escriba su sueldo");
        sueldo = tecladoEntrada.nextDouble();
        System.out.println("el numero que se leyo fue->"+sueldo);
    }
}
