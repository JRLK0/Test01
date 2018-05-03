package Pruebaporequipos;

public class ClaseEjercicio1 {

	

		private String nombre;
		private double notaejercicios;
		private double notaexamen;
		private double notaactitud;
		private double notafinal;
		
		
		
		public double getNotafinal() {
			return notafinal;
		}


		public void setNotafinal(double notafinal) {
			this.notafinal = notafinal;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public double getNotaejercicios() {
			return notaejercicios;
		}


		public void setNotaejercicios(double notaejercicios) {
			this.notaejercicios = notaejercicios;
		}


		public double getNotaexamen() {
			return notaexamen;
		}


		public void setNotaexamen(double notaexamen) {
			this.notaexamen = notaexamen;
		}


		public double getNotaactitud() {
			return notaactitud;
		}


		public void setNotaactitud(double notaactitud) {
			this.notaactitud = notaactitud;
		}


		
				
		public ClaseEjercicio1() {
			super();
			this.nombre = nombre;
			this.notaejercicios = notaejercicios;
			this.notaexamen = notaexamen;
			this.notaactitud = notaactitud;
		}
		
		
		
		//calulo de nota final
		
		public void calcnotafinal () {
			
			if (notaexamen>=4) {
				
				if (notaejercicios>=5) {
					
					notafinal=notaejercicios*0.6+notaexamen*0.3+notaactitud*0.1;
				}
				
			}else {
				notafinal=notaexamen*0.9+notaactitud*0.1;
			}
			
			
			System.out.println("El Alumno: "+ nombre + " tiene de nota final " + notafinal);
			
		}
		
		
		
		
		
	}


