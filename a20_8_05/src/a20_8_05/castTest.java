package a20_8_05;

class Point2D{
	public int x, y;
	public void show() {
		System.out.println("2D��");
	}
	
}
class Point3D extends Point2D{
	public int z;//3D������ �ڽ��̶� �θ���� �̰ž��� �ȵȴ�. �ڽĲ��� �θ� ������
	public void show() {
		System.out.println("3D��");
	}
}

public class castTest {

	public static void main(String[] args) {
			Point3D pt=new Point3D();
			Point2D up=pt;	
			System.out.println(up.x);
			System.out.println(up.y);
			//System.out.println(up.z);�����Ͽ���
			System.out.println(pt.x);
			System.out.println(pt.y);
			System.out.println(pt.z);
			
			
	}

}
