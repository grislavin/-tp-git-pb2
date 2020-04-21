package Calculadora;
public class Calculadora {

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
