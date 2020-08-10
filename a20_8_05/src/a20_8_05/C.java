package a20_8_05;
class A{
	
}
class B extends A{
	
}
public class C {
	public static C getC() {
		return new C();
	}
	public static void main(String[] args) {
		A a=new A();//객체명은 내마음대로
		B b=new B();
		C ckim=new C();//내자신도 객체가된다. 
		C cpark=getC();
		
		
	}
}
