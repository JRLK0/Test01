import java.util.Scanner;

public class C_DeseaSeguirEnElBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String a = "si";
		
		// Cuando comparar y al principio le pones el signo ! quiere deir lo contrario (que sea distinto de...)
		while (!a.equals("no")) {
			
			System.out.println("Desea seguir en el buble??");
			
			a = sc.next().toLowerCase();
			
			
		}
		
	}

}

