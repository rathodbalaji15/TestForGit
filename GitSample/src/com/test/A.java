package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,4,6);
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
