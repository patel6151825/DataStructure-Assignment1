package com.johnabbott.myexample.application;

import java.util.Arrays;

import com.johnabbott.myexample.model.ArrayExample;

public class RunProgram {
	public static void main(String[] args) {
		ArrayExample example = new ArrayExample();

		int[] myArray1 = new int[] { 15, 20, 13, 45, 12 };
		int[] myArray2 = new int[] {};
		int[] myArray3 = new int[] { 10, 10 };
		int[] myArray4 = new int[] { 11, 22, 33, 44, 33, 12, 11 };
		int[] myArray5 = new int[] {25};

		System.out.println("----------Results------------");
		boolean result1 = example.findArrayResult(myArray1);
		boolean result2 = example.findArrayResult(myArray2);
		boolean result3 = example.findArrayResult(myArray3);
		boolean result4 = example.findArrayResult(myArray4);
		boolean result5 = example.findArrayResult(myArray5);

		System.out.println(Arrays.toString(myArray1) + "---->" + result1);
		System.out.println(Arrays.toString(myArray2) + "---->" + result2);
		System.out.println(Arrays.toString(myArray3) + "---->" + result3);
		System.out.println(Arrays.toString(myArray4) + "---->" + result4);
		System.out.println(Arrays.toString(myArray5) + "---->" + result5);
	}
}
