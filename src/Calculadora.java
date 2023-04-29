import java.util.Scanner;

public class Calculadora {
    Scanner op = new Scanner(System.in);
    int opcion;
    
    public Calculadora (int opcion){
        
        this.opcion = opcion;

    }

    public void menu (){

                // ESTE ES EL MENU PRINCIPAL

        do {
            System.out.println(" ///  MENU DE OPCIONES  /// ");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXPONENCIAL");
            System.out.println("6. SALIR");
            System.out.print(" /// ELIGE UNA OPCION DEL MENU /// ");
            
            opcion = op.nextInt();
            switch(opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    exponencial();
                    break;
                case 6:
                    System.out.println("SALIENDO DEL SISTEMA...");
                    break;
                default:
                    System.out.println("OPCION INVALIDA...");
            }
        } while(opcion != 6);
        op.close();
    }
    

    public static void sumar() {
        Scanner op = new Scanner(System.in);

        System.out.print("INGRESA EL PRIMER NUMERO ");
        double num1 = op.nextDouble();
        System.out.print("INGRESA EL SEGUNDO NUMERO ");
        double num2 = op.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    
    public static void restar() {
        Scanner op = new Scanner(System.in);
        System.out.print("INGRESA EL PRIMER NUMERO ");
        double num1 = op.nextDouble();
        System.out.print("INGRESA EL SEGUNDO NUMERO ");
        double num2 = op.nextDouble();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    
    public static void multiplicar() {
        Scanner op = new Scanner(System.in);
        System.out.print("INGRESA EL PRIMER NUMERO ");
        double num1 = op.nextDouble();
        System.out.print("INGRESA EL SEGUNDO NUMERO ");
        double num2 = op.nextDouble();
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
    
    public static void dividir() {
        Scanner op = new Scanner(System.in);
        System.out.print("INGRESA VALOR : ");
        double dividendo = op.nextDouble();
        System.out.print("INGRESA EL DIVISOR ");
        double divisor = op.nextDouble();
        if(divisor == 0) {
            System.out.println("ERROR DIVISION ENTRE CERO");
        } else {
            System.out.println(dividendo + " / " + divisor + " = " + (dividendo / divisor));
        }
    }
    
    public static void exponencial() {
        Scanner op = new Scanner(System.in);
        System.out.print("INGRESA VALOR DE LA BASE: ");
        double base = op.nextDouble();
        System.out.print("INGRESA VALOR DE EXPONENTE: ");
        double exponente = op.nextDouble();
        System.out.println(base + " ^ " + exponente + " = " + Math.pow(base, exponente));
    }
    
}
