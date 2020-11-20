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
		
		// VEZBE 4
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(r1);
		System.out.println(c1);
		
		p1 = p2;
		
		Point p3 = new Point(6, 7);
		Line l3 = new Line(p3, new Point(12, 13));
		Rectangle r3 = new Rectangle(new Point(p3.getX(), p3.getY()), 50, 100);
		
		p3.setX(50);
		
		System.out.println("X p3: " + p3.getX());
		System.out.println("X startPoint l3: " + l3.getStartPoint().getX());
		System.out.println("X upperLeft r3: " + r3.getUpperLeft().getX());
		
		Circle c3 = new Circle(new Point(), 10, true);
		System.out.println(c3);
		
		// Kreirati pravougaonik r4 tako da ima iste koordinate kao pocetna tacka
		// linije l3 i tako da se promenom x i y koordinata pocetne tacke linije l3
		// ne promene x i y koordinate tacke gore levo pravougaonika r4
		// Visina treba da bude jednaka duzini linije l3
		// Sirina treba da bude jednaka povrsini pravougaonika r3 umanjenoj za povrsinu
		// kruga c3
		// Selected parametar postaviti na vrednost izraza konjukcije selected krajnje 
		// tacke linije l3 i p3
		Rectangle r4 = new Rectangle(new Point(l3.getStartPoint().getX(), l3.getStartPoint().getY()),
				(int) (r3.area() - c3.area()), (int) l3.length(), 
				l3.getEndPoint().isSelected() && p3.isSelected());
		
		System.out.println(r4 + ", selected: " + r4.isSelected());
		
		Point p5 = new Point(5, 6);
		Point p6 = p5;
		Point p7 = new Point(5, 6);
		
		System.out.println("p5 == p6: " + (p5 == p6));
		System.out.println("p5 == p7: " + (p5 == p7));
		
		System.out.println("p5 equals p6: " + p5.equals(p6));
		System.out.println("p5 equals p7: " + p5.equals(p7));
		
		System.out.println("p5 equals l3: " + p5.equals(l3));
		
		Line l4 = new Line(new Point(10, 11), new Point(12, 13));
		Line l5 = new Line(new Point(10, 11), new Point(12, 13));
		
		System.out.println("l4 equals l5: " + l4.equals(l5));
	}

}
