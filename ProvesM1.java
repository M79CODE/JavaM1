package proves;
import java.util.Scanner;
// ¡¡¡Cuando introducimos decimales que van a ser leídos por Scanner deberemos introducirlos usando (,) en vez de (.) (Ejemplo: 12,3)!!!
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProvesM1 {
	//Introducción Programación Java
	
	/* Problema 1
	   Define 4 variables con estos nombres: Nombre, Apellidos, teléfono y precio. 
	   var nombre, apellidos : TEXTO 
	   var telefono : ENTERO 
	   var precio: REAL
	
	public static void main(String[] args) {
		String nombre;
		String apellidos;
		int telefono;
		double precio;
	} 
	
	*/
		
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
	
	
	// PROCEDIMIENTOS Y FUNCIONES
	
	/* Problema 1 
		Respecto los programas Proc1 y Proc2, que se dan a continuación, responded a las cuestiones siguientes:
		
		a) ¿Cuál es el propósito de la función dbl de Proc1 (qué calcula)? 
		>> Calcula el doble del parámetro de entrada 
		
		b) ¿Cuál es el propósito de la función sumpl de Proc2? 
		>> Devuelve la suma de los parámetros de entrada más 1. 
		
		c) En el programa Proc1 se llama a la función dbl utilizando los parámetros a y b en dos ocasiones. Pero si se observa la definición de la función 
			dbl vemos que el parámetro se llama x. ¿Tiene alguna importancia esta discrepancia? 
		>> Ninguna, a y b son variables del programa principal. Y x es una variable formal de la declaración de la función. 
		
		d) En el programa Proc2 se hace una invocación de la función sumpl con parámetros b y a (en este orden), pero si observamos la definición de la 
			función vemos que los parámetros son a y b (en este orden). ¿Esta discrepancia (a y b en un lugar y b y a en el otro) tiene alguna importancia? 
		>> Ninguna importancia, las variables se sustituyen según su orden en la declaración de la función. 
		
		e) El programa Proc1, ¿qué resultado escribe si se le da el valor 4? ¿Y si se le da el valor -8? ¿Qué hace Proc1? 
		>> Para 4  b=16, Para -8  b=-32 
		>> Proc1 multiplica el número introducido por 4. 
		
		f) El programa Proc2, ¿qué resultado produce si se le dan los valores 9 y 7? 
		>> Valor de a=17 
		>> Valor de b=7
	*/
	
	/* Proc1
	
	public static void main (String[] args){
		Scanner reader = new Scanner (System.in);
		int a, b;
		System.out.println("Introduce a: "); // 3
		a =  reader.nextInt();
		b = dbl(a); // 6
		b = dbl(b); // 12
		System.out.println("El valor de b es " + b); // "El valor de b es 12"
	}
	
	private static int dbl (int x) {
		int res;
		res = 2 * x;
		return(res);
	}
	
	*/
	
	/* Proc2
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce a: "); // 3
		a = reader.nextInt();
		System.out.println("Introduce b: "); // 4
		b = reader.nextInt();
		a = sumpl (b,a);
		System.out.println("Valor de a=" + a); // "Valor de a=8"
		System.out.println("Valor de b=" + b); //"Valor de b=4"
	}
	
	private static int sumpl(int a, int b) {
		a = a + b; // 3+4=7
		return(a+1); // (7+1)=8
	}
	
	*/
	
	/* Problema 2 
		Respecto los programas Proc3 y Proc4, responded las cuestiones siguientes:
		
		a) Cualquier función booleana, se puede entender como un procedimiento que responde una pregunta sobre sus parámetros. ¿Qué pregunta responde 
		la función ord del programa Proc3? 
		>> Devuelve true si el parámetro formal pr es mayor o igual que el parámetro formal sg 
		
		b) ¿Qué pregunta responde la función par de proc4? 
		>> Devuelve true si el parámetro formal n es par 
		
		c) ¿Qué pregunta responde la función mpar de proc4? 
		>> Devuelve true si ambos parámetros de entrada son pares o impares a la vez. Devuelve false si un parámetro es par y el otro impar. 
		
		d) El programa Proc3, ¿qué resultado escribe si se le da los valores 10 y 11? Y si se le da los valores 11 y 10? 
		>> Valor de a es 10 
		>> Valor de b es 11
		>> Valor de b es 10 
		>> Valor de a es 11
		
		e) ¿Que hace Proc3? 
		>> Ordena de menor a mayor los valores entrados por teclado 
		
		f) El programa Proc4, ¿qué resultado escribe si se le da los valores 7 y 12? Y si se le da los valores 19 y 13? 
		>> 7 y 12 > NO 
		>> 19 y 13 > SI 
		
		g) ¿Qué hace el programa Proc4 (cuándo escribe "SI", cuándo escribe "NO")? 
		>> Escribe SI cuando los números entrados son pares o impares ambos a la vez. Escribe NO si un número es par y el otro impar. 
	*/
	
	/* Proc3
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		int a, b;
		System.out.print("Introduce a: ");
		a = reader.nextInt();
		System.out.print("Introduce b: ");
		b = reader.nextInt();
		
		if(ord(a,b)) {
			System.out.println("Valor de a es " + a);
			System.out.println("Valor de b es " + b);
		} else {
			System.out.println("Valor de b es " + b);
			System.out.println("Valor de a es " + a);
		}
	}
	
	private static boolean ord(int pr, int sg) {
		boolean ok;
		ok = pr <= sg;
		return(ok);
	}
	
	*/
	
	/* Proc4
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		int a, b;
		System.out.print("Introduce a: ");
		a = reader.nextInt();
		System.out.print("Introduce b: ");
		b = reader.nextInt();
		
		if(mpar(a,b)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
	
	private static boolean par(int n) {
		return(n%2 == 0);
	}
	
	private static boolean mpar(int x, int y) {
		boolean parX, parY;
		parX = par(x);
		parY = par(y);
		return(parX == parY);
	}
	
	*/
	
	/* Problema 3 
		Escribe un programa que obtenga (lea) tres números reales (a, b y c) y calcule la suma de sus valores absolutos. Por ejemplo, si los números 
		leídos son 12.1, -4.0 y -3.2 el resultado sería 19.3. 
		NOTA: Utilizad, obligatoriamente, la función: private static double valab (double x) que calcula el valor absoluto de su parámetro. 
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		double a, b, c;
		// ¡¡¡Cuando introducimos decimales que van a ser leídos por Scanner deberemos introducirlos usando (,) en vez de (.) (Ejemplo: 12,3)!!!
		System.out.print("Introduzca número 1: "); // 12,1
		a = reader.nextDouble();
		System.out.print("Introduzca número 2: "); // -4,0
		b = reader.nextDouble();
		System.out.print("Introduzca número 3: "); // -3,2
		c = reader.nextDouble();
		System.out.println("Suma de valores absolutos: " + (valab(a) + valab(b) + valab(c))); // 19.3
	}
	
	public static double valab(double x) {
		return(Math.abs(x));
	}
	
	*/
	
	/* Problema 4
	 	Igual que el anterior pero que calcule el valor absoluto de la suma (cuidado no es lo mismo el valor absoluto de la suma, que la suma de los 
	 	valores absolutos) 
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		double a, b, c;
		// ¡¡¡Cuando introducimos decimales que van a ser leídos por Scanner deberemos introducirlos usando (,) en vez de (.) (Ejemplo: 12,3)!!!
		System.out.print("Introduzca número 1: "); // 12,1
		a = reader.nextDouble();
		System.out.print("Introduzca número 2: "); // -4,0
		b = reader.nextDouble();
		System.out.print("Introduzca número 3: "); // -3,2
		c = reader.nextDouble();
		System.out.println("Suma absoluta: " + valab(a, b, c)); // 19.3
	}
	
	public static double valab(double x, double y, double z) {
		return(Math.abs(x+y+z));
	}
	
	*/
	
	/* Problema 5
	 	Escribe una función con la siguiente cabecera: 
		>> private static double maxi (double a, double b, double c) << 
		Y que devuelva el máximo de tres parámetros dados. 
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		double a, b, c;
		// ¡¡¡Cuando introducimos decimales que van a ser leídos por Scanner deberemos introducirlos usando (,) en vez de (.) (Ejemplo: 12,3)!!!
		System.out.print("Introduzca número 1: "); // 12,1
		a = reader.nextDouble();
		System.out.print("Introduzca número 2: "); // -4,0
		b = reader.nextDouble();
		System.out.print("Introduzca número 3: "); // -3,2
		c = reader.nextDouble();
		System.out.println("El máximo de los 3 números es: " + maxi(a, b, c)); // 19.3
	}
	
	public static double maxi(double x, double y, double z) {
		return(Math.max(x, Math.max(y, z)));
	}
	
	*/
	
	/* Problema 6
	 	Escribe una función con la siguiente cabecera: 
		>> private static boolean quad (int x, int y) << 
		Y que responda a la pregunta de si x es el cuadrado de y (x=y2)
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el cuadrado a comprobar: ");
		int a = reader.nextInt();
		System.out.print("Introduzca el número a comprobar: ");
		int b = reader.nextInt();
		
		if(quad(a, b)) {
			System.out.println(a + " es el cuadrado de " + b);
		} else {
			System.out.println(a + " no es el cuadrado de " + b + ", el cuadrado de " + b + " es " + powerY(b));
		}
	}
	
	public static boolean quad(int x, int y) {
		return(x == Math.pow(y, 2));
	}
	
	public static int powerY(int y) {
		return(y = (int)Math.pow(y, 2));
	}
	
	*/
	
	/* Problema 7 
		Escribe una función de resultado boolean que reciba un parámetro entero (int) y que responda a la pregunta de si el parámetro es un 
		nombre par (el resultado ha de ser true si el nombre dado es par y false si es impar). Decidid cual ha de ser la cabecera de esta función. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el número para comprobar si es par: ");
		int a = reader.nextInt();
		
		if(esPar(a)) {
			System.out.println(a + " es par");
		} else {
			System.out.println(a + " no es par");
		}	
	}
	
	public static boolean esPar(int x) {
		return(x%2 == 0);
	}
	
	*/
	
	/* Problema 8 
		Escribe un programa que lea 3 números enteros (int) y que de como resultado la suma de los que son pares. Por ejemplo, si los números son 
		15, 16 y 14 el resultado tendría que ser 30 (la suma de 16 y 14), mientras que si los números dados son 22, 15 y 19 el resultado tendría 
		que ser 22. Este programa ha de utilizar, obligatoriamente, la función escrita en el ejercicio anterior.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el número 1: ");
		int a = reader.nextInt();
		System.out.print("Introduzca el número 2: ");
		int b = reader.nextInt();
		System.out.print("Introduzca el número 3: ");
		int c = reader.nextInt();
		int suma = 0;
		
		if(esPar(a)) suma = suma+a;
		if(esPar(b)) suma = suma+b;
		if(esPar(c)) suma = suma+c;
		System.out.println("La suma de los números pares es " + suma);
		if(!esPar(a) && !esPar(b) && !esPar(c)) System.out.println("Ninguno de los números introducidos era par");
	}
	
	public static boolean esPar(int x) {
		return(x%2 == 0);
	}
	
	*/
	
	/* Problema 9 
		Se quiere escribir un programa que dados tres números enteros calcule la suma de los que acaban en 4 o 7. 
		Una posibilidad para resolver este problema es: 
		a) Escribe una función que dado un número entero devuelva su último dígito (el de las unidades) 
		b) Escribe una función que dado un número entero indique si este finaliza con 4 o 7. Se debe utilizar la 
		función anterior. 
		c) Escribe el programa que se pide utilizando la función del apartado anterior. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el número 1: ");
		int a = reader.nextInt();
		System.out.print("Introduzca el número 2: ");
		int b = reader.nextInt();
		System.out.print("Introduzca el número 3: ");
		int c = reader.nextInt();
		int suma = 0;
		
		if(es4o7(a)) suma = suma+a;
		if(es4o7(b)) suma = suma+b;
		if(es4o7(c)) suma = suma+c;
		System.out.println("La suma de los números acabados en 4 o 7 es " + suma);
		if(!es4o7(a) && !es4o7(b) && !es4o7(c)) System.out.println("Ninguno de los números introducidos acababa en 4 o 7");
	}
	
	public static int uDigit(int x) {
		return(x%10);
	}
	
	public static boolean es4o7(int x) {
		return(uDigit(x) == 4 || uDigit(x) == 7);
	}
	
	*/
	
	/* Problema 10 
		Se quiere escribir un programa que sea capaz de escribir la tabla de multiplicar de un número dado. 
		Por ejemplo, si a este programa se le da el número 7 escribirá: 
		7 x 0 = 0 
		7 x 1 = 7 
		7 x 2 = 14
		... 
		7 x 10 = 70 
		Una manera de resolver este problema es escribiendo primero un procedimiento que sea capaz de escribir en la pantalla una línea de 
		cualquier tabla de multiplicar. 
		Este procedimiento tiene la siguiente cabecera: 
		>> private static void lineaTabla(int tabla, int fila) << 
		Con parámetros 7 y 3 este procedimiento escribiría la línea correspondiente a 7 x 3 (tabla del 7), mientras que con parámetros 8 y 5 
		escribirá la línea correspondiente a 8 x 5 (tabla del cinco).
		Escribid: 
		a) El procedimiento lineaTabla 
		b) El programa que resuelve el problema planteado utilizando el procedimiento lineaTabla
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el número del que quiere mostrar la tabla de multiplicar: ");
		int tabla = reader.nextInt();
		
		for(int j=0; j<=10; j++) {
			lineaTabla(tabla, j);
		}
		
		System.out.print("\n" + "Introduzca el primer número que quiere multiplicar: ");
		int num1 = reader.nextInt();
		System.out.print("Introduzca el segundo número que quiere multiplicar: ");
		int num2 = reader.nextInt();
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
	}
	
	public static void lineaTabla(int tabla, int fila) {
		System.out.println(tabla + "x" + fila + "=" + (tabla*fila));
	}
	
	*/
	
	/* Problema 11 
		Escribe una función que reciba como parámetro un número entero positivo (int) y que calcule la suma de todos los números entre 1 y el 
		número dado. Por ejemplo, cuando el parámetro sea 7 el valor devuelto por la función tendría que ser la suma 1+2+3+4+5+6+7 (o sea 28). 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el número para calcular la suma de todos los números desde 1 hasta el número elegido: ");
		int num = reader.nextInt();
		System.out.println("\n"+"La suma total es " + calcSuma(num));
	}
	
	public static int calcSuma(int num) {
		int suma = 0;
		
		for(int i=1; i<=num; i++) {
			suma = suma + i;
			System.out.print(i);
			if(i<num) {
				System.out.print("+");
			}
		}
		
		System.out.print("=" + suma);
		return suma;
	}
	
	*/
	
	/* Problema 12 
		Escribe un programa que lea un número n (n>=1) y que escriba la tabla de las sumas entre 1 y todos los números menores o iguales que n. 
		Por ejemplo, si el número dado fuera 6, el resultado tendría que ser: 
		La suma de 1 a 1 es 1 
		La suma de 1 a 2 es 3 
		La suma de 1 a 3 es 6 
		La suma de 1 a 4 es 10 
		La suma de 1 a 5 es 15 
		La suma de 1 a 6 es 21 
		Para resolver este problema escribe un procedimiento que haciendo uso de la función del ejercicio anterior escriba una única línea de la 
		tabla.
		
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca el número para calcular la suma de todos los números desde 1 hasta el número elegido: ");
		int num = reader.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println("\n"+"La suma de 1 a " + i + " es: " + calcSuma(i));
		}
	}
	
	public static int calcSuma(int num) {
		int suma = 0;
		
		for(int i=1; i<=num; i++) {
			suma = suma + i;
			System.out.print(i);
			if(i<num) {
				System.out.print("+");
			}
		}
		
		System.out.print("=" + suma);
		return suma;
	}
	
	*/
	
	/* Problema 13 
		Dado el siguiente programa, responde a las preguntas: 
		
		a) ¿Que hace la función dg? Si no se ve claro probad de encontrar la respuesta intentando determinar qué resultado produce para cada una 
		de las siguientes parejas de números: 6574 y 0; 6574 y 1; 6574 y 2; 6574 y 3. 
		>> 6574 y 0: 4 
		>> 6574 y 1: 7 
		>> 6574 y 2: 5
		>> 6574 y 3: 6 
		>> La función dg asigna los valores de d0, d1, d2 y d3 según la posición de los dígitos en el número introducido, siendo d0 el dígito en la 
		última posición y d4 el dígito en primera posición.
		
		b) ¿Cómo responde el programa si le da el número 789? ¿Y si se le da el número 78? ¿Y si el número es 12547? 
		>> 789 > número no aceptable
		>> 78 > número no aceptable
		>> 12547 > número no aceptable
		
		c) ¿Qué determina el programa del número que se le da? 
		>> Si el número introducido es capicúa, siendo éste mayor de 999 y menor de 10000.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = reader.nextInt();
		int d0, d1, d2, d3;
		
		if(numero<1000 || numero>9999) {
			System.out.println("número no aceptable");
		} else {
			d0 = dg(numero, 0);
			d1 = dg(numero, 1);
			d2 = dg(numero, 2);
			d3 = dg(numero, 3);
			if(d0 == d3 && d1 == d2) {
				System.out.println(numero + " SI es capicúa");
			} else {
				System.out.println(numero + " NO es capicúa");
			}
		}
	}
	
	private static int pot(int a, int b) {
		int res = 1;
		int veces = 0;
		while(veces<b) {
			res = res * a;
			veces++;
		}
		return(res);
	}
	
	private static int dg(int num, int dig) {
		num = num / pot(10, dig);
		return(num%10);
	}
	
	*/
	
	/* Problema 14 
		Utilizando la función pot del ejercicio anterior escribe un programa que escriba la tabla de las 5 primeras potencias de un número dado 
		(que el programa leerá). Por ejemplo, si el número dado es 3 el resultado será: 
		3 elevado a 1 es 3 
		3 elevado a 2 es 9 
		3 elevado a 3 es 27 
		3 elevado a 4 es 81 
		3 elevado a 5 es 243
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num = reader.nextInt();
		
		for(int i=1; i<=5; i++) {
			System.out.println(num + " elevado a " + i + " es igual a " + pot(num, i));
		}
	}
	
	private static int pot(int a, int b) {
		int res = 1;
		int veces = 0;
		while(veces<b) {
			res = res * a;
			veces++;
		}
		return(res);
	}
	
	*/
	
	/* Problema 15 
		Escribe una función de cabecera: 
		>> private static int unidadMillar(int x) << 
		Y que devuelva el dígito correspondiente a las unidades de millar del parámetro. 
		Por ejemplo, si el valor del parámetro es 7657 el resultado ha de ser 7, si el valor del parámetro es 78954 el resultado ha de ser 8. 
		Si el valor del parámetro es inferior a 1000 el resultado será siempre 0. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num = reader.nextInt();
		System.out.print("La unidad de millar de " + num + " es " + unidadMillar(num));
		
		if(num<1000) System.out.print(" ya que " + num + " es inferior a 1000");
	}
	
	private static int unidadMillar(int x) {
		return((x/1000)%10);
	}
	
	*/
	
	/* Problema 16 
		Respecto el siguiente programa, indica que hace:
		>> Te obliga a introducir por fuerza 2 números: primero un número par y después un número impar.
	
	public static void main(String[] args) {
		int a, b;
		a = insistir(true);
		b = insistir(false);
		System.out.println("Número par: " + a);
		System.out.println("Número impar: " + b);
	}
	
	private static int insistir(boolean par) {
		Scanner reader = new Scanner(System.in);
		int num, residu;
		
		if(par == true) {
			residu = 0;
		} else {
			residu = 1;
		}
		
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		while(num%2 != residu) {
			System.out.println("¡No, éste número no!");
			System.out.println("Prueba con otro número: ");
			num = reader.nextInt();
		}
		return(num);
	}
	
	*/
	
	/* Problema 17 
		El programa que se da a continuación, dibuja con asteriscos (*) el perímetro de un cuadrado.
		
		a) Observa el procedimiento esc y cómo éste es utilizado para resolver el problema.
		Imprime el carácter “que” por pantalla, un número de veces “cuanto”. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int dim, veces;
		System.out.println("Introduzca la dimensión: ");
		dim = reader.nextInt();
		
		if(dim<2 || dim>19) {
			System.out.println("Dimensión incorrecta");
		} else {
			esc('*', dim);
			salta();
			veces = 0;
			while(veces < dim-2) {
				esc('*', 1);
				esc(' ', dim-2);
				esc('*', 1);
				salta();
				veces = veces + 1;
			}
			esc('*', dim);
		}
	}
	
	private static void esc(char que, int cuanto) {
		int i = 0;
		while(i < cuanto) {
			System.out.print(que);
			i = i + 1;
		}
	}
	
	private static void salta() {
		System.out.println();
	}
	
	*/
	
	/* b) Utilizando los procedimientos esc y salta, escribe un programa que escriba el perímetro de un triángulo de asteriscos de altura n. 
		Por ejemplo, si n=5 el resultado tendría que ser: 
		*
		* * 
		*   * 
		*     * 
		* * * * *
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int dim, veces;
		System.out.println("Introduzca la dimensión: ");
		dim = reader.nextInt();
		
		if(dim<2 || dim>19) {
			System.out.println("Dimensión incorrecta");
		} else {
			esc('*', 1);
			salta();
			veces = 0;
			while(veces < dim - 2) {
				esc('*', 1);
				esc(' ', veces);
				esc('*', 1);
				salta();
				veces = veces + 1;
			}
			esc('*', dim);
		}
	}
	
	private static void esc(char que, int cuanto) {
		int i = 0;
		while(i < cuanto) {
			System.out.print(que);
			i = i + 1;
		}
	}
	
	private static void salta() {
		System.out.println();
	}
	
	*/
	
	/* Problema 18 
		Sea el siguiente programa: 
		
		a) ¿Que calcula la función fun? 
		>> Calcula 10 elevado a la n, que es el parámetro de entrada 
		
		b) ¿Cuál será el valor de la variable suma de main al finalizar la ejecución? 
		>> Será de 1111 = 1 + 10 + 100 + 1000 
		
		c) Supongamos que la iteración que hay en fun se volviera a escribir de la siguiente manera: 
		while (vol <= n) { 
		total = total * 10; 
		vol ++; 
		} 
		¿Con que valor se tendría que inicializar la variable local vol para que la función fun continuara calculando lo mismo (dando el mismo 
		resultado que daba antes del cambio)? 
		>> En lugar de inicializarse a 0, bastaría inicializarla a 1, para así de esta forma igualar el número de
		iteraciones que realiza el bucle 
	
	public static void main(String[] args) {
		int vf=0, suma=0;
		
		while(vf < 4) {
			suma =  suma + fun(vf);
			vf++;
		}
		System.out.println(suma);
	}
	
	private static int fun(int n) {
		int total=1, vol=0;
		
		while(vol<n) {
			total = total * 10;
			vol++;
		}
		return(total);
	}
	
	*/
	
	/* Problema 19
	
	public static void main(String[] args) {
		int base;
		boolean bu;
		base = itchy(false);
		base = base + itchy(scratchy(-15));
		bu = scratchy(base);
		bu = bu || scratchy(base - itchy(bu));
		
		System.out.println(base);
		System.out.println(bu);
	}
	
	private static int itchy(boolean b) {
		int base = 2;
		if(b) return(base);
		else return(base+1);
	}
	
	private static Boolean scratchy(int i) {
		return(i >= 0);
	}
	
	*/
	
	/* a) Volver a escribir la función itchy de manera que haga lo mismo que la original pero sin utilizar ninguna variable local.
	
	public static void main(String[] args) {
		int base;
		boolean bu;
		base = itchy(false);
		base = base + itchy(scratchy(-15));
		bu = scratchy(base);
		bu = bu || scratchy(base - itchy(bu));
		
		System.out.println(base);
		System.out.println(bu);
	}
	
	private static int itchy(boolean b) {
		if(b) return(2);
		else return(3);
	}
	
	private static Boolean scratchy(int i) {
		return(i >= 0);
	}
	
	*/
	
	/* b) Volver a escribir la función scratchy de manera que su cuerpo esté basado en una estructura alternativa (if-else).
	
	public static void main(String[] args) {
		int base;
		boolean bu;
		base = itchy(false);
		base = base + itchy(scratchy(-15));
		bu = scratchy(base);
		bu = bu || scratchy(base - itchy(bu));
		
		System.out.println("base = " + base);
		System.out.println("bu = " + bu);
	}
	
	private static int itchy(boolean b) {
		if(b) return(2);
		else return(3);
	}
	
	private static Boolean scratchy(int i) {
		if(i >= 0) return(true);
		else return(false);
	}
	
	*/
	
	/* c) Al finalizar la ejecución del programa, ¿Cuáles serán los valores de las variables base y bu de main? (¿Qué escribirá el programa?) 
		>> base = 6 
		>> bu = true
	*/
	
	/* Problema 20 
		Se quiere escribir un programa que dado un número entero calcule la suma de sus dígitos. Por ejemplo, si se le suministra el numero 5258 
		el valor que escribirá será 20 (5+2+5+8=20) y si se le suministra el número 1203 el valor que escribirá será 6 (1+2+0+3 = 6). 
		Para resolver este problema, nos suministran los siguientes procedimientos que tendremos que codificar: 
		
		>> private static int numDigitos(int numero) << 
		Este procedimiento calcula el número de dígitos del número suministrado como parámetro. Por ejemplo, cuando es invocado con el valor 45877 
		devuelve el valor 5 (45877 tiene 5 dígitos) y cuando es invocado con el valor 789 devuelve el valor 3 (789 tiene 3 dígitos). 
		
		>> private static int digito(int numero, int queDigito) << 
		Este procedimiento devuelve el dígito de número (el primer parámetro) que indica queDigito (el segundo parámetro). Por ejemplo, la 
		invocación digito(4587, 1) devuelve el valor 8 (8 es el digito de les decenas de 4587) y la invocación digito(45712, 0) devuelve el valor 2 
		(2 es el digito de las unidades de 45712).
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = reader.nextInt();
		int suma = 0;
		
		for(int i=0; i<numDigitos(num); i++) {
			suma = suma + digito(num, i);
			System.out.print(digito(num, i));
			if(i<numDigitos(num)-1) {
				System.out.print("+");
			} 
			else if(i==numDigitos(num)-1) {
				System.out.print("=" + suma);
			}
		}
		System.out.println("\n" + "La suma de los dígitos del número " + num + " es " + suma);
	}
	
	private static int numDigitos(int numero) {
		int dig = 1;
		while(numero>10) {
			numero = numero/10;
			dig++;
		}
		return(dig);
	}
	
	private static int digito(int numero, int queDigito) {
		for(int i=0; i<queDigito; i++) {
			numero = numero/10;
		}
		return(numero%10);
	}
	
	*/
	
	/* Problema 21 
		Cuando el programa sea ejecutado, ¿cuáles serán los valores finales de las variables a, b y bool (que escribirá el programa)? 
	
	public static void main(String[] args) {
		int a, b;
		boolean bool;
		a = 3;
		bool = conf(4, a);
		b = usion(a, conf(a, 1));
		a = usion(b, bool);
		b = usion(a, conf(b, a));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(bool);
	}
	
	private static boolean conf(int a, int b) {
		return(a*b >a+2*b);
	}
	
	private static int usion(int a, boolean b) {
		if(b) return(2*a);
		else return(a/2);
	}
	// Outputs:
	// >> 2
	// >> 1
	// >> true
	
	*/
	
	/* Problema 22 
		Escribe un programa que dibuje un cuadrado de n x n con asteriscos, excepto en las posiciones de la diagonal donde en lugar de asterisco 
		habrá el número de la fila. El valor n se obtendrá del exterior. 
		Resultado del programa para n=6: 
		1*****
		*2****
		**3***
		***4**
		****5*
		*****6
		Para simplificar la resolución del problema, se proporciona un par de procedimientos que se han de utilizar (obligatoriamente) y que se 
		deben de codificar. Las cabeceras de estos procedimientos son: 
		>> private static void escribeAsteriscos(int cuantos) << 
		>> private static void salta () <<
		El primer procedimiento escribe cuántos asteriscos consecutivos (sin hacer ningún salto de línea). 
		El segundo procedimiento, hace un salto de línea, sin escribir nada más. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un número de filas: ");
		int num = reader.nextInt();
		
		for(int i=0; i<num; i++) {
			escribeAsteriscos(i);
			System.out.print((i+1) + " ");
			escribeAsteriscos(num-1-i);
			salta();
		}
	}
	
	private static void escribeAsteriscos(int cuantos) {
		for(int i=0; i<cuantos; i++) {
			System.out.print("* ");
		}
	}
	
	private static void salta() {
		System.out.println("");
	}
	
	*/
	
	/* Problema 23 
		Se dice que dos números enteros positivos, p y q, son amigos si la suma de los divisores propios de p es igual a q, y la suma de los 
		divisores propios de q es igual a p. 
		Por ejemplo, los números 220 y 284 son amigos ya que: 
		• Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110. Resulta que: 
		1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 
		• Los divisores propios de 284 son 1, 2, 4, 71, 142 y resulta que: 
		1 + 2 + 4 + 71 + 142 = 220 
		>> Nota: Los divisores propios de un número son aquellos que lo dividen, excepto el mismo. 
		
	Se quiere construir un programa que dados dos números enteros positivos (aspecto que si hará falta verificar), determina si estos son 
	amigos o no. Para resolver el problema lo trocearemos en problemas más pequeños: 
	
	>> Divisibilidad: Escribe una función que dados dos números enteros indique si el primero es divisible por el segundo: 
	
	private static boolean esDivisor (int num, int candidatoADivisor) {
		private static boolean esDivisor(int num, int candidatoADivisor){
			return(num%candidatoADivisor == 0);
		}
	}
	
	>> Suma de divisores propios: Escribe una función SumaDivisores que dado un número entero positivo calcule la suma de los divisores 
	propios. Haz uso de la función anterior para determinar la divisibilidad. Decidid cual ha de ser la cabecera de la función.
	
	private static int sumaDivisores(int num){
		int suma = 0;
		
		for(int i=1; i<num; i++){
			if(esDivisor(num, i)){
				suma =  suma + i;
			}
		}
		return suma;
	}
	 
	>> Amistad: Escribe una función que dados dos números enteros determine si estos son amigos o no (responda a la pregunta ¿los números 
	dados como parámetros son amigos?). Decidid cual ha de ser la cabecera de la función.
	
	private static void sonAmigos(int num1, int num2){
		if(num1 == sumaDivisores(num2) && num2 == sumaDivisores(num1)){
			System.out.println(num1 + " y " + num2 + " son amigos.");
		} else {
			System.out.println(num1 + " y " + num2 + " no son amigos.");
		}
	}
	
	>> Garantizar que los números son positivos: Escribe un procedimiento especializado en lectura para leer un número entero positivo y 
	garantizar que lo es. Mientras el número que se le da no sea positivo (superior a cero) el procedimiento insistirá. 
	
	private static int insistirPositivo () { 
		// insiste hasta que el numero introducido sea positivo diferente de 0 
		Scanner reader = new Scanner(System.in);
		int num;
		
		do{
			System.out.print("Introduce un número > 0: ");
			num = reader.nextInt();
		} while(num<=0);
		return num;
	}
	
	>> Programa en ejecución. Gracias al procedimiento insistir y a la función que determina si dos 
	números son amigos, escribir el programa pedido ahora es una tarea muy sencilla. 
		
	public static void main(String[] args){
		int num1 = insistirPositivo();
		int num2 = insistirPositivo();
		sonAmigos(num1, num2);
	}
	
	private static boolean esDivisor (int num, int candidatoADivisor) {
		return(num%candidatoADivisor == 0);
	}
	
	private static int sumaDivisores(int num){
		int suma = 0;
		
		for(int i=1; i<num; i++){
			if(esDivisor(num, i)){
				suma =  suma + i;
			}
		}
		return suma;
	}
	
	private static void sonAmigos(int num1, int num2){
		if(num1 == sumaDivisores(num2) && num2 == sumaDivisores(num1)){
			System.out.println(num1 + " y " + num2 + " son amigos.");
		} else {
			System.out.println(num1 + " y " + num2 + " no son amigos.");
		}
	}
	
	private static int insistirPositivo () { 
		// insiste hasta que el número introducido sea positivo diferente de 0 
		Scanner reader = new Scanner(System.in);
		int num;
		
		do{
			System.out.print("Introduce un número > 0: ");
			num = reader.nextInt();
		} while(num<=0);
		return num;
	}
		
	*/
	
	/* Problema 24 
		Responde a las preguntas sobre el siguiente programa:
		
		La función esBueno responde a una pregunta sobre su parámetro. ¿Cuál es la pregunta? 
		>> ¿El parámetro es múltiple de 5? 
		
		La función esParejaAceptable, ¿cuándo produce el resultado false? 
		>> Cuando uno de los parámetros es bueno y el otro no, o lo que es lo mismo, cuando uno de los parámetros es múltiple de cinco y el otro 
		no lo es 
		
		¿Qué calcula la función llamada calcula? 
		>> La suma de los dos primeros parámetros si el tercero es false y la suma más 1 si el tercero es true 
		
		Cuando el programa se ejecute, ¿cuáles serán los valores finales de las variables a y b?  
		>> 
	
	public static void main(String[] args){
		int a, b;
		a = calcula(7, 8, esParejaAceptable(15, 70));
		b = calcula(a, a, esParejaAceptable(a, 75));
		b = calcula(b, a, esParejaAceptable(a, b));
		
		System.out.println("a es " + a);
		System.out.println("b es " + b);
	}
	
	private static boolean esBueno(int numero) {
		int darrerD = numero%10;
		return((darrerD == 0) || (darrerD == 5));
	}
	
	private static boolean esParejaAceptable(int a, int b) {
		boolean uno, otro;
		uno = esBueno(b);
		otro = esBueno(a);
		return((uno && otro) || (!uno && !otro));
	}
	
	private static int calcula(int b, int a, boolean aumentar) {
		a = a + b;
		
		if(aumentar) {
			b = 1;
		} else {
			b = 0;
		}
		return(a+b);
	}
	
	// Outputs:
	// a es 16
	// b es 49
	
	*/
	
	/* Problema 25 
		Escribe un programa que dibuje un cuadrado de n x n con las siguientes características: 
		- La diagonal estará hecha con el carácter o (o minúscula) 
		- Los elementos por debajo de la diagonal estarán hechos con el carácter *
		- Los elementos por encima de la diagonal estarán hechos con el carácter + 
		- El valor n vendrá del exterior y se tendrá que verificar que es mayor o igual a dos; si no fuera así el programa se limitaría a decir 
		  que el valor no es correcto. 
		
		A continuación se muestra el resultado que el programa tendría que proporcionar para n=4 y para n=6:
		
		o + + +                   o + + + + +
		* o + +                   * o + + + +
		* * o +                   * * o + + +
		* * * o                   * * * o + +
		                          * * * * o +
		                          * * * * * o
		
		Para simplificar la resolución del problema, se proporciona un procedimiento muy útil que se debe de utilizar obligatoriamente. La 
		cabecera de este procedimiento es: 
		
		>> private static void esc(char que, int cuantos, boolean salta) << 
		
		Este procedimiento escribe “cuantos” veces el carácter “que”. Si el tercer parámetro (salta) es true, además escribe un salto de línea.
	
	public static void main(String[] args) {
		int fila, n;
		Scanner reader = new Scanner(System.in);
		System.out.print("Indica el tamaño del cuadrado: ");
		n = reader.nextInt();
		
		while(n<2) {
			System.out.print("Indica el tamaño del cuadrado. Debe ser mínimo 2: ");
			n = reader.nextInt();
		}
		
		fila = 1;
		
		while(fila <= n) {
			esc('*', fila-1, false);
			esc('o', 1, false);
			esc('+', n-fila, true);
			fila++;
		}
	}
	
	public static void esc(char que, int cuantos, boolean salta) {
		for(int i=0; i<cuantos; i++) {
			System.out.print(que);
		}
		if(salta) {
			System.out.println("");
		} else {
			System.out.print("");
		}
	}
	
	*/
	
	/* Problema 26 
		Se quiere escribir un programa que calcule y escriba de forma 'bonita' las potencias n-esimas de los p primeros números naturales. 
		Por ejemplo, para n=3 y p=5 el programa escribe los cubos (potencia de 3) de los 5 primeros números naturales, de la siguiente manera: 
		1 elevado a 3 es: 1 
		2 elevado a 3 es: 8 
		3 elevado a 3 es: 27 
		4 elevado a 3 es: 64 
		5 elevado a 3 es: 125 
		Para n=5 y p=3 el programa escribe las potencias quintas de los 3 primeros números naturales, 
		de esta manera:
		1 elevado a 5 es: 1 
		2 elevado a 5 es: 32 
		3 elevado a 5 es: 243 
		
		Los valores de n (la potencia) y de p serán proporcionados por el usuario y tendrá que verificar: 
		• Para n, que se encuentra entre 0 y 10 (incluidos) 
		• Para p, que se encuentra entre 1 y 20 (incluidos) 
		Para resolver el problema lo trocearemos en problemas más pequeños: 
		
		>> Potencia: Escribe una función que dados dos números enteros calcule la potencia del primero elevado al segundo (base elevado al exponente)
	
	private static int potencia(int base, int exp) {
		int result, veces;
		result = 1;
		veces = 0;
		
		while(veces<exp) {
			result = result * base;
			veces++;
		}
		return(result);
	}
	
	*/
	
	/* >> Escribe 'bonita' una línea. Escribe un procedimiento especializado en escritura que dados dos enteros números r y s escriba en la pantalla 
	   la línea correspondiente a r elevado a s (r elevado a s es:...). Es obligatorio que este procedimiento haga uso de la función anterior.
	   Decidid cual ha de ser la cabecera del procedimiento: 
	
	private static void escribeLinea(int ba, int ex) {
		System.out.print(ba + " elevado a " + ex + " es: ");
		System.out.println(potencia(ba,ex));
	}
	
	*/
	
	/* >> Garantizar que los números dados son correctos. Escribe un procedimiento, función, especializada en lectura para leer un número entero y 
	   garantizar que se encuentra comprendido en los limites indicados [min, max]. Mientras el número que se le da esté fuera de los límites, el 
	   procedimiento insistirá.
	
	private static int leerConLimites(int min, int max) {
		int leido;
		Scanner reader = new Scanner(System.in);
		System.out.print("Escribe un número en el intervalo [" + min + ", " + max + "]: ");
		leido =  reader.nextInt();
		
		while(leido<min || leido>max) {
			System.out.print("Número incorrecto. Vuelve a intentarlo: ");
			leido = reader.nextInt();
		}
		return(leido);
	}
	
	*/
	
	/* >> Programa en ejecución. Gracias a los dos últimos procedimientos, escribir el programa pedido ahora es una tarea muy sencilla: 
	
	public static void main(String[] args) {
		int exponente, p, ahoraToca;
		System.out.println("Potencias enésimas de los primeros p números naturales: ");
		System.out.println("                    ");
		System.out.print("Introduce el exponente: ");
		exponente = leerConLimites(0, 10);
		System.out.print("Introduce el límite: ");
		p = leerConLimites(1, 20);
		ahoraToca = 1;
		
		while(ahoraToca <= p) {
			escribeLinea(ahoraToca, exponente);
			ahoraToca++;
		}
	}
	
	private static int potencia(int base, int exp) {
		int result, veces;
		result = 1;
		veces = 0;
		
		while(veces<exp) {
			result = result * base;
			veces++;
		}
		return(result);
	}
	
	private static void escribeLinea(int ba, int ex) {
		System.out.print(ba + " elevado a " + ex + " es: ");
		System.out.println(potencia(ba,ex));
	}
	
	private static int leerConLimites(int min, int max) {
		int leido;
		Scanner reader = new Scanner(System.in);
		System.out.print("Escribe un número en el intervalo [" + min + ", " + max + "]: ");
		leido =  reader.nextInt();
		
		while(leido<min || leido>max) {
			System.out.print("Número incorrecto. Vuelve a intentarlo: ");
			leido = reader.nextInt();
		}
		return(leido);
	}
	
	*/
	
	/* Problema 27 
		Con la ayuda del ya conocido procedimiento: 
		>> private static void esc(char que, int cuantos, boolean salta) << 
		Que escribe “cuantos” veces el carácter “que”. Si el tercer parámetro (salta) es true, además escribe un salto de línea. 
		Codificad un programa que dibuje una escala de n peldaños, donde n será un valor suministrado por el usuario del programa. 
		A continuación tenéis como ejemplo el resultado que el programa tendría que proporcionar para n=4 y para n=6: 
		
		|_                         |_
		  |_                         |_
		    |_                         |_
		      |_                         |_
		                                   |_
		                                     |_
	
		>> private static void esc(char que, int cuantos, boolean salta) << 
		
		Cada peldaño está formado por dos caracteres: | y _ .
		Por lo que hace referencia a los espacios en blanco, bajo el primer peldaño hay 2, debajo del segundo 4, debajo del tercero 6, ...
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int numPeldaños, i;
		System.out.print("¡Cuántos peldaños ha de tener la escalera? ");
		numPeldaños = reader.nextInt();
		i = 1;
		System.out.println("");
		
		while(i <= numPeldaños) {
			// dibujar espacios previos
			esc(' ', 2*(i-1), false);
			esc('|', 1, false);
			esc('_', 1, true);
			i++;
		}
	}
	
	public static void esc(char car, int cuantos, boolean salta) {
		for(int i=0; i<cuantos; i++) {
			System.out.print(car);
		}
		if(salta) {
			System.out.println("");
		} else {
			System.out.print("");
		}
	}
	
	*/
	
	/* Problema 28 
		Se quiere codificar un programa que dibuje escaleras 'zebra'. Una escala zebra tiene las siguientes características: 
		• El rellano más alto (el primero) está formado por dos ladrillos.
		• Cada rellano tiene un ladrillo más que el anterior.
		• El último ladrillo de cada rellano (el de más a la derecha) siempre es negro.
		• Los rellanos impares están formados por ladrillos negros, los pares por ladrillos blancos, menos el último ladrillo que siempre es negro.
		A continuación se muestra un ejemplo de escalas zebra de alturas 4 y 7 respectivamente.
		
		Para facilitar la construcción de escaleras, se dispone del siguiente procedimiento, que no tenéis que codificar, especializado en la 
		escritura de un ladrillo:
		>> private static void escribeLadrillo(boolean negro) <<
		Si el valor del parámetro es true el ladrillo será negro. En caso contrario será blanco.
		Con la ayuda del procedimiento anterior, completad el programa que se da a continuación:
	
	public static void main(String[] args) {
		int nRellanos, i, ladrillo;
		Scanner reader = new Scanner(System.in);
		boolean ladrilloNegro;
		nRellanos = reader.nextInt();
		i = 1;
		ladrilloNegro = true;
		
		while(i <= nRellanos) {
			ladrillo = 1;
			while(ladrillo <= i) {
				escribeLadrillo(ladrilloNegro);
				ladrillo++;
			}
			escribeLadrillo(true);
			System.out.println();
			ladrilloNegro = !ladrilloNegro;
			i++;
		}
	}
	
	*/
	
}
