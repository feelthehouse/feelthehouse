

package multidimencionales;
public class Multidimencionales {
public static void main(String[] args) {

    System.out.println("Programa que muestra 3 nombres y sus respectivas edades");

String [][] arreglo={{"Nombre ", "    Apellido", "    edad"},{"tulio","      Uribe","       19"},{"Fernando","   Uribe","       20"},{"Gustavo","    Fernández","   21"}};
     int i; 
     int j;
     String salida="";
     for(i=0;i<=3;i++){
         for(j=0;j<=2;j++){
             salida=salida+arreglo[i][j];
             if (j==2){
             salida=salida+"\n";
         }
         }
     }
    System.out.println(salida);
     
 }
}