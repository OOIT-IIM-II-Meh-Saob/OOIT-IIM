package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		
		System.out.println("X koordinata tacke p1 je: " + p1.getX());
		System.out.println("Y koordinata tacke p1 je: " + p1.getY());
		System.out.println("Selected je postavljeno na: " + p1.getSelected());
		
		Point p2 = new Point();
		p2.setX(13);
		p2.setY(15);
		p2.setSelected(true);
		
		double distance = p1.distance(p2.getX(), p2.getY());
		System.out.println("Udaljenost izmedju tacaka p1 i p2 je " + distance);
		p1.setX(p2.getX());
		double distance2 = p1.distance(p2.getX(), p2.getY());
		System.out.println("Udaljenost izmedju tacaka p1 i p2 je " + distance2);
		
		p1 = p2;
	}

}
