public class TestMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        Point p = new Point(1, 1);
        shapes[0] = new Circle(p, 2);
        shapes[1] = new Rectangle(p, 2, 2);
        shapes[2] = new Circle(p, 3);
        shapes[3] = new Rectangle(p, 1, 3);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.print("The shape's area:" + String.format("%.2f", shapes[i].getArea()) + "  ");
                System.out.println("The shape is Circle!");
            } else {
                System.out.print("The shape's area:" + String.format("%.2f", shapes[i].getArea()) + "  ");
                System.out.println("The shape is Rectangle!");
            }
        }
    }
}