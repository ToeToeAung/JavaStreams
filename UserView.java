package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The intuitive view about how stream operations execute
 * is that once a terminal operation is fired, intermediate
 * streams are created to support execution of the stream operations.
 * 
 * This user view is not actually what happens under the hood.
 * Lazy execution means that elements are streamed through the pipeline in such
 * a way that elements that are not needed are never processed.
 *
 */
public class UserView {
	final int LIMIT = 2;
	List<String> inputList;
	String inputLetter;
	MyStream ms = new MyStream();
	List<String> findStartsWithLetterLimit(List<String> list, String letter) {
		inputList = list;
		inputLetter = letter;
		
		//create the intermediate streams to support the intermediate operations
		//no processing occurs till terminal operation is invoked
	    MyStream filterStream = new MyStream();
	    MyStream mapStream = new MyStream();
	    MyStream limitStream = new MyStream();
	    
	    //now the  terminal operation is fired off; this triggers the sequence of 
	    //intermediate operations 
	    return collect(filterStream, mapStream, limitStream);
	    
	}
	
	List<String> collect(MyStream filter, MyStream map, MyStream limit) {
		populateFilterStream(filter);
		populateMapStream(filter, map);
		populateLimitStream(map, limit);
		return limit.list;
	}
	void populateFilterStream(MyStream filter) {
		for(String s : inputList) {
			if(s.startsWith(inputLetter)) filter.list.add(s);
		}
	}
	void populateMapStream(MyStream filter, MyStream mapStream) {
		for(Object ob : filter.list) {
			String s = ob.toString();
			mapStream.list.add(s.toUpperCase());
		}
	}
	void populateLimitStream(MyStream mapStream, MyStream limitStream) {
		for(int i = 0; i < LIMIT; ++i) {
			limitStream.list.add(mapStream.list.get(i));
		}
	}
	
	public static void main(String[] args) {
		UserView uv = new UserView();
		List<String> list = new ArrayList<>();
		list.add("Brian");
		list.add("Nate");
		list.add("Raju");
		list.add("Mary");
		list.add("Neal");
		list.add("Nora");

		List<String> result=new ArrayList<>();
		result.addAll(find(list,"N"));

		System.out.println("Friends with names that start"
				+ " with 'N': "+ result);
	}

	public static List<String> find(List<String> list, String letter) {
		return list.stream().filter(s -> s.startsWith(letter))
				.map(s -> s.toUpperCase())
				.limit(2)
				.collect(Collectors.toList());

	}

}
