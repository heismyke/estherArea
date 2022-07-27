package MainArea;

import java.util.Scanner;

public class AreaOfTriangle {
	private static Scanner Scanner;

	public static void main(String[] args) {
		double a, b, c, Perimeter, s, Area;
		Scanner = new Scanner(System.in);
		
		System.out.println("\n Please Enter Three sides of triangle: ");
		a = Scanner.nextDouble();
		b = Scanner.nextDouble();
		c = Scanner.nextDouble();

		Perimeter = a + b + c;
		s = (a + b + c)/2; 
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


		System.out.format("\n The Perimeter of Traiangle = %.2f\n", Perimeter);
		System.out.format("\n The Semi Perimeter of Traiangle = %.2f\n",s);
		System.out.format("\n The Area of triangle = %.2f\n",Area);
	}
}
