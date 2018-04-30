package sortingAlgorithms;

import util.Util;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;

			while (j > 0 && array[j].compareTo(array[j - 1]) < 0) {
				Util.swap(array, j, j - 1);
				j--;
			}

		}
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// TODO Auto-generated method stub

	}

}
