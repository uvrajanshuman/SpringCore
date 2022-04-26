package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation_ambiguity.primary_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int search(int array[], int element) {
		sortAlgorithm.sort(array);
		
		int low = 0, high = array.length-1;
		// Repeat until the pointers low and high meet each other
	    while (low <= high) {

	      // get index of mid element
	      int mid = low + (high - low) / 2;

	      // if element to be searched is the mid element
	      if (array[mid] == element)
	        return mid;

	      // if element is less than mid element
	      // search only the left side of mid
	      if (array[mid] < element)
	        low = mid + 1;

	      // if element is greater than mid element
	      // search only the right side of mid
	      else
	        high = mid - 1;
	    }

	    return -1;

	}
}
