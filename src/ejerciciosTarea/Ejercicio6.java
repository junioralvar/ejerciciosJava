package ejerciciosTarea;
/*Ejercicio 6: Cuadrados perfectos
Descripción: Encuentra y muestra todos los cuadrados perfectos hasta 100.
Ejemplo de Output:
1
4
9
16
25
36
49
64
81
100*/
public class Ejercicio6 {
    public static void main(String[] args) {
        int base = 1;
        int tope = 100;
        for (int i=base ; i*i<=tope ;i++){
            System.out.println(i*i);
        }
    }
}
