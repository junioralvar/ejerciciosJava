package ejerciciosTarea;
/*Ejercicio 3: Tabla de multiplicar
Descripción: Genera la tabla del 5 hasta el producto de 5x10.
Ejemplo de Output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int multiplicador = 5;
        int base = 1;
        int tope = 10;
        for (int i=base;i<=tope;i++){
            System.out.println(multiplicador + " X " + i + " = " + multiplicador*i);
        }
    }
}
