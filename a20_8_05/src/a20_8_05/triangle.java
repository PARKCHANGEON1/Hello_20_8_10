package a20_8_05;

public class triangle extends Shape {

	private int w, h;
	public double area() {
		res=(w*h)/2.0;
		return res;
	}

	public void show() {
		System.out.println("�ﰢ���ǳ���="+res);
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

}
