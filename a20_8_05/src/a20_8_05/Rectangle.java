package a20_8_05;

public class Rectangle extends Shape {

	private int w, h;
	
	public double area() {
		res=w*h;
		return res;
	}

	public void show() {
		System.out.println("�簢���ǳ���="+res);
		}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}
	
}
