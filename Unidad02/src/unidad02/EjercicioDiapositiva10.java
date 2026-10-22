package unidad02;

import java.util.Scanner;

public class EjercicioDiapositiva10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
        
		int numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número no es par.");
            }

            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
        }

       
	}

}
