package bt;

public class Rectangle extends Shape {
   protected double width = 1;
   protected double height = 1;

   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public Rectangle(String color, boolean filled, double width, double height) {
      super(color, filled);
      this.width = width;
      this.height = height;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getArea() {
      return width * height;
   }

   public double getPerimeter() {
      return (width + height) * 2;
   }

   @Override
   public String toString() {
      return "A Rectangle with width=" + width + " and length=" + height + ", which is a subclass of " + super.toString();
   }
}
