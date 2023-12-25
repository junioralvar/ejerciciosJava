package ejerciciosTarea;
/*Ejercicio 2: Suma de números impares
Descripción: Suma todos los números impares del 1 al 100.
Ejemplo de Output:
2500*/
public class Ejercicio2 {
    public static void main(String[] args) {
    int suma = 0;
    int base=1;
    int tope=100;
    for (int i=base;i<=tope;i++){
        if(i%2!=0){
            suma= suma +i;
        }
    }
        System.out.println("La suma es: "+suma );
    }
}
