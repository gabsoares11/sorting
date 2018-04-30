package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T>{

	@Override
	public void sort(T[] array) {
		int middle = array.length / 2;
		
		sort(array, 0, middle);
		sort(array, middle + 1, array.length);
		
		merge(array, 0, middle, array.length);
	}

	private void merge(T[] array, int begin, int middle, int end) {
		T[] vetor = Arrays.copyOf(array, array.length);
		
		int i = begin;
		int j = middle + 1;
		int k = begin;

		while (i <= middle && j <= end) {
			if (vetor[i].compareTo(vetor[j]) < 0) {
				array[k++] = vetor[i++];
			} else {
				array[k++] = vetor[j++];
			}
		}
		
		while (i <= middle) {
			array[k++] = vetor[i++];
		}
		
		while(j <= end) {
			array[k++] = vetor[j++];
		}
		
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// TODO Auto-generated method stub
		
	}

	
}
