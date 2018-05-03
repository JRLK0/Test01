package pfor;

public class Wtf {

//definir atributos
		private String atrS;
		private int atrI;
		private boolean atrB;
		
		
		public void mostrarDatos() {
			System.out.println("atributo S " +atrS);
		}



		public Wtf() {
			
			atrB=true;
			
		}

		public String getAtrS() {
			return atrS;
		}






		public void setAtrS(String atrS) {
			this.atrS = atrS;
		}






		public int getAtrI() {
			return atrI;
		}






		public void setAtrI(int atrI) {
			this.atrI = atrI;
		}






		public boolean isAtrB() {
			return atrB;
		}






		public void setAtrB(boolean atrB) {
			this.atrB = atrB;
		}






		public Wtf(String atrS, int atrI, boolean atrB) {
			super();
			this.atrS = atrS;
			this.atrI = atrI;
			this.atrB = atrB;
		}
		
		
		
		/*public Wtf(String s, int i, boolean b) {
			
			atrS=s;
			atrI=i;
			atrB=b;
			
		}
		
		
		
		//definir metodos de acceso
		
		public void setAtrS(String s) {
			atrS = s;
		}

		public String getAtrS() {
			return atrS;
		}
		
		public void setAtrI(int i) {
			atrI = i;
		}
	
		public int getAtrI() {
			return atrI;
		}
		
		public void setAtrB(boolean b) {
			atrB = b;
		}
		
		public boolean getAtrB() {
			return atrB;
		}*/

}
/*un constructor es una especia de metodo tiene algunas caracteristicas especiales 
un constructor no va a tener retorno
*/