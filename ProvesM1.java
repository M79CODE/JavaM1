package proves;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProvesM1 {
	
	/* Problema 1
	   Define 4 variables con estos nombres: Nombre, Apellidos, teléfono y precio. 
	   var nombre, apellidos : TEXTO 
	   var telefono : ENTERO 
	   var precio: REAL
	*/
	public static void main(String[] args) {
		String nombre;
		String apellidos;
		int telefono;
		double precio;
	} 
	
	
		
	/* Problema 2
	   Pedir un valor, sumarle 3 y visualizar el resultado. 
	   var x , y : ENTERO 
	   Escribir ("Introduce un numero:") 
	   Leer (x) 
	   y = x + 3 
	   Escribir ("Resultado :" + y) 	 
	
	 public static void main(String[] args){
	 	Scanner reader = new Scanner(System.in);
	 	int x;
	 	System.out.print("Introduce un número: ");
	 	x = reader.nextInt();
	 	int y = x+3;
	 	System.out.print("Resultado: " + y);
	 }
	 
	 */
	
	 /* Problema 3
	    Pedir 2 valores y visualizar su suma. 
		 var x , y , suma : ENTERO 
		 Escribir ("Introduce primer sumando:") 
		 Leer (x) 
		 Escribir ("Introduce segundo sumando:") 
		 Leer(y) 
		 suma = x + y 
		 Escribir ("El resultado es" + suma) 
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int x, y, suma;
		System.out.print("Introduce primer sumando: ");
		x = reader.nextInt();
		System.out.print("Introduce segundo sumando: ");
		y = reader.nextInt();
		suma = x + y;
		System.out.print("El resultado es " + suma);
	}
	
 	*/
	
	
	/* Problema 4
	   Escribir un programa que pida una cantidad en euros y la convierta a dólares (supón: 1 euro = 1,5 dólares) 
		 var euro , dolar : REAL 
		 const cambio : REAL = 1.5 
		 Escribir ("Introduce EUROS") 
		 Leer (euro) 
		 dolar = euro * cambio 
		 Escribir ("Son" + dolar + "dólares")  
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int euro;
		double dolar;
		double cambio = 1.5;
		System.out.print("Introduce cantidad en €uros para hacer el cambio: ");
		euro = reader.nextInt();
		dolar = euro * cambio;
		System.out.print(euro + " €uros equivalen a " + dolar + " dólare$.");
	}
	
	*/
	
	
	/* Problema 5
	   Escribir un programa para calcular el importe de una venta en un supermercado. El usuario debe indicar el nombre del producto, el precio por unidad 
	   y el nº de unidades y el programa sacará por pantalla el nombre del producto, el nº de unidades vendidas y el precio total. 
		 var producto : TEXTO 
		 var precio , unidades, total : REAL 
		 Escribir ("Introduce producto:") 
		 Leer (producto) 
		 Escribir ("Introduce precio de" + producto) 
		 Leer (precio) 
		 Escribir (“Introduce unidades vendidas de:" + producto) 
		 Leer (unidades) 
		 total = precio * unidades 
		 Escribir ("Cantidad de " + producto + ": " + unidades + " unidades. Total de: " + total + " €")   
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String producto;
		int unidades;
		double precio, total;
		System.out.print("Introduce el nombre del producto: ");
		producto = reader.next();
		System.out.print("Introduce el precio de " + producto + ": ");
		precio = reader.nextDouble();
		System.out.print("Introduce las unidades vendidas de " + producto + ": ");
		unidades = reader.nextInt();
		total = precio * unidades;
	    BigDecimal resultado = BigDecimal.valueOf(total);
        resultado = resultado.setScale(2, RoundingMode.HALF_DOWN);
		System.out.print("Has comprado " + unidades + " unidades de " + producto + " por un total de " + resultado + "€.");
	}
	
	*/
	
	
	/* Problema 6 
	   Escribir un programa que calcule la nómina de un trabajador de la manera siguiente. El trabajador cobra un precio fijo por hora y 
	   se le retiene un 5% en concepto de IRPF. El programa debe pedir el nombre del trabajador, las horas trabajadas y el precio que cobra por hora. 
	   Como salida debe imprimir el sueldo bruto, la retención y el sueldo neto 
		 const IRPF : REAL = 0.05 
		 var precio_hora, horas_trab, sueldo_bruto, retencion, sueldo_neto : REAL 
		 var nombre : TEXTO 
		 Escribir ("introduzca nombre del trabajador") 
		 Leer (nombre) 
		 Escribir ("horas trabajadas") 
		 Leer (horas_trab) 
		 Escribir ("introduzca precio hora") 
		 Leer (precio_hora) 
		 sueldo_bruto = horas_trab * precio_hora 
		 retencion = sueldo_bruto * IRPF 
		 sueldo_neto = sueldo_bruto - retencion 
		 Escribir ("Datos de " + nombre + " : Bruto=" + sueldo_bruto + "retención:" + 
		 retencion + "sueldo_neto:" + sueldo_neto) 
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String nombre;
		int horasTrab;
		double precioHora, sueldoBruto, retencion, sueldoNeto;
		double IRPF = 0.05;
		System.out.print("Introduce el nombre del trabajador: ");
		nombre = reader.next();
		System.out.print("Introduce el precio por hora trabajada: ");
		precioHora = reader.nextDouble();
		System.out.print("Introduce el número de horas trabajadas: ");
		horasTrab = reader.nextInt();
		sueldoBruto = precioHora * horasTrab;
		retencion = sueldoBruto * IRPF;
		sueldoNeto = sueldoBruto - retencion;
		BigDecimal resultadoSueldoBruto = BigDecimal.valueOf(sueldoBruto);
        resultadoSueldoBruto = resultadoSueldoBruto.setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal resultadoRetencion = BigDecimal.valueOf(retencion);
        resultadoRetencion = resultadoRetencion.setScale(2, RoundingMode.HALF_DOWN);
	    BigDecimal resultadoSueldo = BigDecimal.valueOf(sueldoNeto);
        resultadoSueldo = resultadoSueldo.setScale(2, RoundingMode.HALF_DOWN);
		System.out.print("El trabajador " + nombre + " cobrará lo siguiente por " + horasTrab + " horas trabajadas: " + "\n" 
        + "Sueldo Bruto: "+ resultadoSueldoBruto + "€" + "\n" 
		+ "Retención 5% IRPF: " + resultadoRetencion + "€" + "\n" 
        + "Sueldo Neto: " + resultadoSueldo + "€");
	}
	
	*/
	
	
	// VARIABLES Y CONSTANTES 
	
	/*	Problema 1 
		¿Qué resultado devuelve el siguiente código? 
		Boolean x = true; 
		Boolean y = false; 
		System.out.println(x || y); 
		System.out.println(x && y); 
	
	public static void main(String[] args){
		Boolean x = true; 
		Boolean y = false; 
		System.out.println(x || y); // true
		System.out.println(x && y); // false
	}
	
	*/
	
	
	/* Problema 2
	   ¿Qué resultado devuelve el siguiente código? 
		int x = 25; 
		System.out.println(x==7);
	
	public static void main(String[] args){
		int x = 25; 
		System.out.println(x==7); // false
	}
	
	*/
	
	
	/* Problema 3
	   ¿Qué resultado devuelve el siguiente código? 
		int x = 25; 
		int y = 77; 
		System.out.println(x!=y);
	
	public static void main(String[] args){
		int x = 25; 
		int y = 77; 
		System.out.println(x!=y); // true
	}
	
	*/
	
	
	/* Problema 4
	   Haz un programa que calcule el resultado de la siguiente fórmula: 
		( a + b - c * ( d / e )) * f 
		Usa las variables que necesites
	
	public static void main(String[] args){
		int a=4, b=6, c=7, d=8, e=9, f=8;
		int p = ( a + b - c * ( d / e )) * f;
		System.out.println("Resultado final: " + p); // Resultado final: 80
	}
	
	*/
	
	
	/* Problema 5
	   ¿Qué sucedería en la siguiente operación? ¿Por qué?
		float x = 23.5f; 
		int y = x; 

	public static void main(String[] args){
		float x = 23.5f;
		int y = x;
	} 
	// Error: Unresolved compilation problem: Type mismatch: cannot convert from float to int >> Pérdida de precisión.
	// No hay conversión implícita y el sistema indica pérdida de precisión al pasar de float a entero.  
	
	*/
	
	
	/* Problema 6
	   ¿Qué sucedería en la siguiente operación? ¿Por qué? 
		float x = 23.5f; 
		int y = (int)x; 
	
	public static void main(String[] args){
		float x = 23.5f; 
		int y = (int)x; // Operación correcta. Se realiza una conversión de tipo float a entero
		System.out.println(x); // 23.5
		System.out.println(y); // 23
	}
	
	*/
	
	
	/* Problema 7
	   ¿Qué sucedería en la siguiente operación? ¿Por qué?
		int x = 23; 
		float y = x;
	
	public static void main(String[] args){
		int x = 23; 
		float y = x; // No hay ningún problema. Existe conversión implícita de entero a float.
		System.out.println(x); // 23
		System.out.println(y); // 23.0
	}
	
	*/
	
	
	/* Problema 8
	   ¿Qué sucedería en la siguiente operación? ¿Por qué?
		int x = 23; 
		float y = (float)x;
	
	public static void main(String[] args){
		int x = 23; 
		float y = (float)x; // No hay ningún problema ya que existe tanto conversión explicita como implícita de entero a float
		System.out.println(x); // 23
		System.out.println(y); // 23.0
	}
	
	*/
	
	
	/* Problema 9 
	   ¿Qué tipo de dato usarías para una máxima precisión con decimales? 
		(- Int/-Double/- Float/-Short)
		// El tipo double
	*/
	
	
	/* Problema 10
	   Para cada uno de los programas que se dan a continuación, decir qué será printado cuando sea ejecutado.
	  
	   a)
	
	public static void main(String[] args){
		int a, b;
		a = 10;
		b = 15;
		a = b+3+5*b;
		System.out.println(a); // 93
		b = a-b*2;
		System.out.println(b); // 63
		a = a + b;
		System.out.println(a); // 156
		System.out.println(b); // 63
	}
	
	*/
	
	/* b)
	
	public static void main(String[] args){
		int a, b;
		a = 10;
		b = 11;
		a = b/4%3;
		b = 2+a*3/2+1;
		System.out.println(a); // 2
		System.out.println(b); // 6
	}
	
	*/
	
	/* c)
	
	public static void main(String[] args){
		int a, b, c;
		a = 5;
		b = 6;
		a = 2+b-a*2/4;
		b = a+2*b+1;
		c = a%b + b%a + a/b + b/a;
		System.out.println(a); // 6
		System.out.println(b); // 19
		System.out.println(c); // 10
	}
	
	*/
	
	/* d)
	
	public static void main(String[] args){
		double a, b;
		a = 30.0;
		b = 10.5;
		a = a + 10.0/3 + (b-1/2.0);
		b = -b;
		System.out.println(a); // 43.333333333333336
		System.out.println(b); // -10.5
	}
	
	*/
	
	/* e)
	
	public static void main(String[] args){
		double a, b;
		a = 30.0;
		b = 10.5;
		a = a+10/3+(b-1/2);
		b = -b;
		System.out.println(a); // 43.5
		System.out.println(b); // -10.5
	}
	
	*/
	
	/* f)
	
	public static void main(String[] args){
		int e, f;
		e = -1 + 2*3/4%5;
		f = -(1 + (2*(3/(4%5))));
		System.out.println(e); // 0
		System.out.println(f); // -1
	}
	
	*/
	
	/* g)
	
	public static void main(String[] args){
		boolean m, n;
		m =  true && false || true && !false;
		n = m && true && (false || true) && !(true || false);
		m = !n || !m !=(m && !n);
		n = true || m && !(false &&n);
		System.out.println(m); // true
		System.out.println(n); // true
	}
	
	*/
	
	/* h)
	
	public static void main(String[] args){
		int e, f;
		e = -(12 + 4/3*5);
		f = -(12 + 4 / (3 + 5));
		System.out.println(e); // -17
		System.out.println(f); // -12
		e = e + 10*4 - 3/2;
		f = (e+10)*(4-3)/2;
		System.out.println(e); // 22
		System.out.println(f); // 16
	}
	
	*/
	
	/* i)
	
	public static void main(String[] args){
		boolean m, n;
		int a, b;
		a = 12 + 7/3;
		b = 13 - 7%3;
		System.out.println(a); // 14
		System.out.println(b); // 12
		m = a-b < b-a;
		n = a+2 > b-2;
		System.out.println(m); // false
		System.out.println(n); // true
		m = a+b != 25+4%3;
		n = (a<4 || b<19) && !m;
		System.out.println(m); // false
		System.out.println(n); // true
	}
	
	*/
	
	/* j)
	
	public static void main(String[] args){
		char c = 'a';
		int a = 12;
		boolean res;
		res = c != 'c' && 'b'>=c;
		System.out.println(res); // true
		res = res == !true || a%5 >= a%4;
		System.out.println(res); // true
	}
	
	*/
	
	/* k)
	
	public static void main(String[] args){
		char cart, car2, car3;
		boolean bu;
		cart = 'b';
		car2 = '3';
		car3 = 'F';
		bu = (cart>2) && (car3 != cart);
		System.out.println(bu); // true
		bu = bu && !(car3 <= car2);
		System.out.println(bu); // true
	}
	
	*/
	
	/* Problema 11 
		Los programas que se dan a continuación contienen errores que el compilador es capaz de detectar. 
		Averigua de qué errores se tratan: 
		
		a)
	
	public static void main (String[] args){
		int i;
		double d;
		char c;
		d = 12.0;
		i = 10 + d; // Type mismatch: cannot convert from double to int
		c = i; // Type mismatch: cannot convert from int to char
		System.out.println(c);
	}
	
	*/
	
	/* b)
	
	public static void main (String[] args){
		char c;
		boolean b;
		c = 'a';
		c = c + 1; // Type mismatch: cannot convert from int to char
		b = !c > 'b'; // The operator ! is undefined for the argument type(s) char
		System.out.println(c);
		System.out.println(b);
	}
	
	*/
	
	/* c)
	
	public static void main (String[] args){
		int i;
		char c;
		boolean b;
		c = 'a';
		b = !(c>'b');
		b = b && (i>20); // The local variable i may not have been initialized
		System.out.println(b);
	}
	
	*/
	
	/* d)
	
	public static void main (String[] args){
		int primer, segon, tercer;
		Primer = 1; // Primer cannot be resolved to a variable
		Segon = Primer + 1; // Segon cannot be resolved to a variable
		Tercer = Primer + Segon; // Tercer cannot be resolved to a variable
		System.out.println(tercer);
	}
	
	*/
	
	/* e)
	
	public static void main (String[] args){
		Scanner reader =  new Scanner(System.in);
		double num1, num2;
		int num3;
		num1 = reader.nextDouble();
		num2 = reader.nextDouble();
		num3 = reader.nextDouble(); // Type mismatch: cannot convert from double to int
		num1 = num1 + num2 + 1.0;
		num3 = num3 + 12;
		System.out.println(num1);
		System.out.println(num3);
	}
	
	*/
	
	/* Problema 12 
		Cuando el programa sea ejecutado, ¿cuáles serán los valores finales de las variables i1, i2, d1, 
		d2, b1 y b2? (¿que escribirá el programa?) 
	
	public static void main (String[] args){
		int i1, i2;
		double d1, d2;
		char c1, c2;
		boolean b1, b2;
		i1 = 1 - 2 + 23 / 4 % 3 * 3;
		i2 = 2 * 7 % 5 / 8 + 1 * 3;
		d1 = 3.0 + 2.5 + 5.0 / 2.0;
		d2 = i1/2 + 12/2.0 + 1; // Mezcla enteros y reales
		c1 = 'A';
		c2 = 'Z';
		b1 = c1 == c2 || c1 > 'T' && c2 <= 'K';
		b2 = false || true && false != false && true;
		
		System.out.println(i1); // 5
		System.out.println(i2); // 3
		System.out.println(d1); // 8.0
		System.out.println(d2); // 9.0
		System.out.println(b1); // false
		System.out.println(b2); // false
	}
	
	*/
	
	/* Problema 13 
		Cuando el programa siguiente sea ejecutado, ¿cuáles serán los valores finales de las variables 
		prEnt, sgEnt, prDoub, sgDoub, prBoo y sgBoo? (¿qué escribirá el programa?) 
	
	public static void main (String[] args){
		int prEnt, sgEnt;
		double prDoub, sgDoub;
		boolean prBool, sgBool;
		char ch;
		prEnt = 17;
		sgEnt = prEnt % 9 / 3;
		prEnt = sgEnt + sgEnt * prEnt / 3;
		prDoub = 24 / 6 * 2 + 1;
		sgDoub = (prDoub - 1.0) / 16;
		ch = 'A';
		prBool = ch != 'A' == ch < 'Z';
		sgBool = (prBool && true) || (prBool == true || !prBool);
		
		System.out.println(prEnt); // 13
		System.out.println(sgEnt); // 2
		System.out.println(prDoub); // 9.0
		System.out.println(sgDoub); // 0.5
		System.out.println(prBool); // false
		System.out.println(sgBool); // true
	}
	
	*/
	
	/* Problema 14
		¿Cuáles serán los valores de las variables i, j, d, b1 y b2 al final de la ejecución del anterior programa? 
		(¿qué escribirá el programa al ser ejecutado?)
	
	public static void main (String[] args){
		int i, j;
		char c;
		double d;
		boolean b1, b2;
		i = 10 + 3 / 2;
		j = i % 2 * 4;
		c = 'a';
		d = 10.0 / j - 1;
		b1 = c < 'c' && i<j != true;
		b2 = !b1 || false || !true || b1 == false;
		
		System.out.println("i=" + i); // i=11
		System.out.println("j=" + j); // j=4
		System.out.println("d=" + d); // d=1.5
		System.out.println("c=" + c); // c=a
		System.out.println("b1=" + b1); // b1=true
		System.out.println("b2=" + b2); // b2=false
	}
	
	*/
		
}
