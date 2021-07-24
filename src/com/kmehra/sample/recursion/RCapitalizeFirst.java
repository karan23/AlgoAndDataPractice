package com.kmehra.sample.recursion;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class RCapitalizeFirst {

	public static ArrayList<String> outputList;

	public static int capatilizeFirst(ArrayList<String> list) {

		String string = list.get(0);
		String first = string.substring(0, 1).toUpperCase();
		String output = first + string.substring(1);

		outputList.add(output);

		if (list.size() == 1) {
			return 1;
		}

		list.remove(0);
		return capatilizeFirst(list);
	}

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<>();
		list.add("car");
		list.add("taco");
		list.add("banana");

		outputList = new ArrayList<>();

		capatilizeFirst(list);

		outputList.stream().forEach(str -> System.out.println("value :: " + str));

	}
}
