public class Blibliotecadefunciones {
    public static void presentacion(int no, String nombre, String fecha) {
        System.out.println("\t Tecnológico Superior de Jalisco");
        System.out.println("Unidad Academica La Huerta");
        System.out.println("Ingeniería en Sistemas Computacionales");
        System.out.println("Segundo Semestre");
        System.out.println("Programación Orientada a Objetos");
        System.out.println("Práctica " + no + ": " + nombre);
        System.out.println("Victor Daniel Sainz Preciado");
        System.out.println(fecha);
    }

    public static String Invertir(String palabra) {
        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }
        return invertida;
    }

    public static Boolean EsPalindromo(String palabra) {
        String invertida = Invertir(palabra);
        if (palabra.equals(invertida)) {
            return true;
        } else {
            return false;
        }
    }
}