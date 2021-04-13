package Assignment1;

public class CarTest {
	public static void main(String[] args) {
		
		Car myHybrid = new Car(45, 12);  // 45 mpg and a 12 gallon gas tank
		double gasLeft = myHybrid.getGasInTank();
		System.out.println(gasLeft);
		myHybrid.drive(100);  // drive 100 miles
		gasLeft = myHybrid.getGasInTank();
		System.out.println(gasLeft); 
		// Determine amount of gas left in tank
		myHybrid.addGas(12-gasLeft);  //Fill up the gas tank
		gasLeft = myHybrid.getGasInTank();
		System.out.println(gasLeft);

	}
}
