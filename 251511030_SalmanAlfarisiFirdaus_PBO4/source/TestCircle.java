public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c1 area   = " + c1.getArea());
        System.out.println("c1 object = " + c1);
        System.out.println();

        Circle c2 = new Circle(3.0, "blue");
        System.out.println("c2 radius = " + c2.getRadius());
        System.out.println("c2 area   = " + c2.getColor());
        System.out.println("c2 object = " + c2);
    }
}
