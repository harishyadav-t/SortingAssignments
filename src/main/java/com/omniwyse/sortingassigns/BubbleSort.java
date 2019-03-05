package com.omniwyse.sortingassigns;

public class BubbleSort {
	public int[] sortArray(int[] elements) {
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
		}
		return elements;
	}
}
