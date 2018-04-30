package sortingAlgorithms;

import util.Util;

public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
	
	@Override
	public void sort(T[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j+1]) > 0) {
					Util.swap(array, j, j+1);
				}
			}
		}
		
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex - 1; i++) {
			for (int j = leftIndex; j <= rightIndex - i - 1; j++) {
				if (array[j].compareTo(array[j+1]) > 0) {
					Util.swap(array, i, j);
				}
			}
		}
	}
	
}
