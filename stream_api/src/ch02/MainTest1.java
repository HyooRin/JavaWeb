package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 자료 구조 Stream API 사용해보기
		
		List<String> sList = new ArrayList<>();
		sList.add("손쥐");
		sList.add("미짱");
		sList.add("성히씅");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach( s -> { System.out.print( s + " "); }); 
		System.out.println("");
		System.out.println("----------예에----------");
		
		sList.stream().sorted().forEach( s -> System.out.print( s + " "));
		System.out.println("");
		System.out.println("----------예에----------");

		
	}

}
