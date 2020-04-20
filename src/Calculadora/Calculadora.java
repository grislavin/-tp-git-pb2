package Calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado = null;
// branch switch 2  
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su operación /n 1 para sumar /n 2 pararestar /n 3 para multiplicar /n 4 para dividir");
		opcion = teclado.nextInt();
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		switch (opcion) {
		case 1:
			resultado = a + b;
			break;
		case 2:
			resultado = a - b;
			break;
		case 3:
			resultado = a * b;
			break;
		case 4:
			resultado = a / b;
			break;
		default:
			break;
			
		}
	}
}