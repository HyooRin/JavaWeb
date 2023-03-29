package ch01;

public class MyHouse {

	public static void main(String[] args) {
		
		
		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDryer hairDryer = new HairDryer();
		IPad iPad = new IPad();
		// 다형성		
		connect(cleaner);		
		connect(airConditioner);
		
		// 철물점에서 어댑터 준비 
		TencoAdapter adapterHairDryer = new TencoAdapter(hairDryer);
		connect(adapterHairDryer);
		TencoAdapter adapter = new TencoAdapter(iPad);
		connect(adapter);
		
		

	}// end of main
	
	//MyHouse static 전기콘센트
	public static void connect(Electronic220v electronic220v) {
		electronic220v.connect();
		
	}

}// end of class
