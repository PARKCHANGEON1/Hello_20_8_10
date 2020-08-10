package a20_8_05;

public class Circle extends Shape {

	private int r;
	
	public double area() {
		res=r*r*Math.PI;
		return res;
	}

	public void show() {
		System.out.println("¿øÀÇ³ĞÀÌ="+res);
	}

	public void setR(int r) {
		this.r = r;
	}
	

}
