package AlgorithmsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class closestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 4, 8, -1, 10, 2, 6, 5, 7, 7, 1, 2, -100, -5 };
		// System.out.println(Arrays.toString(array1));
		megersortClosestToZero(array1);
		// megersort(random1());
	}

	public static void megersortClosestToZero(int[] ts) {

		int helper = 0;
		ArrayList<Integer> sorted_left_array = new ArrayList<Integer>();
		ArrayList<Integer> sorted_right_array = new ArrayList<Integer>();
		System.out.println("ts.length: " + ts.length);

		if(ts.length > 1) {
			
			for (int l = 0; l < ts.length; l++) {
				for (int r = 0; r < ts.length; r++) {
					if (ts[l] < ts[r]) {
						helper = ts[l];
						ts[l] = ts[r];
						ts[r] = helper;
					}
				}
			}
			
			System.out.println("ts= " + Arrays.toString(ts));

			for (int i = 0; i < ts.length; i++) {
				if (ts[i] < 0) {
					sorted_left_array.add(ts[i]);
				} else {
					sorted_right_array.add(ts[i]);
				}
			}

		}

		System.out.println("sorted_left_array = " + sorted_left_array);
		System.out.println("sorted_right_array = " + sorted_right_array);
		
		
		int left = (sorted_left_array.get((sorted_left_array.size()-1)))*(-1);
		int right = sorted_right_array.get((sorted_right_array.size()-1));

		if(left == right) {
			System.out.println("left y right are the same" + right);
		}else if(right < left) {
			System.out.println("right is closest to cero : " + right);
		}else {
			System.out.println("left is closest to cero "+ sorted_left_array.get((sorted_left_array.size()-1)));
		}

	}
}
