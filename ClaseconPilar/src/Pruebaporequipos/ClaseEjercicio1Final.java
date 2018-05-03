package Pruebaporequipos;

import java.util.Scanner;



public class ClaseEjercicio1Final {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

			ClaseEjercicio1 cp = new ClaseEjercicio1();
			Scanner sc = new Scanner(System.in);
			
			String x="k";
			
			boolean continuar = true;
			double media = 0;
			double n = 0, max = 0;
			int a = 0, s= 0;
			String name = "nadie";
			
			
			
while (continuar) {

			
			
			System.out.print("Escribe tu nombre: ");
			cp.setNombre(sc.nextLine());
			
			System.out.print("Nota tareas de clase: ");
			
			cp.setNotaejercicios(Double.parseDouble(sc.nextLine()));
			
			
			System.out.print("Nota examen de clase: ");
			
			cp.setNotaexamen(Double.parseDouble(sc.nextLine()));
			
			System.out.print("Nota actitud de clase: ");
			
			cp.setNotaactitud(Double.parseDouble(sc.nextLine()));
			
			cp.calcnotafinal();
			
			
			//sc.nextLine();
			while (true) {
			
				System.out.println("Desea introducir datos para otro alumno?");
				
				x=sc.nextLine();
				
				
				if (x.equalsIgnoreCase("si")) {
					break;
				}else if(x.equalsIgnoreCase("no")) {
					continuar = false;
					break;
					
				}else {
					System.out.println("Por favor intruduzca Si o no.");
					
				}
			
			}
			
			
			
			if (cp.getNotafinal()>=5) {
				a++;
				
			}else {
				s++;
			}
				
				
			if (cp.getNotafinal()>max) {
				max=cp.getNotafinal();
				name=cp.getNombre();		
			}
			
			
			n++;
			media=cp.getNotafinal()+media;
			
			
}
	
		System.out.println("Han aprobado "+ a + " ,han suspendido "+s+
				" y el alumno que mas ha sacado ha sido "+ name + " con una nota de "+max+ 
				" Total de la media de la clase: "+ (media/n));
		
			sc.close();
			
	
}
		
}
