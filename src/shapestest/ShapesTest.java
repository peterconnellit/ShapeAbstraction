/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapestest;

/**
 *
 * @author peter
 */
public class ShapesTest {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[4];
    shapes[0] = new Rectangle(5.0, 10.0);
    shapes[1] = new Triangle(5.0, 10.0);
    shapes[2] = new Square(5.0);
    shapes[3] = new Circle(5.0);

    for (Shape shape : shapes) {
      if (shape instanceof Rectangle) {
        Rectangle rectangle = (Rectangle) shape;
        System.out.println("Height of rectangle: " + rectangle.getHeight());
        System.out.println("Width of rectangle: " + rectangle.getWidth());
      } else if (shape instanceof Triangle) {
        Triangle triangle = (Triangle) shape;
        System.out.println("Base of triangle: " + triangle.getBase());
        System.out.println("Height of triangle: " + triangle.getHeight());
      } else if (shape instanceof Square) {
        Square square = (Square) shape;
        System.out.println("Side of square: " + square.getSide());
      } else if (shape instanceof Circle) {
        Circle circle = (Circle) shape;
        System.out.println("Radius of circle: " + circle.getRadius());
      }
      System.out.println("Area of shape: " + shape.getArea());
      System.out.println(shape.toString());
      System.out.println();
    }
  }
}