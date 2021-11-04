package chap06;

public class CarTest3 {
	public static void main(String[] args) {
		Car c1= new Car();
		Car c2= new Car(c1); 
		
		System.out.println("c1"+ c1.color+c1.gearType+c1.door);
		System.out.println("c2"+ c2.color+c2.gearType+c2.door);

		c1.door=100;
		System.out.println("c1"+ c1.color+c1.gearType+c1.door);
		System.out.println("c2"+ c2.color+c2.gearType+c2.door);

	}
}
