package com.johnabbott.myexample.model;

public class ArrayExample {

	//method to check if array length>=1 and first and last element are equal or not
	public boolean findArrayResult(int[] myArray) {
		
		int length=myArray.length;//finding length of an array
		if ((length >= 1) && (myArray[0] == myArray[length - 1])) {
			return true;
		}
		return false;
	}
}
