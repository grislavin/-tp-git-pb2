package Calculadora;
public class Calculadora {
<<<<<<< HEAD

public Calculadora() {
	
	}


public Integer sumar(Integer numero1,Integer numero2){
Integer suma=new Integer(numero1+numero2);	
	return suma;
}
public Integer restar(Integer numero1,Integer numero2){
	Integer resta=new Integer(numero1-numero2);	
	return resta;
}

public Integer multiplicar(Integer numero1,Integer numero2){
	Integer multiplicacion=new Integer(numero1*numero2);	
	return multiplicacion;
}
public Integer dividir(Integer numero1,Integer numero2){
	Integer division=0;
	if((numero1!=0)&&(numero2!=0)) {
		division=new Integer(numero1/numero2);	
	}else {
	
	}
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
