package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 
		System.out.println(10+ "");
		// 문자열 데이터 타입에서 기본데이터 타입으로 변환하는 방법을 알아야한다.
		// 래퍼클래스란 개념을 알고 있으면 된다. 
		String str = "127";
		
		String str2 = "10.5";
		String str3 = "true";
		
		byte b = Byte.parseByte(str);//127 -128
		System.out.println("byte" + b);
		int i = Integer.parseInt(str);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(!bool);	

	}

}
