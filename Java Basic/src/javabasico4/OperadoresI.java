package javabasico4;
/**
 * @author Manuel Garc�a
 */
public class OperadoresI {

	public static void main(String[] args) {
		System.out.println("1 ****************");
		//1. Operadores Aritm�ticos
		//1.1 Operador de asignaci�n
		int primerNumero = 8;
		int segundoNumero = 2;
		//1.2 Operadores aritm�ticos.
		int suma= primerNumero+segundoNumero; 
		int resta = primerNumero-segundoNumero;
		int multiplicacion= primerNumero*segundoNumero;
		int division = primerNumero/segundoNumero;
		int resto = primerNumero % segundoNumero;
		
		System.out.println("Primer N�mero: "+primerNumero+ " ; Segundo N�mero: "+segundoNumero);
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicaci�n: "+multiplicacion);
		System.out.println("Divisi�n: "+division);
		System.out.println("Resto: "+resto);
		
		System.out.println("2 Op. Unarios*********");
		//1.3 Op. Unarios
		int tercerNumero = 3;
		int cuartoNumero = 4;
		System.out.println("Tercer N�mero: "+tercerNumero+ " ; Cuarto N�mero: "+cuartoNumero);
		
		tercerNumero++;
		System.out.println("Tercer N�mero: "+tercerNumero);
		
		cuartoNumero--;
		System.out.println("Cuarto N�mero: "+cuartoNumero);

		int quintoNumero =3;
		System.out.println("Quinto N�mero: "+quintoNumero);
		
		int sextoNumero = 3 + quintoNumero++;
		System.out.println("Sexto N�mero: "+sextoNumero);
		
		System.out.println(" y el quinto N�mero ???");
		System.out.println("Quinto N�mero: "+quintoNumero);
		
		int septimoNumero = 3;
		System.out.println("S�ptimo N�mero: "+ septimoNumero);
		
		int octavoNumero = 3 + ++septimoNumero;
		System.out.println("Octav N�mero: "+ octavoNumero);
		
		//1.4 operadores combinados
		
		int novenoNumero = 5;
		System.out.println("Noveno N�mero: "+ novenoNumero);
		novenoNumero -=2;
		System.out.println("Noveno N�mero decrementado es : "+novenoNumero);
		novenoNumero +=3;
		System.out.println("Noveno N�mero incrementado es : "+novenoNumero);
		novenoNumero *=2;
		System.out.println("Noveno N�mero multiplicado *2 es : "+novenoNumero);
		novenoNumero/=3;
		System.out.println("Noveno N�mero Dividido /3 es : "+novenoNumero);
		
		
	}

}
