package unidad02;

import java.lang.invoke.VolatileCallSite;
import java.util.Scanner;

public class EjercicioDiapositiva15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vocal;
		
		do {
		System.out.println("introduce una vocal: ");
		vocal = sc.nextLine().toLowerCase();
		
		if (!( vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")));
		
		System.out.println("error deves de introducir una vocal. ");
		
		}
		
		while (!( vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")));
	
		System.out.println("vocal valida: " + vocal);
	}}

		
