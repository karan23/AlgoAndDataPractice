package com.kmehra.sample.recursion;

import java.util.ArrayList;

public class RCapatalizeWords {

	static ArrayList<String> outputWords;
	
	public static int capitalizeWords(ArrayList<String> words) {
		
		String word = words.get(0).toUpperCase();
		
		outputWords.add(word);
		if(words.size() == 1) {
			return 1;
		}
		words.remove(0);
		return capitalizeWords(words);
	}
	
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("i");
		list.add("am");
		list.add("learning");
		list.add("recursion");
		
		outputWords = new ArrayList<>();
		
		capitalizeWords(list);
		
		outputWords.stream().forEach(string -> System.out.println("Value :: " + string));
	}
}
