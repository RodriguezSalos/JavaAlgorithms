package AlgorithmsPractice;

import java.util.Arrays;
import java.util.Random;

public class mergeSortPractice {
	
	 public static int[] random1() {
	      Random rd = new Random(); // creating Random object
	      int[] arr = new int[50];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); // storing random integers in an array
	         //System.out.println(arr[i]); // printing each array element
	      }
		return arr;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 4, 8, 2, 6, 5, 7, 7, 1, 2,-100,-5 };
		//System.out.println(Arrays.toString(array1));
		megersort(array1);
		//megersort(random1());
	}

	public static void megersort(int[] array1) {

		int middle = array1.length / 2;
		int[] sorted_left_array;
		int[] sorted_right_array;
		int array_result[] = new int[array1.length];
		sorted_left_array = new int[middle];
		sorted_right_array = new int[array1.length - middle];
		int ii;

		//System.out.println(array1.length);
		//System.out.println(middle);

		if (array1.length == 1) {
			//System.out.println(array1.length);
		} else {
			//System.out.println("sorted_left_array size = " + sorted_left_array.length);
			//System.out.println("sorted_right_array size = " + sorted_right_array.length);

			// assing values
			for (int i = 0; i <= sorted_left_array.length - 1; i++) {
				sorted_left_array[i] = array1[i];
			}
			//System.out.println(Arrays.toString(sorted_left_array));

			ii = sorted_left_array.length;

			for (int i = 0; i <= sorted_right_array.length - 1; i++) {
				sorted_right_array[i] = array1[ii + i];
			}
			//System.out.println(Arrays.toString(sorted_right_array));
		}
		
		
		//order asc array left
		int helper = 0;
		for(int i = 0; i < sorted_left_array.length -1; i++ ) {
			for(int j = i; j < sorted_left_array.length; j++) {
				if(sorted_left_array[i] > sorted_left_array[j]) {
					helper = sorted_left_array[i];
					sorted_left_array[i] = sorted_left_array[j];
					sorted_left_array[j] = helper;
				}		
			}
		}
		//System.out.println("sorted_left_array" + Arrays.toString(sorted_left_array));
		//order asc array rigth	
		helper = 0;
		for(int i = 0; i < sorted_right_array.length -1; i++ ) {
			for(int j = i; j < sorted_right_array.length; j++) {
				if(sorted_right_array[i] > sorted_right_array[j]) {
					helper = sorted_right_array[i];
					sorted_right_array[i] = sorted_right_array[j];
					sorted_right_array[j] = helper;
				}		
			}
		}
		//System.out.println("sorted_right_array" + Arrays.toString(sorted_right_array));
		//assign left and right to array result
		helper = 0;
		for(int i = 0; i <= sorted_left_array.length -1; i++ ) {
			array_result[i] = sorted_left_array[i];
			}
		ii = sorted_left_array.length;

		for (int i = 0; i <= sorted_right_array.length - 1; i++) {
			array_result[ii] = sorted_right_array[i];
			ii++;
		}
		
		System.out.println("array_result before " + Arrays.toString(array_result));

		helper = 0;
		for(int i = 0; i < array_result.length -1; i++ ) {
			for(int j = i; j < array_result.length; j++) {
				if(array_result[i] > array_result[j]) {
					helper = array_result[i];
					array_result[i] = array_result[j];
					array_result[j] = helper;
				}		
			}
		}
		System.out.println("array_result after " + Arrays.toString(array_result));
		
	}


}
