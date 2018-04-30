package sortingAlgorithms;

public abstract class AbstractSorting<T extends Comparable<T>> {

	public abstract void sort(T[] array);
		
	public abstract void sort(T[] array, int leftIndex, int rightIndex);

}
	

