package CodeGym_Module1;

import java.util.Scanner;

public class task406_While_Break {

	public static void main(String[] args) {
	/*
	 * Mostramos lo que obtenemos
Ingresamos datos desde el teclado y los mostramos en pantalla inmediatamente hasta que se ingresa la palabra "basta".
No muestre la palabra "basta".
Para hacer esto, necesita usar un ciclo infinito (while(true)).

Sugerencia: Para finalizar un ciclo infinito, use una instrucción break.


Requirements:
1. El programa debe leer datos desde el teclado.
2. El programa debe usar un ciclo while.
3. Para terminar un ciclo infinito, debe usar una instrucción break.
4. El programa debe mostrar todos los datos introducidos, cada línea leída en una nueva línea, hasta que se introduzca la palabra "basta".
	 */
		Scanner sc = new Scanner(System.in);
        while(true){
        	System.out.println("Enter the word:");
            String word = sc.nextLine().toLowerCase().trim();
            if(word.equals("basta")){
            	System.out.println("your word is 'basta' then the program will stop");
                break;
            }
            System.out.println(word);
        }
		
	}

}
