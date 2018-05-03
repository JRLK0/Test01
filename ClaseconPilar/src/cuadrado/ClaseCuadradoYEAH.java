package cuadrado;

import java.util.Scanner;

public class ClaseCuadradoYEAH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=0;
		int area1=0;
		int area2=0;
		
		ClaseCuadrado cp = new ClaseCuadrado();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dime el lado");
		x = sc.nextInt();
		
		cp.setLado1(x);
		
		System.out.println("Dime la base");
		y = sc.nextInt();
		
		cp.setBase1(y);
		
		cp.calcArea();
		
		area1=cp.getarea();
		
		//area2
		
		System.out.println("Dime el lado 2");
		x = sc.nextInt();
		
		cp.setLado1(x);
		
		System.out.println("Dime la base 2");
		y = sc.nextInt();
		
		cp.setBase1(y);
		
		cp.calcArea();
		
		area2=cp.getarea();
		
		System.out.println("Luego se hace la media de estos dos "+area1+ " "+ area2);
	
		
		sc.close();
	}

}
