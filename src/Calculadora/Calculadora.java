package Calculadora;
public class Calculadora {
<<<<<<< HEAD

private Integer a;
private Integer b;

public Calculadora(Integer a,Integer b) {
	this.a=a;
	this.b=b;
	}


public Integer sumar(){
Integer suma= a+b;	
	return suma;
}
public Integer restar(){
Integer restar= a-b;	
	return restar;
}
public Integer multiplicar(){
Integer multiplicacion= a*b;	
	return multiplicacion;
}
public Integer dividir(){
Integer division= a/b;	
	return division;
}


}
=======
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
>>>>>>> ef1965381aa2c952fb824306f90a43bb7477df05
