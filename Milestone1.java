package milestone1;
import java.util.Scanner;

public class Milestone1 {
	// Nivell 1
	
	/* Fase 1
		Crea tres variables string e inicialítza-les amb les dades pertinents (nom, cognom1, cognom2).
		Crea tres variables int e inicialítza-les amb les dades pertinents (dia, mes, any).
		Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
		Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles	
	*/
	
	/*public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		String name, surname1, surname2;
		int day, month, year;
		System.out.print("Introduce tu nombre: ");
		name = reader2.next();
		System.out.print("Introduce tu primer apellido: ");
		surname1= reader2.next();
		System.out.print("Introduce tu segundo apellido: ");
		surname2 = reader2.next();
		String fullName = name + " " + surname1 + " " + surname2;
		System.out.print("Introduce el día de tu nacimiento: ");
		day = reader2.nextInt();
		System.out.print("Introduce el mes de tu nacimiento: ");
		month = reader2.nextInt();
		System.out.print("Introduce el año de tu nacimiento: ");
		year = reader2.nextInt();
		String fullDate = day + "/" + month + "/" + year;
		System.out.print("Tu nombre es " + fullName + " y naciste en la fecha " + fullDate);
	}*/
	
	
	/* Fase 2
	   Sabent que l’any 1948 es un any de traspàs:
		Creeu una constant amb el valor de l’any (1948).
		Creeu una variable que guardi cada quan hi ha un any de traspàs.
		Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
		Mostreu per pantalla el resultat del càlcul.
	
	
	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		final int anyTraspas = 1948;
		int numAnysTraspas = 4;
		int anyUser;
		System.out.print("Introduce tu año de nacimiento: ");
		anyUser = reader2.nextInt();
		int numTraspassos = (anyUser - anyTraspas)/numAnysTraspas;		
		System.out.print("Desde 1948 hasta que tú naciste en " + anyUser + " hubieron " + numTraspassos + " años bisiestos.");
	}
	*/
	
	
	
	/* Fase 3
	   Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement. 
		ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la. 
		Creeu una variable boolean que serà certa si l’any de naixement és de traspàs o falsa si no ho és.
		En cas de que la variable boolean sigui certa, heu de mostrar per consola una frase on ho digui, en cas de 
		ser falsa mostrareu la frase pertinent.
		Creeu dues variables string per guardar les frases.
	
	
	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		int anyTraspas = 1948;
		int numAnysTraspas = 4;
		int anyUser;
		System.out.print("Introduce tu año de nacimiento: ");
		anyUser = reader2.nextInt();
		int numTraspassos = (anyUser - anyTraspas)/numAnysTraspas;
		String anysTraspassos = "";
		
		for (int i=1; i<=numTraspassos; i++) {
			anyTraspas = anyTraspas + 4;
			anysTraspassos += (anyTraspas + " ");
		}
		System.out.print("Desde 1948 hasta tu año de nacimiento, " + anyUser + ", ha habido los siguientes años bisiestos:" + "\n" + anysTraspassos + "\n");
		Boolean checkTraspas;
		String resultCheck = "";
		if (anyTraspas == anyUser) {
			checkTraspas = true;
			resultCheck = "Tu año de nacimiento, " + anyUser + ", fue un año bisiesto.";
		} else {
			checkTraspas = false;
			resultCheck = "Tu año de nacimiento, " + anyUser + ", no fue un año bisiesto.";
		}
		System.out.print(checkTraspas + ": ");
		System.out.print(resultCheck);
	}
	
	*/
	
	
	/* Fase 4
	 *  Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la 
		data de naixement separada per “/” (tot en una variable). 
		Mostreu per consola les variables del nom complet, la data de naixement i si l’any de naixement es de traspàs o no.
		Exemple de sortida per consola:
			El meu nom és Juan Perez Gonzalez
			Vaig néixer el 01/01/1979
			El meu any de naixement és de traspàs.
	
	
	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		String name, surname1, surname2;
		int day, month, year;
		System.out.print("Introduce tu nombre: ");
		name = reader2.next();
		System.out.print("Introduce tu primer apellido: ");
		surname1= reader2.next();
		System.out.print("Introduce tu segundo apellido: ");
		surname2 = reader2.next();
		String fullName = name + " " + surname1 + " " + surname2;
		System.out.print("Introduce el día de tu nacimiento: ");
		day = reader2.nextInt();
		System.out.print("Introduce el mes de tu nacimiento: ");
		month = reader2.nextInt();
		System.out.print("Introduce el año de tu nacimiento: ");
		year = reader2.nextInt();
		String fullDate = day + "/" + month + "/" + year;
		
		int anyTraspas = 1948;
		int numAnysTraspas = 4;
		int anyUser = year;
		int numTraspassos = (anyUser - anyTraspas)/numAnysTraspas;
		String anysTraspassos = "";
		
		for (int i=1; i<=numTraspassos; i++) {
			anyTraspas = anyTraspas + 4;
			anysTraspassos += (anyTraspas + " ");
		}
		
		Boolean checkTraspas;
		String resultCheck = "";
		if (anyTraspas == anyUser) {
			checkTraspas = true;
			resultCheck = "Mi año de nacimiento, " + anyUser + ", fue un año bisiesto.";
		} else {
			checkTraspas = false;
			resultCheck = "Mi año de nacimiento, " + anyUser + ", no fue un año bisiesto.";
		}
		System.out.print("Mi nombre es " + fullName + "." + "\n");
		System.out.print("Mi fecha de nacimiento es " + fullDate + "." + "\n");
		System.out.print(resultCheck);
	}	
	
	*/
	
	// Nivell 2
	
	/* Declara una variable double. Assigna-li un valor amb 4 decimals
		Declara variables de tipus: int, float i string
		Fes un "cast" de la variable double a cada una de les variables que has creat anteriorment per inicialitzar-les i pinta-les per pantalla.
	
	
	public static void main(String[] args) {
		double myDouble = 3.1416d;
		int myInt = (int) myDouble;
		float myFloat = (float) myDouble;
		String myString = String.valueOf(myDouble);
		System.out.println("Double is: " + myDouble);
		System.out.println("Int casted is: " + myInt);
		System.out.println("Float casted is: " + myFloat);
		System.out.println("String casted is: " + myString);
	}
	*/
	
	// Nivell 3
	/* Declara un array de numeros int e inicialitzala amb valors del 1 al 10
		Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.
	*/
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
		for(int i=myArray.length-1; i>=0; i--) {
			System.out.print(myArray[i] + " ");
		}
	}
	
}
