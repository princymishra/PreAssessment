package assessment;

import java.util.*;
import java.time.LocalDate;

interface train{
	 
	  default void attend(){
	    System.out.println("i am in interface");
	  }

	}

class a1 implements train{
	
}

public class PracInterface {
	public static void main(String[] args) {
		train t= new a1();
		t.attend();
		
		a1 a = new a1();
		a.attend();
		System.out.println("Hey there!!");
	}
}
