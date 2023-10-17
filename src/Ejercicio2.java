import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner tecladoEntrada = new Scanner(System.in);
       int dia, mes ,anio;
        System.out.println("escriba el dia");
        dia=tecladoEntrada.nextInt();
        System.out.println("escriba el mes ");
        mes = tecladoEntrada.nextInt();
        System.out.println("escriba el anio");
        anio = tecladoEntrada.nextInt();

        switch (mes){
            case 1,2,3,4,5,6,7,8,9,10,11,12:
                if(dia >=1 && dia<=30){
                System.out.println("la fecha es correcta");
            }else{
                System.out.println("el dia no entra en el rango");
            }
                break;
            default:
                System.out.println("el mes no entra en el rango");
            }


        }
    }

