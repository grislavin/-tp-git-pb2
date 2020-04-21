package Calculadora;
import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Integer opcion;
		Integer resultado=0;
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
		Calculadora calculadora=new Calculadora();
		switch (opcion) {
		case 1:
			resultado=calculadora.sumar(a,b);
			break;
		case 2:
			resultado=calculadora.restar(a,b);
			break;
		case 3:
			resultado=calculadora.multiplicar(a,b);
		break;
		case 4:
		resultado=calculadora.dividir(a,b);
			break;
		default:
			break;
			
		}
		
		 System.out.println("El resultado es " + resultado.toString());	
	}
}