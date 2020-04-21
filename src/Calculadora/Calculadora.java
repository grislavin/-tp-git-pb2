package Calculadora;
public class Calculadora {

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
