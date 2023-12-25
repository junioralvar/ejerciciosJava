package ejerciciosTarea;
import java.util.Scanner;
/*Ejercicio 5: Suma de dígitos
Descripción: Suma todos los dígitos de un número ingresado por el usuario. No usar la conversión a String para resolver el problema.
Ejemplo de Input:
1234
Ejemplo de Output:
10*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int acum = 0;
        int ultimoDigito;
        for(int i= numero;i>0;i/=10){ //i/=10 elimina el ultimo elemento
            ultimoDigito = i%10;
            acum = acum + ultimoDigito;
        }
        System.out.println("La suma de cada digito es " + acum);
    }
}
