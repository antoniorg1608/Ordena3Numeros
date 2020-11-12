package es.studium.Ordena3Numeros;

import java.util.Scanner;

public class Ordena3Numeros
{

	public static void main(String[] args)
	{
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo numero:");
		b = teclado.nextInt();
		System.out.println("Introduce el tercer numero:");
		c = teclado.nextInt();
		teclado.close();
		if ((a >= b) && (b >= c))
		{
			System.out.println("Los numeros ordenados de mayor a menos son:" + a + "," + b + "," + c);
		} else if ((a >= c) && (a >= b))
		{
			System.out.println("Los numeros ordenados de mayor a menos son:" + a + "," + c + "," + b);
		} else if ((b >= a) && (a >= c))
		{
			System.out.println("Los numeros ordenados de mayor a menos son:" + b + "," + a + "," + c);
		} else if ((b >= c) && (c >= a))
		{
			System.out.println("Los numeros ordenados de mayor a menos son:" + b + "," + c + "," + a);
		} else if ((c >= a) && (a >= b))
		{
			System.out.println("Los numeros ordenados de mayor a menos son:" + c + "," + a + "," + b);
		} else
		{
			System.out.println("Los numeros ordenados de mayor a menos son:" + c + "," + b + "," + a);
		}
	}
}
