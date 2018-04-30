package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();

		AbstractSorting<Integer> sortMerge = new MergeSort<Integer>();

		while (true) {
			int len = 1 + rand.nextInt(50);

			Integer[] array = new Integer[len];
			

			for (int i = 0; i < array.length; i++) {
				array[i] = -100 + rand.nextInt(200);
			}
			
			Integer[] clone = array.clone();
			sortMerge.sort(array);
			Arrays.sort(clone);

			if (!Arrays.equals(array, clone)) {
				System.out.println("Vrau!");
				System.out.println(Arrays.toString(array));
				System.out.println(Arrays.deepToString(clone));

			}
		}	
	}


}
