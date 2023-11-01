package CodeGym_Module1;

public class task405_WhileLoops_B {

	public static void main(String[] args) {
		/*
		 * Rectángulo no relleno
	Usando while loops anidados (un loop dentro de otro), muestre un rectángulo no relleno (sólo un contorno) que es 10 (altura) por 20 (anchura) y hecho de la letra 'B'.
	La parte no rellena consiste en espacios en blanco.

	Ejemplo de salida:
	BBBBBBBBBBBBBBBBBBBB
	B                  B
	B                  B
	B                  B
	B                  B
	B                  B
	B                  B
	B                  B
	B                  B
	B                  B
	BBBBBBBBBBBBBBBBBBBB


	Requirements:
	1. El programa debe mostrar texto en pantalla.
	2. El programa debe dibujar el contorno de un rectángulo con una altura de 10 y una anchura de 20, formado por la letra 'B'.
	3. El programa debe usar ciclos while anidados (un bucle en un bucle).
	4. La salida de la pantalla debe realizarse en un ciclo while.
		 */

		    String B = "B";
		    int altura = 10;
		    int ancho = 20;
		    int al = 1;
		    int an;
		    //recorrido de altura
		    while(al <= altura){
		        an = 1;
		        //recorrido de ancho izquierda a derecha
		        //entra al bucle hasta la ultima posicion del ancho
		        while(an <= ancho){
		                if(al != altura && al !=1) {
		                    if(an == 1 ) {
		                        System.out.print(B);
		                    }else if (an == ancho && al !=1) {
		                        System.out.print(B);
		                    }else if (al != ancho && al !=1){
		                        //si no agregar espacio a la derecha
		                        System.out.print(" ");
		                    }
		                }

		            if (al == 1 || al == altura) {
		                System.out.print(B);
		            }
		            ++an;
		        }
		        System.out.println();
		        ++al;
		    }

	}

}
