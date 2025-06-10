package funciones;

public class Funciones {

    public static void mostrarSaludo(){
        System.out.println("Hola, mundo");
    }

    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static double areaRectangulo(double base, double altura){

        return base * altura;
    }

    public static String convertirMayuscula(String texto){

        return texto.toUpperCase();

    }

    public static void menu(){
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        System.out.println("Opcion 4");
        System.out.println("Opcion 5");
    }

    public static Boolean esPar(int numero){

        return numero % 2 == 0;

    }

    public static double cuadradoNumero(double numero){

        return numero * numero;

    }

    public static long factroial(int numero){

        if(numero == 0){
            return 1;
        }

        return numero * factroial(numero - 1);

    }

    public static int sumar(int... numeros){
        int suma = 0;
        for(int numero : numeros){
            suma += numero;
        }
        return suma;
    }

    public static double calcularPromedio(double[] numeros){
        double suma = 0;

        for(double numero: numeros){
            suma += numero;
        }

        return suma / numeros.length;

    }

    public static boolean buscarNumero(int[] numeros, int numeroBuscar){

        for (int numero : numeros){
            if (numero == numeroBuscar) {
                return true;
            }
        }

        return false;
    }

    public static int contarPalabra(String[] palabras, String clave){
        int contador = 0;

        for (String palabra : palabras){
            if (palabra.equals(clave)) {
                contador++;
            }
        }

        return contador;

    }

    public static String formatear(double[] numeros){

        String formateado = "";


        formateado = "{" + numeros[0] + "}";


        for (int i = 1; i < numeros.length; i++) {
            formateado = formateado + ", {" + numeros[i] + "}";
        }

        return formateado;
    }


    public static double[] invertir(double[] numeros){

        double[] invertido = new double[numeros.length];

        int j = 0;


        for (int i = numeros.length - 1; i >= 0; i--) {

            invertido[j] = numeros[i];

            j++;

        }

        return invertido;

    }

    public static String buscarNota(String[] nombres, double[] notas){

        double mejorNota = 0;
        String nombre = "";

        for (int i = 0; i < nombres.length; i++) {

            double nota = notas[i];

            if (nota > mejorNota){
                mejorNota = nota;
                nombre = nombres[i];
            }
            
        }

        return nombre;

    }


}
