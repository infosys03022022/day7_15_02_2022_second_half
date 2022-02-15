package infosys.demo.withoutabstract;
 public class Main  {
   public static void main(String args[]) {
      Display disp=new Display();
      Triangle triangle=new Triangle();
      Rectangle rectangle=new Rectangle();
      triangle.setX(10);
      triangle.setY(2);
      disp.displayArea(triangle);
      rectangle.setX(20);
      rectangle.setY(10);
      disp.displayArea(rectangle);
    }
 }