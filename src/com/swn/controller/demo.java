package com.swn.controller;

import java.util.HashMap;
import java.util.Map;

public class demo {
	
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3};

	        printDuplicateNumbers(numbers);
	    }

	    static void printDuplicateNumbers(int[] numbers) {
	        Map<Integer, Integer> numberFrequencyMap = new HashMap();

	       
	        for (int num : numbers) {
	            numberFrequencyMap.put(num, numberFrequencyMap.getOrDefault(num, 0) + 1);
	        }

	       
	        
	        System.out.println("Duplicate numbers:");
	        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }

}
//note first chaanges to undustand git
