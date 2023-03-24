import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello JD, Welcome to JAVA!");
        int opcion = 0;
        float N1 , N2, R;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("ELIGE UNA OPCION");
            System.out.println("1.-SUMA");
            System.out.println("2.-RESTA");
            System.out.println("3.-DIVISION");
            System.out.println("4.-MULTIPLICACION");
            System.out.println("5.-SALIR");

            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                System.out.println("HAZ ELEGIDO SUMAR");
                System.out.println("INGRESE PRIMER VALOR");
                N1 = scanner.nextFloat();
                System.out.println("INGRESE SEGUNDO VALOR");
                N2 = scanner.nextFloat();

                R = N1 + N2;
                System.out.println("EL RESULTADO ES:"+ " " + R);
                break;

                case 2:
                System.out.println("HAZ ELEGIDO RESTAR");
                System.out.println("INGRESE PRIMER VALOR");
                N1 = scanner.nextFloat();
                System.out.println("INGRESE SEGUNDO VALOR");
                N2 = scanner.nextFloat();

                R = N1 - N2;
                System.out.println("EL RESULTADO ES" + " " +R);
                 break;

                 case 3:
                System.out.println("HAZ ELEGIDO DIVIDIR");
                System.out.println("INGRESE PRIMER VALOR");
                N1 = scanner.nextFloat();
                System.out.println("INGRESE SEGUNDO VALOR");
                N2 = scanner.nextFloat();

                R = N1 / N2;
                System.out.println("EL RESULTADO ES:" + " " + R);
                 break;

                 case 4:
                System.out.println("HAZ ELEGIDO MULTIPLICAR");
                System.out.println("INGRESE PRIMER VALOR");
                N1 = scanner.nextFloat();
                System.out.println("INGRESE SEGUNDO VALOR");
                N2 = scanner.nextFloat();

                R = N1 * N2;
                System.out.println("EL RESULTADO ES:" + " " + R);
                 break;

                 case 5:
                 System.out.println("HA ELEGIDO SALIR");
                 break;

                 default:
                 System.out.println("OPCION INVALIDA");
                 break;
            }
        }while(opcion !=5);
        System.out.println("HASTA LUEGO, QUE TENGA UN EXCELENTE DIA");


    }
}
