package a20_8_05;

class Point2D{
	public int x, y;
	public void show() {
		System.out.println("2D쇼");
	}
	
}
class Point3D extends Point2D{
	public int z;//3D고유의 자신이라서 부모님이 이거쓰면 안된다. 자식꺼라서 부모가 못쓴다
	public void show() {
		System.out.println("3D쇼");
	}
}

public class castTest {

	public static void main(String[] args) {
			Point3D pt=new Point3D();
			Point2D up=pt;	
			System.out.println(up.x);
			System.out.println(up.y);
			//System.out.println(up.z);컴파일에러
			System.out.println(pt.x);
			System.out.println(pt.y);
			System.out.println(pt.z);
			
			
	}

}
