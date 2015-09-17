import java.util.Scanner;

public class Run {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Ingrese el primer entero");
		a = sc.nextInt();
		System.out.println("Ingrese el segundo entero");
		b = sc.nextInt();
		
		System.out.println("Que operacion desea realizar?");
		System.out.println();
		System.out.println();
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. multiplicacion");
		System.out.println("4. salir");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("la suma es: "+ suma(a,b));
			break;
		case 2:
			System.out.println("la resta es: "+ resta(a,b));
			break;
		case 3:
		default:
			System.out.println("la multiplicacion es: "+ mult(a, b));
			break;
		}
		
		sc.close();
	}
	
	public static int suma (int a, int b)
	{
		return a+b;
	}
	public static int mult(int a, int b)
	{
		return a * b;
	}
	
	public static int resta(int a , int b)
	{
		return a - b;
	}
}
