package CodeGym_Module1;

import java.util.Scanner;

public class task408_While_Max {

	public static void main(String[] args) {
		/*
		 * Máximo de números introducidos
El programa debe leer números enteros desde el teclado hasta que se introduzca algo más, como una cadena o un carácter. Muestre el número par máximo introducido. Si se introducen varios números, debe mostrar cualquiera de ellos.

Ejemplo de entrada:
8
9
8
4
5
e

Ejemplo de salida:
8

Requirements:
1. El programa debe leer números desde el teclado.
2. El programa debe mostrar un número en la pantalla.
3. El programa debe mostrar el número máximo par de los enteros introducidos.
4. Si se introducen varios números máximos pares, luego debe mostrar cualquiera de ellos.
5. Si no hay ningún número par entre los caracteres introducidos, o si solo se ha introducido un carácter no numérico, entonces muestre el valor mínimo posible para un int.
6. Debe leer los datos desde el teclado en un ciclo while.
		 */
		
		 Scanner sc = new Scanner(System.in);
	        int max = Integer.MIN_VALUE;
	        while (sc.hasNextInt()) {
	            int x = sc.nextInt();
	            if (x % 2 == 0 && x > max) {
	                max = x;
	            }
	        }
	        System.out.println(max);

	}

}
