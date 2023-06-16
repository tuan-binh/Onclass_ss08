package bt;

public class Circle extends Shape {
   private double radius = 1;

   private final double PI = 3.14;

   public Circle(double radius) {
      this.radius = radius;
   }

   public Circle(String color, boolean filled, double radius) {
      super(color, filled);
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getAria() {
      return PI * Math.pow(radius, 2);
   }

   public double getPerimeter() {
      return 2 * PI * radius;
   }

   @Override
   public String toString() {
      return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
   }
}
