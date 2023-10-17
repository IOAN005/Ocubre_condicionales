public class CondicionalesSwitch{
    public static void main(String[] args) {
        char estadoCivil = 'v';

        switch (estadoCivil){
            case 'C':
            case 'c':
                System.out.println("casado");
                break;
            case  'D':
            case  'd':
                System.out.println("divorciado");
                break;
            case  'S':
            case  's':
                System.out.println("soltero");
                break;
            case  'V':
            case  'v':
                System.out.println("viudo");
                break;
            default:
                System.out.println("El valor es invalido");
        }
    }

}
