package simeon;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.slow);
		fan1.setRadius(8);
		fan1.setColor("orange");
		fan1.setSwitchedOn(true);
		System.out.println("First fan:");
		System.out.println(fan1.toString(fan1.getSpeed(), fan1.getRadius(), fan1.getSwitchedOn(), fan1.getColor()));
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.medium);
		fan2.setRadius(5);
		fan2.setColor("green");
		fan2.setSwitchedOn(false);
		System.out.println("Second fan:");
		System.out.println(fan2.toString(fan2.getSpeed(), fan2.getRadius(), fan2.getSwitchedOn(), fan2.getColor()));
		
	}

}