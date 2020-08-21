package staticEx;

public class Company {

	private static Company instance = new Company(); //변수 instance생성
	
	private Company() {}
	
	public static Company getInstance() { //외부에서 인스턴스 생성과 상관없이 호출하기 위해 static으로생성
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
