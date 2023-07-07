package practice.day5.exercise;

public class day5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 10);
        System.out.println("Rectangle's area is " + rectangle.calculateArea());
        System.out.println("Rectangle's perimeter is " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5, 2);
        System.out.println("Triangle's area is " + triangle.calculateArea());
        System.out.println("Triangle's perimeter is " + triangle.calculatePerimeter());
    }
}
