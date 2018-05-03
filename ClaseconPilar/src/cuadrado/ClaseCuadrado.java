package cuadrado;

public class ClaseCuadrado {

	private int lado1;
	private int base1;
	//private int lado2;
	//private int base2;
	private int area=0;
	
	public ClaseCuadrado() {
		
	}
	
		
	public int getLado1() {
		return lado1;
	}


	public int getarea() {
		return area;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}



	public int getBase1() {
		return base1;
	}



	public void setBase1(int base1) {
		this.base1 = base1;
	}



	public void calcArea() {
		
		area=lado1*base1;
		
		System.out.println("Area del cuadrado: "+ area);
				
		
	}
	
	
	
	
	
	
	
	
	
	
}
