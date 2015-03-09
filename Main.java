import java.util.Scanner;
class Main{
	
	public static void main( String [] args ){
		
		Scanner scanner = new Scanner(System.in);
		Retangulo r;
		r = new Retangulo();
		System.out.print("\nDigite a base:  ");
		r.base = scanner.nextDouble();
		System.out.print("\nDigite a altura:  ");
		r.altura = scanner.nextDouble();
		r.area();
		r.perimetro();
	
	}
	
}