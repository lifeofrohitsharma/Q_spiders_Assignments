package Encapsulation;

public class RectangleExecution {
	public static void main(String[] args) {
		Rectangle ab = new Rectangle(5,9);
		System.out.println("Area of Rectangle :"+ab.length * ab.getBreadth());
		ab.setBreadth(7);
		System.out.println("Updated Area of Rectangle :"+ab.length * ab.getBreadth());
	}
}
