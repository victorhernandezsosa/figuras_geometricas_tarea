package figuras.hn.figuras_geometricas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calcular el area de la figuras" );
        
        int opcion = 0;
        
        
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	
        	Double resultado = null;
        	
        	if(opcion == 1) {
        		resultado = calcularcirculo(leernumeroTeclado("Ingrese el radio del Circulo"));
        	}else if(opcion == 2) {
        		resultado = calcularcuadrado(leernumeroTeclado("Ingrese el lado del Cuadrado:"));

        	}else if(opcion == 3) {
        		resultado = calcularrectangulo(leernumeroTeclado("Ingrese la base del Rectangulo:"),leernumeroTeclado("Ingrese la altura del rectangulo:"));

        	}else if(opcion == 4) {
        		resultado = calcularTriangulo(leernumeroTeclado("Ingrese la base del Triangulo:"),leernumeroTeclado("Ingrese la altura del triangulo:"));

        	}else {
        		System.out.println("Finalizando la aplicación.");
        	}
        	System.out.println("El area de la figura es: "+resultado);
        }
        
        
        
        
    }

	
	private static Double leernumeroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
		
	}


	private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}


	private static void imprimirMenu() {
		System.out.println("*** CALCULAR FIGURAS GEOMETRICAS ***");
		System.out.println("1. Calcular area de un Circulo");
		System.out.println("2. Calcular area de un Cuadrado");
		System.out.println("3. Calcular area de un Rectangulo");
		System.out.println("4. Calcular area de un Triangulo");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}


	public static Double calcularcirculo(double radio) {	
		
		double respuesta = 0;
		
		if(radio < 0) {
			System.err.println("No se puede calcular el area de un circulo con numeros negativos");
			return null;
			
		}else {
			respuesta = Math.PI * Math.pow(radio, 2);
		}
		
		
		
		return respuesta;
	}


	public static Double calcularcuadrado(double lado) {
		double respuesta = 0;
		
		if(lado < 0) {
			
			System.err.println("No se puede calcular el area de un cuadrado con numeros negativos");
			return null;
			
		}else {
			respuesta = lado * lado;
		}
		
		
		
		return respuesta;
	}


	public static Double calcularrectangulo(double base, double altura) {
		double respuesta = 0;
		
		if(base < 0 || altura < 0) {
			
			System.err.println("No se puede calcular el area de un rectangulo con numeros negativos");
			return null;
			
		}else {
			respuesta = base * altura;
		}
			
		return respuesta;
	}


	public static Double calcularTriangulo(double base, double altura) {
		double respuesta = 0;
		
		if(base < 0 || altura < 0) {
			
			System.err.println("No se puede calcular el area de un triangulo con numeros negativos");
			return null;
			
		}else {
			respuesta = (base * altura)/2;
		}
			
		return respuesta;
	}
}
