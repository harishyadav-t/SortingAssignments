package com.omniwyse.sortingassigns;

import com.omniwyse.sorting.exceptions.EmptyArrayException;

public class BubbleSort {
	public int[] sortArray(int[] elements) {
		try {
		if(elements != null && elements.length >0) {
			int length = elements.length;
			for(int i=0;i<length;i++) {
				boolean isSwapDone=false;
				for(int j=0;j<length-i-1;j++) {
					if(elements[j] > elements[j+1]) {
						int temp = elements[j+1];
						elements[j+1] = elements[j];
						elements[j] = temp;
						isSwapDone = true;
					}
				}
				if(!isSwapDone) {
					break;
				}
			}
		}else {
			throw new EmptyArrayException();
		}
		}catch(Exception e) {
			
		}
		return elements;
	}
}
