package run;

import bt.Point2D;
import bt.Point3D;

public class Mainbt {
   public static void main(String[] args) {
      Point2D point = new Point3D(2, 3, 4);
      Point2D point1 = new Point2D(3, 4);
      System.out.println("Điểm 3d: " + point);
      System.out.println("Điểm 2d: " + point1);
   }
}
