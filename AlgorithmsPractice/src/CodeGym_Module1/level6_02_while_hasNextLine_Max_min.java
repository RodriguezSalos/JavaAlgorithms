package CodeGym_Module1;

import java.util.Scanner;

public class level6_02_while_hasNextLine_Max_min {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        int sum = 0;
	        int max = 0;
	        int min = 0;
	        while (sc.hasNextInt()){
	            int x = sc.nextInt();
	            sum += x;
	            if(x > max){
	                max = x;
	            }
	            if(x < min){
	                min = x;
	            }
	        }
	        System.out.println("sum into while: " + sum);
	        System.out.println("Max number entered : " + max);
	        System.out.println("Min number entered : " + min);

	}

}
