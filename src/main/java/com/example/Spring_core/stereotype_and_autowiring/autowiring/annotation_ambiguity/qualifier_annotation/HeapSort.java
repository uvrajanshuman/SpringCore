package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation_ambiguity.qualifier_annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("heap")
public class HeapSort implements SortAlgorithm{

	public void sort(int[] arr) {
		
		System.out.println("Heap Sort");
		
		int n = arr.length;
		  
	      // Build max heap
	      for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(arr, n, i);
	      }
	  
	      // Heap sort
	      for (int i = n - 1; i >= 0; i--) {
	        int temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;
	  
	        // Heapify root element
	        heapify(arr, i, 0);
	      }
	}
	
	void heapify(int arr[], int n, int i) {
	      // Find largest among root, left child and right child
	      int largest = i;
	      int l = 2 * i + 1;
	      int r = 2 * i + 2;
	  
	      if (l < n && arr[l] > arr[largest])
	        largest = l;
	  
	      if (r < n && arr[r] > arr[largest])
	        largest = r;
	  
	      // Swap and continue heapifying if root is not largest
	      if (largest != i) {
	        int swap = arr[i];
	        arr[i] = arr[largest];
	        arr[largest] = swap;
	  
	        heapify(arr, n, largest);
	      }
	    }

}
