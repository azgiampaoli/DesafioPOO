package Desafio1;
public class Vehicle {
	 private String model;
	    private String brand;
	    private String plaque;
	    private String color;
	    private float km;
	    private boolean isOn;
	    private int fuelLiters;
	    private int velocity;
	    private double price;

	    public Vehicle(String model, String brand, String plaque, String color, float km, boolean isOn, int fuelLiters, int velocity, double price) {
	        this.model = model;
	        this.brand = brand;
	        this.plaque = plaque;
	        this.color = color;
	        this.km = km;
	        this.isOn = isOn;
	        this.fuelLiters = fuelLiters;
	        this.velocity = velocity;
	        this.price = price;
	    }

	    public void speedUp(){
	        if(isOn){
	            setVelocity(getVelocity()+20);
	            System.out.println("Velocidade atual: " + getVelocity());
	        }else{
	            System.out.println(" O carro esta desligado");
	        }


	    }

	    public void fuel(int fuelAdd){
	        int totalFuel = fuelAdd + getFuelLiters();
	        if(totalFuel >60){
	            System.out.println("A capacidade do tanque é de 60 litros");
	            System.out.println("No momento você só pode adicinonar " + (60 - getFuelLiters()) + " litros");
	            System.out.println("O tanque está com " + getFuelLiters() + " litros");
	        }else{
	            System.out.println("O tanque está com " + totalFuel + " litros");
	        }

	    }

	    public void brake(){
	        if(isOn && getVelocity()>0){
	            setVelocity(getVelocity()-20);
	            System.out.println("Velocidade atual: " + getVelocity());
	        }else if(isOn && getVelocity()==0){
	            System.out.println("O veículo está desacelerado");
	        }else{
	            System.out.println("O veículo não está ligado");
	        }

	    }
	    public void paint(String cor){
	        setColor(cor);
	        System.out.println("A cor do carro é " + getColor());
	    }

	    public void turnOn(){
	        if(isOn){
	            System.out.println("O carro já está ligado");
	        }else{
	            setOn(true);
	            System.out.println("Agora o carro está ligado");
	        }

	    }
	    public void turnOff(){
	        if(isOn && getVelocity()==0) {
	            setOn(false);
	            System.out.println("O veículo está desligado");
	        }else if(isOn && getVelocity()>0){
	            System.out.println("É necessário desacelerar o veículo para desligar");
	        }else{
	            System.out.println("O carro já está desligado");
	        }

	    }



	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getPlaque() {
	        return plaque;
	    }

	    public void setPlaque(String plaque) {
	        this.plaque = plaque;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public float getKm() {
	        return km;
	    }

	    public void setKm(float km) {
	        this.km = km;
	    }

	    public boolean isOn() {
	        return isOn;
	    }

	    public void setOn(boolean on) {
	        isOn = on;
	    }

	    public int getFuelLiters() {
	        return fuelLiters;
	    }

	    public void setFuelLiters(int fuelLiters) {
	        this.fuelLiters = fuelLiters;
	    }

	    public int getVelocity() {
	        return velocity;
	    }

	    public void setVelocity(int velocity) {
	        this.velocity = velocity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

}
