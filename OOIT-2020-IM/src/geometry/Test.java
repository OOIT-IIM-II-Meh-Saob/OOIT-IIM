package geometry;

public class Test {

	public static void main(String[] args) {
		// VEZBE 2
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		
		System.out.println("X koordinata tacke p1 je: " + p1.getX());
		System.out.println("Y koordinata tacke p1 je: " + p1.getY());
		System.out.println("Selected je postavljeno na: " + p1.isSelected());
		
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
		
		// VEZBE 3
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		l1.setSelected(true);
		
		p1.setX(33);
		l1.getStartPoint().setX(55);
		
		System.out.println("X startPoint l1: " + l1.getStartPoint().getX());
		System.out.println("X p1: " + p1.getX());
		
		Line l2 = new Line();
		l2.setStartPoint(p2);
		l2.setEndPoint(new Point());
		l2.getEndPoint().setY(20);
		
		// Izracunati i ispisati udaljenost pocetne tacke linije l1 i krajnje tacke linije l2
		System.out.println(l1.getStartPoint().distance(l2.getEndPoint().getX(), l2.getEndPoint().getY()));
	
		Rectangle r1 = new Rectangle();
		System.out.println("Area r1: " + r1.area());
		
		r1.setUpperLeft(l2.getEndPoint());
		
		r1.setHeight(10);
		r1.setWidth(15);
		System.out.println("Area r1: " + r1.area());
		
		Rectangle r2 = new Rectangle();
		r2.setUpperLeft(new Point());
		r2.setHeight(5);
		r2.setWidth(10);
		System.out.println("Circumference r2: " + r2.circumference());
		
		Circle c1 = new Circle();
		c1.setCenter(new Point());
		System.out.println("\n\nX center c1: " + c1.getCenter().getX() +
				"\nY center c1: " + c1.getCenter().getY() + 
				"\nR c1: " + c1.getR() +
				"\nSelected c1: " + c1.isSelected());
		
		// Postaviti radijus kruga c1 na vrednost udaljenosti centra kruga c1 i pocetne tacke linije l1
		c1.setR((int) c1.getCenter().distance(l1.getStartPoint().getX(), l1.getStartPoint().getY()));
		System.out.println("R c1: " + c1.getR());
		
		// Postaviti selected parametar kruga c1 na vrednost izraza koji proverava da li je x centra kruga c1 vece od y koordinate upperLeft tacke r1
		c1.setSelected(c1.getCenter().getX() > r1.getUpperLeft().getY());
		System.out.println(c1.isSelected());
		
		// Postaviti y koordinatu krajnje tacke l1 na vrednost razlike koordinata centra kruga c1 umanjene
		// za vrednost zbira x koordinate upperLeft tacke pravougaonika r1 i povrsine kruga c1
		l1.getEndPoint().setY((int) ((c1.getCenter().getX() - c1.getCenter().getY()) 
				-
				(r1.getUpperLeft().getX() + c1.area())));
		System.out.println(l1.getEndPoint().getY());
	}

}
