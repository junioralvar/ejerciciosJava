package ejerciciosTarea;
/*Ejercicio 1: Contador de números pares
Descripción: Itera sobre los números del 1 al 50 e imprime solo los números pares.
Ejemplo de Output:
2
6
4
...
50*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int base = 1;
        int tope = 50;
        for (int i=base;i<=tope;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
