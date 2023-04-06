package ch01;

import java.util.Arrays;

public class IntArrayTest {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 1. 배열 + Stream 
		int[] arr = {1, 2, 3, 4, 5}; // 배열 선언과 초기화
		
		// 원래는 for 문 사용과 변수를 활용해서 연산처리했었다. 
		int sumVal = Arrays.stream(arr).sum(); // sum 최종연산 : 결과를 반환
		System.out.println("sumVal:" + sumVal);
		
		long count = Arrays.stream(arr).count();
		System.out.println("count :" + count );
		

	}// end of main

}//end of class 
