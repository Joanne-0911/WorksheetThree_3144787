package griffith;

//RightAngledTriangle subclass that extends Shape
public class RightAngledTriangle extends Shape {
 private double base;
 private double height;
 private double hypotenuse;

 public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
     super(name);
     this.base = base;
     this.height = height;
     this.hypotenuse = hypotenuse;
 }

 @Override
 public double area() {
     return (base * height) / 2;
 }

 @Override
 public double perimeter() {
     return base + height + hypotenuse;
 }

 @Override
 public String toString() {
     return super.toString() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
 }
}
