package CodeGym_Module1;

public class task407_While_Continue {

	public static void main(String[] args) {
/*
 * El resultado de la suma de los números que no son múltiplos de tres es:
Muestra la suma de los números desde el 1 hasta el 100 inclusive que no son múltiplos de 3. Utiliza un while ciclo para hacer esto.

Sugerencia: Para pasar al siguiente número en el ciclo, utiliza una continue sentencia.


Requirements:
1. El programa debe mostrar la suma de los números del 1 al 100 inclusive que no sean múltiplos de 3.
2. El programa debe usar un ciclo while.
3. El programa debe usar una declaración continue.
 */
	    int num = 0;
        int result = 0;
        while(num <= 100){
            if(num % 3 ==0){
                num++;
                continue;
            }
               result += num;
               num++;
        }
        System.out.println(result);
		
	}

}
