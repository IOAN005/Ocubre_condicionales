import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int nota ;


        Scanner consola = new Scanner(System.in);
        System.out.println("escriba una nota");
        nota = consola.nextInt();

        switch (nota){
            case  1:
                System.out.println("insuficiente");
                break;
            case 2:
                System.out.println("insuficiente");
                break;
            case  3:
                System.out.println("insuficiente");
                break;
            case 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6 :
                System.out.println("suficiente");
                break;
            case  7 :
                System.out.println("bien");
                break;
            case 8:
                System.out.println("bien");
                break;
            case 9:
                System.out.println("muy bien");
                break;
            case 10:
                System.out.println("muy bien");
            default:
                System.out.println("sistem invalid");
        }
    }
}
