package AlgorithmsPractice;

import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { -4,4, 8, 2, 6, 5, 7, 7, 1, 2,-100 };
		megersort(array1);
		//megersort(random1());

	}
	
	 public static int[] random1() {
	      Random rd = new Random(); // creating Random object
	      int[] arr = new int[50];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); // storing random integers in an array
	         //System.out.println(arr[i]); // printing each array element
	      }
		return arr;
	 }   


	public static void megersort(int[] array1) {

		System.out.println("array1 length: " + array1.length);
		System.out.println("array_result before" + Arrays.toString(array1));

		int helper = 0;
		for(int i = 0; i < array1.length -1; i++ ) {
			for(int j = i; j < array1.length; j++) {
				if(array1[i] > array1[j]) {
					helper = array1[i];
					array1[i] = array1[j];
					array1[j] = helper;
				}		
			}
		}
		System.out.println("array_result after" + Arrays.toString(array1));
		System.out.println("abs" + Math.abs(-10));
	}

}
