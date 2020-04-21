package Calculadora;
import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Integer opcion;
		Integer resultado=null;
		Integer a;
		Integer b;
		// branch switch 2  
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Ingrese su operación /n 1 para sumar /n 2 pararestar /n 3 para multiplicar /n 4 para dividir");
		opcion = teclado.nextInt();
		do {
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
		
		}
		while(opcion < 1 && opcion > 4);
		Calculadora calculadora=new Calculadora(a,b);
		switch (opcion) {
		case 1:
			calculadora.sumar();
			break;
		case 2:
			calculadora.restar();
			break;
		case 3:
			calculadora.multiplicar( );
		break;
		case 4:
		calculadora.dividir();
			break;
		default:
			break;
			
		}
		
		 System.out.println("El resultado es " + resultado.toString());	
	}
}