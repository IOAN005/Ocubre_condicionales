import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tecladoEntrada = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("escriba el dia ");
        dia = tecladoEntrada.nextInt();
        System.out.println("escriba el mes");
        mes = tecladoEntrada.nextInt();
        System.out.println("escriba el anio");
        anio = tecladoEntrada.nextInt();

        switch (mes) {
            case 2:
                if (dia >= 1 && dia <= 28) {
                    System.out.println("la fecha es correcta");
                } else {
                    System.out.println("la fecha es incorrecta");
                    break;
                    //case 4 ,6,9,11:
                    /*if (dia >= 1 && dia >= 30) {
                        System.out.println("la fecha es correcta");
                    } else {
                        System.out.println("la fecha es incorrecta");
                        break;
                        // case 1,3,5,7,8,10,12:
                        if (dia >= 1 && dia >= 31) {
                            System.out.println("");
                        }
                    }


                */
                }
        }
    }
}