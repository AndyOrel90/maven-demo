package com.revature.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		String[] arr = {"bob", "joe", "shawn", "tim", "gandalf"};
		
		// Create using Arrays.asList
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		
		// Create stream from array
		Stream<String> arrStream = Arrays.stream(arr);
		
		// Create stream from literal
		Stream literalStream = Stream.of("A", "B", "C");
		
		// map a stream
		// i -> i.length()
		// String i -> { return i.length(); }
		// public int returnLength(String i) { return i.length() };
		Stream<Integer> arrListStream = list.stream().map( i -> i.length() );
		Integer[] lengthOfListArr = arrListStream.toArray(Integer[]::new);
		
		// filter a stream
		Stream<String> noJoeStream = list.stream().filter( i -> !i.contains("joe"));
		String[] noJoeArr = noJoeStream.toArray(String[]::new);
		
		for(String i : noJoeArr) {
			System.out.println(i);
		}

	}

}
