import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nota;
        Scanner consola = new Scanner(System.in);
        System.out.println("escriba una nota");

        nota = consola.nextInt();

        switch (nota){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10 :
                System.out.println("diez");

            default:
                System.out.println("sistem failuer");
        }
    }
}
