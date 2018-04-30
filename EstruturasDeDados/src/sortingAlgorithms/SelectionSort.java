package sortingAlgorithms;

import util.Util;

public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {
	
	@Override
	public void sort(T[] array) {
		for (int i = 0; i < array.length; i++) {
			int menor = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[menor].compareTo(array[j]) > 0) {
					menor = j;
				}
			}
			
			if (menor != i) {
				Util.swap(array, i, menor);
			}
		}
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
	}

}
