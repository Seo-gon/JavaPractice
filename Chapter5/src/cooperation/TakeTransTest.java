package cooperation;

public class TakeTransTest {
	
	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Thomas", 10000);
		Student studentE = new Student("Edward", 15000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayGreen = new Subway(2);
		Subway subwayYellow = new Subway(3);
		Taxi taxi1 = new Taxi(1);
		Taxi taxi2 = new Taxi(2);
		
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTaxi(taxi1);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus200.showBusInfo();
		subwayGreen.showSubwayInfo();
		subwayYellow.showSubwayInfo();
		taxi1.showTaxiInfo();
		taxi2.showTaxiInfo();
	}

}
