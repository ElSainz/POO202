import java.util.Scanner;
public class Vista {
    static Scanner sc=new Scanner(System.in);
    
    public static void registrarDatos(){
        int opc=-1; //opcion de menu registrar
        do {
            System.out.println("App Control Escolar");
            System.out.println("-------------------");
            System.out.println("---MENU AGREGAR----");
            System.out.println("-------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar persona");
            System.out.print("Selecciona una opci�n: ");
            opc = sc.nextInt();sc.nextLine();
            switch (opc) {
                case 0:
                    System.out.println("Regresando al men� principal...");
                    break;
                case 1:
                    System.out.println("Registro de una persona en la App");
                    System.out.print("Nombre(s): "); 
                    String n = sc.nextLine();
                    System.out.print("Apellido(s): ");
                    String a = sc.nextLine();
                    System.out.print("Edad: ");
                    int e = sc.nextInt();
                    System.out.println("�En que posici�n desea agregarlo?");
                    System.out.println("[0 - "+(Byte.MAX_VALUE-1)+"]: ");
                    byte i = sc.nextByte();
                    String message = Controlador.agregarPersona(new Persona(n,a,e),i);
                    System.out.println(message);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc!=0);
    }
    
    public static void main(String[] args) {
        int opc=-1; //opcion de menu
        do {
            System.out.println("App Control Escolar");
            System.out.println("-------------------");
            System.out.println("--MENU PRINCIPAL---");
            System.out.println("-------------------");
            System.out.println("0. Salir");
            System.out.println("1. Agregar");
            System.out.print("Selecciona una opci�n: ");
            opc = sc.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Ha elegido salir del sistema");
                    System.out.println("Vuelva pronto...");
                    break;
                case 1:
                    registrarDatos();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc!=0);
    }
}
