package ch02;

public class Adapter implements Electronic220v{
	
	Electronic110v electronic110v;

	
	public Adapter(Electronic110v electronic110v) {
		this.electronic110v = electronic110v;
	}
	
	
	@Override
	public void connect() {
		electronic110v.connect();
		
	}

}
