package Desafio1;
public class Main {
	 public static void main(String[] args) {

	        Vehicle vehicle = new Vehicle("fiat", "uno", "ags1245", "azul", 1254 , true, 50, 20, 12500);
	        Vehicle vehicle1 = new Vehicle("bmw", "z3", "nhe4739", "vermelho", 0124, false, 60, 0,3254000);

	        System.out.println(vehicle.getColor());
	        vehicle.paint("verde");
	        vehicle.speedUp();
	        vehicle.brake();
	        vehicle.fuel(5);
	        vehicle.brake();
	        vehicle.brake();
	        vehicle.turnOff();
	        System.out.println();

	        vehicle1.turnOff();
	        vehicle.speedUp();
	        vehicle.turnOn();
	        vehicle.speedUp();
	        vehicle.fuel(10);
	        vehicle.turnOff();



	    }

}
