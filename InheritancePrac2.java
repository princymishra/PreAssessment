package assessment;

import java.util.*;

class Car{
	private int speeed;
	private int gear;
	
	public Car(int speeed, int gear) {
		super();
		this.speeed = speeed;
		this.gear = gear;
	}
	
	public void applyBrakes(int decrement){
		speeed -= decrement;
		
	}
	
	public void accelerate(int increment){
		speeed += increment;

	}
	
	public String printDetails(){
		return(gear +" Gear "+"\n"+"The speed of the bicycle is: "+speeed);
	}
}


class Nano extends Car{
	public int seatHeight;
	
	public Nano(int gear, int speeed, int startHeight){
		super(gear,speeed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue){
		seatHeight = newValue;
	}
	
	public String printDetails() {
		return(super.printDetails()+ 
                "\nSeat Height is: "+seatHeight);
	}
}


public class InheritancePrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nano nano = new Nano(3, 80, 3);
		System.out.println(nano.printDetails());
	}

}
