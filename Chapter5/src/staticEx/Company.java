package staticEx;

public class Company {

	private static Company instance = new Company(); //���� instance����
	
	private Company() {}
	
	public static Company getInstance() { //�ܺο��� �ν��Ͻ� ������ ������� ȣ���ϱ� ���� static���λ���
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
