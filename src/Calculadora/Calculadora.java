package Calculadora;
import java.util.Scanner;

public class Calculadora {
	//commit test - master lavin
		Double a;
		Double b;
		Integer opcion;
		Double resultado;

		Scanner teclado = new Scanner(System.in);
		
		public void leerNumeros () {
			System.out.println("Ingrese el primer numero");
			a = teclado.nextDouble();
			System.out.println("Ingrese el segundo numero");
			b = teclado.nextDouble();
		}
		
		public void sumar () {
			resultado = a + b;
			System.out.println("El resultado es: " + resultado);
		}
		public void restar () {
			resultado = a - b;
			System.out.println("El resultado es: " + resultado);
		}
		public void multlipicar () {
			resultado = a * b;
			System.out.println("El resultado es: " + resultado);
		}
		public void dividir () {
			resultado = a / b;
			System.out.println("El resultado es: " + resultado);
		}

	}
