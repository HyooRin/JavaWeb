package ch02;

public class MyHome {

	public static void main(String[] args) {

		
		Styler styler = new Styler();
		TV tv = new TV();
		
		connect(styler);
		
		Adapter adapter = new Adapter(tv);
		connect(adapter);
		
		
	}// end of main
	
	public static void connect(Electronic220v electronic220v) {
		
		electronic220v.connect();
	}

}// end of class
