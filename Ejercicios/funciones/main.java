package funciones;

public class main {
    public static void main(String[] args) {

        System.out.println("--- PRUEBAS DE FUNCIONES ---");
        System.out.println("----------------------------------------");

        // Nivel 1


        System.out.println("1. Mostrar mensaje fijo:");
        Funciones.mostrarSaludo();
        System.out.println("----------------------------------------\n");

        // 2. Saludo personalizado
        System.out.println("2. Saludo personalizado:");
        Funciones.saludar("Ricardo");
        Funciones.saludar("Juan");
        System.out.println("----------------------------------------\n");

        // 3. Área de un rectángulo
        System.out.println("3. Área de un rectángulo:");
        double area1 = Funciones.areaRectangulo(5.0, 10.0);
        System.out.println("Área de un rectángulo (5x10): " + area1);
        double area2 = Funciones.areaRectangulo(3.5, 7.0);
        System.out.println("Área de un rectángulo (3.5x7): " + area2);
        System.out.println("----------------------------------------\n");

        // 4. Convertir a mayúsculas
        System.out.println("4. Convertir a mayúsculas:");
        String textoOriginal = "Lionel messi";
        String textoMayusculas = Funciones.convertirMayuscula(textoOriginal);
        System.out.println("Original: " + textoOriginal);
        System.out.println("Mayúsculas: " + textoMayusculas);
        System.out.println("----------------------------------------\n");

        // 5. Mostrar menú
        System.out.println("5. Mostrar menú:");
        Funciones.menu();
        System.out.println("----------------------------------------\n");

        // Nivel 2

        // 6. Número par o impar
        System.out.println("6. Número par o impar:");
        System.out.println("¿Es 4 par? " + Funciones.esPar(4));
        System.out.println("¿Es 7 par? " + Funciones.esPar(7));
        System.out.println("¿Es 10 par? " + Funciones.esPar(10));
        System.out.println("----------------------------------------\n");

        // 7. Calcular el cuadrado de un número
        System.out.println("7. Calcular el cuadrado de un número:");
        System.out.println("Cuadrado de 5: " + Funciones.cuadradoNumero(5));
        System.out.println("Cuadrado de 3.5: " + Funciones.cuadradoNumero(3.5));
        System.out.println("----------------------------------------\n");

        // 8. Factorial recursivo
        System.out.println("8. Factorial recursivo:");
        System.out.println("Factorial de 5: " + Funciones.factroial(5));
        System.out.println("Factorial de 8: " + Funciones.factroial(8));
        System.out.println("Factorial de 3: " + Funciones.factroial(3));
        System.out.println("----------------------------------------\n");

        // Nivel 3

        // 9. Sumar múltiples números
        System.out.println("9. Sumar múltiples números:");
        System.out.println("Suma de 1, 2, 3: " + Funciones.sumar(1, 2, 3));
        System.out.println("Suma de 10, 20: " + Funciones.sumar(10, 20));
        System.out.println("Suma de 1 a 10: " + Funciones.sumar(1,2,3,4,5,6,7,8,9,10));
        System.out.println("----------------------------------------\n");

        // 10. Promedio de un array
        System.out.println("10. Promedio de un array:");
        double[] notasPromedio = {85.5, 90.0, 78.5, 92.0, 88.0};
        System.out.println("Promedio de notas: " + Funciones.calcularPromedio(notasPromedio));
        System.out.println("----------------------------------------\n");

        // 11. Buscar valor en array
        System.out.println("11. Buscar valor en array:");
        int[] numerosBusqueda = {1, 5, 8, 12, 20};
        System.out.println("¿Está el 8? " + Funciones.buscarNumero(numerosBusqueda, 8));
        System.out.println("¿Está el 15? " + Funciones.buscarNumero(numerosBusqueda, 15));
        System.out.println("----------------------------------------\n");

        // 12. Contar ocurrencias
        System.out.println("12. Contar ocurrencias:");
        String[] palabras = {"casa", "perro", "gato", "casa", "arbol", "casa"};
        System.out.println("La palabra 'casa' aparece: " + Funciones.contarPalabra(palabras, "casa") + " veces");
        System.out.println("La palabra 'perro' aparece: " + Funciones.contarPalabra(palabras, "perro") + " veces");
        System.out.println("La palabra 'sol' aparece: " + Funciones.contarPalabra(palabras, "sol") + " veces");
        System.out.println("----------------------------------------\n");

        // Nivel 4

        // 13. Imprimir array de forma formateada
        System.out.println("13. Imprimir array de forma formateada:");
        double[] numerosFormatear = {10.5, 20.0, 30.75, 40.2};
        System.out.println("Array formateado: " + Funciones.formatear(numerosFormatear));
        System.out.println("----------------------------------------\n");

        // 14. Invertir array
        System.out.println("14. Invertir array:");
        double[] arrayOriginal = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] arrayInvertido = Funciones.invertir(arrayOriginal);
        System.out.print("Array original: ");
        for (double d : arrayOriginal) { System.out.print(d + " "); }
        System.out.println();
        System.out.print("Array invertido: ");
        for (double d : arrayInvertido) { System.out.print(d + " "); }
        System.out.println();
        System.out.println("----------------------------------------\n");

        // 15. Estudiante con mejor nota
        System.out.println("15. Estudiante con mejor nota:");
        String[] nombresEstudiantes = {"Juan", "Maria", "Carlos", "Luisa"};
        double[] notasEstudiantes = {85.0, 92.5, 78.0, 92.5};
        System.out.println("El estudiante con la mejor nota es: " + Funciones.buscarNota(nombresEstudiantes, notasEstudiantes)); // Esperado: Maria o Luisa (depende del orden de la primera nota más alta)
        System.out.println("----------------------------------------");
    }

    }

