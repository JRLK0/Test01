package pfor;

import java.util.Scanner;

public class UsoClasePAtron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;

		
		Wtf cp = new Wtf("Hola", 15, true);
		Wtf cp2 = new Wtf();
		Scanner sc = new Scanner (System.in);
		
		cp2.setAtrS(sc.nextLine());
		
		cp2.setAtrI(i = Integer.parseInt(sc.nextLine()));
		cp2.setAtrB(true);
		
		
		
		
	}

}


/*click derecho > source> generate getter and setters to create
 * generar contructor usando campos -> otra cosa

this.blabla atributo se refiere*/


