package a20_8_05;

public class Study {
	public static void poly(Shape sh) {
		if(sh instanceof Circle) {
			Circle cx=(Circle) sh;
			cx.setR(5);
			cx.area();
			cx.show();
		}
		else if(sh instanceof Rectangle) {
			Rectangle rx=(Rectangle) sh;
			rx.setH(10);
			rx.setH(5);
			rx.area();
			rx.show();
		}
		else if(sh instanceof triangle) {
			triangle tx=(triangle) sh;
			tx.setH(10);
			tx.setH(5);
			tx.area();
			tx.show();
		}
	}
}