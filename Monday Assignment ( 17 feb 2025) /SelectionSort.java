package com.celcom.MondayAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(List<Integer> alist1) {
        int n = alist1.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (alist1.get(j) < alist1.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = alist1.get(minIndex);
            alist1.set(minIndex, alist1.get(i));
            alist1.set(i, temp);
        }
    }

	public static void main(String[] args) {
		List<Integer> alist1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements for first array list: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			alist1.add(sc.nextInt());
		}
		// Using Selection Sort
        System.out.println("Original ArrayList: " + alist1);
        selectionSort(alist1);
        System.out.println("Sorted using Selection Sort: " + alist1);
		

	}

}
