package com.omniwyse.sortingassigns;
/**
 * Selection sort class is used to sort the unsorted array in ascending order
 * Given unsorted array will be sorted into sorted ascending order array
 * @author haris
 *
 */
public class SelectionSort {

	public int[] sortArray(int[] elements) {
		int length = elements.length;
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				int minIndex = i;
				for (int j = i + 1; j < length; j++) {
					if (elements[j] < elements[minIndex]) {
						minIndex = j;
					}
				}
				int temp = elements[minIndex];
				elements[minIndex] = elements[i];
				elements[i] = temp;
			}
		}
		return elements;
	}
}
