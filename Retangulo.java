class Retangulo{
	
	public double altura;
	public double base;
	
	public void area(){
	
		System.out.println("A area desse retangulo eh : " + this.base * this.altura);
	
	}

	public void perimetro(){
	
		System.out.println("O perimetro desse retangulo eh : " + 2 * (this.base + this.altura));

	}
}