package ch01;

/*
 * 어댑터 패턴 설정
 * */
public class TencoAdapter implements Electronic220v {

	Electronic110v electronic110v;
	
	public TencoAdapter(Electronic110v electronic110v) {
		this.electronic110v = electronic110v;
	}
	
	
	@Override
	public void connect() {
		electronic110v.connect();
	}
	
	
	

}
