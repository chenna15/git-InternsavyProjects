package Demo;

interface Calculator{
	double addition(double n1, double  n2);
	double subtraction(double n1, double  n2);
	double multiplication(double n1, double  n2);
	double division(double n1, double  n2) throws Exception;

}
class basicCalculator implements Calculator{

	@Override
	public double addition(double n1, double n2) {
		return n1+n2;
	}

	@Override
	public double subtraction(double n1, double n2) {
		return n1-n2;
	}

	@Override
	public double multiplication(double n1, double n2) {
		return n1*n2;
	}

	@Override
	public double division(double n1, double n2) throws Exception {
		if(n1/n2==0) {
			throw new Exception("division by zero is not possible");
		}
		return n1/n2;
	}

}

public class BasicCalculatorUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double n1=15;
double n2= 3;
 Calculator c= new basicCalculator();
 System.out.println("Addition:"+ c.addition(n1,n2));
	System.out.println("Subtraction: " +c.subtraction(n1, n2));
	System.out.println("Multiplication: " +c.multiplication(n1, n2));
	try {
		System.out.println("Division: " +c.division(n1, n2));
	} catch (Exception e) {
		// TODO Auto-generated catch block
System.out.println(e.getMessage());	}

	}

}
