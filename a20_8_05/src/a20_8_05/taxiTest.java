package a20_8_05;
class Car{
	protected String model;//������Ƽ�带�ؾ� �ڽ��� ��ɾ ����Ҽ��ִ�
	protected String color;
	public Car() { }
	public Car(String model, String color) {
		this.model=model;
		this.color=color;
	}
	public void show() {
		System.out.println("�𵨸�="+model+",Į��="+color);
	}
	
}
class Taxi extends Car{
	private Boolean TaxiMeter;
	private int TaxiFare=3300;
	public Taxi() {
		super();
	}
	public Taxi(Boolean taxiMeter, int taxiFare) {
		super();
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	public Taxi(String model, String color) {
		super(model, color);
	}
	public Taxi(String model, String color, Boolean taxiMeter, int taxiFare) {
		super(model, color);
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	public void show() {
		super.show();//�θ��� � �����ϰ� ���ƿͼ� ������ �����϶�
		System.out.println("�ýø�Ÿ��:"+TaxiMeter+"Į��:"+TaxiFare);
	}
}
public class taxiTest {
	public static void main(String[] args) {
		Taxi t=new Taxi();
		t.show();
		System.out.println();
		Taxi t2=new Taxi(true, 3300);
		t2.show();
		System.out.println();
		Car c2=new Car("���","���");
		c2.show();
		System.out.println();
		Car c4=new Taxi("�ҳ�Ÿ","ȸ��", true, 3300);
		c4.show();
		
		}
}
















