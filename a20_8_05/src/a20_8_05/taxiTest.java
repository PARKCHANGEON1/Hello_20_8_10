package a20_8_05;
class Car{
	protected String model;//프로텍티드를해야 자식이 명령어를 사용할수있다
	protected String color;
	public Car() { }
	public Car(String model, String color) {
		this.model=model;
		this.color=color;
	}
	public void show() {
		System.out.println("모델명="+model+",칼라="+color);
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
		super.show();//부모의 쇼를 실행하고 돌아와서 내꺼를 실행하라
		System.out.println("택시메타기:"+TaxiMeter+"칼라:"+TaxiFare);
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
		Car c2=new Car("모닝","흰색");
		c2.show();
		System.out.println();
		Car c4=new Taxi("소나타","회색", true, 3300);
		c4.show();
		
		}
}
















