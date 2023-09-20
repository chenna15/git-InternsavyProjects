package Demo;
import java.util.*;
public class ConvertCelciusToFahrenheitAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc= new Scanner(System.in);
System.out.println("Temperature conversions from Fahrenheit to Celcius and ViceVersa");
int result=sc.nextInt();
if(result ==1) {
	
	System.out.println("Fahrenheit to Celcius Conversion:");
	System.out.println("Fahrenheit");
	double value= sc.nextDouble();
	double finalValue= (value-32)*5/9;
	System.out.println("Celcius :");
	// Here I1 used Math.round method to round to nearest integer value
	//System.out.println(Math.round(finalValue*10.0/10.0));
	System.out.println(finalValue);
}else if(result==2) {
	System.out.println("Celcius to Fahrenheit Conversion:");
	System.out.println("Celcius");
	double value2= sc.nextDouble();
	double finalValue2= (value2 *9/5 +32);
	System.out.println("Fahrenheit :");
	System.out.println(finalValue2);
}else {
	System.out.println("Invalid Selection");
}
 
	}

}
