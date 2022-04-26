package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation_ambiguity.qualifier_annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm{

	public void sort(int[] array) {
		
		System.out.println("Bubble Sort");
		
		int size = array.length;
	    
	    // loop to access each array element
	    for (int i = 0; i < (size-1); i++) {
	    
	      // check if swapping occurs
	      boolean swapped = false;
	      
	      // loop to compare adjacent elements
	      for (int j = 0; j < (size-i-1); j++) {

	        // compare two array elements
	        // change > to < to sort in descending order
	        if (array[j] > array[j + 1]) {

	          // swapping occurs if elements
	          // are not in the intended order
	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	          
	          swapped = true;
	        }
	      }
	      // no swapping means the array is already sorted
	      // so no need for further comparison
	      if (!swapped)
	        break;

	    }
	}

}
