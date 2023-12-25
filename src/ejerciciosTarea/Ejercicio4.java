package ejerciciosTarea;
import java.util.Scanner;
/*Ejercicio 4: Factorial de un número
Descripción: Calcula el factorial de un número ingresado por el usuario. El factorial de un número n (representado como
) es el producto de todos los enteros positivos menores o iguales a n.
Ejemplo de factorial de 5:
Ejemplo de Input:
5
Ejemplo de Output:
120*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        System.out.println(numero);
        for(int i=1;i<=numero;i++){
            factorial = factorial*i;
        }
        System.out.println("El factorial de "+numero+" es "+factorial);
    }
}
