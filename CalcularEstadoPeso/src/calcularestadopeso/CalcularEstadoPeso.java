
package calcularestadopeso;

import java.util.Scanner;


public class CalcularEstadoPeso {

    public static void main(String[] args) {
        String nombre;
        int edad,pesoActual,pesoIdeal;
        
        mostrarMensajeInicial();
        solicitarNombre();
        nombre = capturarNombre();
        solicitarEdad();
        edad = capturarEdad();
        solicitarPesoActual(); 
        pesoActual = capturarPesoActual();
        pesoIdeal = calcularPesoIdeal(edad);
        mostrarEstadoPeso(nombre,pesoActual,pesoIdeal);
        mostrarMensajeFinal();
        
      
    }

    private static void mostrarMensajeInicial() {
        System.out.println("Calculo del peso ideal v.1.0");
        
        
    }

    private static void solicitarNombre() {
       System.out.print("Ingrese Nombre : ");
    }

    private static String capturarNombre() {
       String nombreCapturado;
       Scanner capturador = new Scanner(System.in);
       nombreCapturado = capturador.nextLine();
       return nombreCapturado;
    }

    private static void solicitarEdad() {
        System.out.println("Ingrese su edad");
    }

    private static int capturarEdad() {
       Scanner capturador = new Scanner(System.in);
       int edad = capturador.nextInt();
       return edad;
       
    }

    private static void solicitarPesoActual() {
       System.out.println("Ingrese peso actual : ");
       
    }

    private static int capturarPesoActual() {
        Scanner capturador = new Scanner(System.in);
        int pesoActual = capturador.nextInt();
        return pesoActual;
        
        
    }

    private static int calcularPesoIdeal(int edad) {
       
        return edad*2+8;
       
    }

    private static void mostrarEstadoPeso(String nombre, int pesoActual, int pesoIdeal) {
    if (pesoActual==pesoIdeal){
        System.out.println(nombre + "+está en su peso ideal.");
        
    }else if (pesoActual>pesoIdeal){
        System.out.println (nombre +  "está con sobre peso.");
    }else{
        System.out.println(nombre + "está bajo peso.");
    }   
    }

    private static void mostrarMensajeFinal() {
       System.out.println("Programa Terminado.");
    }
    
}
