package arithmeticOperation;

public class LeapYear {
	public static void main(String args[]){
		int year=2016;
	boolean leap=false;
	if(year%400==0){
		leap=true;
	}
	else if(year%100==0){
		leap=true;
	}
	else if(year%4==0){
		leap=true;
	}
	else leap=false;
	
	if(leap)
		System.out.println("its leap year");
	else
		System.out.println("its not leap year"); 
	}
}
