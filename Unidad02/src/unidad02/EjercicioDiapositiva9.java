package unidad02;

import java.util.Scanner;

public class EjercicioDiapositiva9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		
		int contador = 1;
        int numero;
        int suma = 0;
        double promedio;

        while (contador <= 10) {
		
		System.out.println("meteme un numero: ");
        numero = sc.nextInt();
        
        suma = suma + numero;
        
        contador ++;
        }
        promedio = (double) suma / 10;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio es: " + promedio);
}}
