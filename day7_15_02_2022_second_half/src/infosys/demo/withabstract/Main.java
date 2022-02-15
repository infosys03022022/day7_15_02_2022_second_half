package infosys.demo.withabstract;
public class Main {
      public static void main(String str[]) {
      Display disp=new Display();
      Shape shape=null;
      Triangle triangle=new Triangle();
      triangle.setX(10);
      triangle.setY(20);
      shape=triangle; // Base class reference storing the address of the derived class object
      disp.displayArea(shape);
      Rectangle rectangle=new Rectangle();
      rectangle.setX(10);
      rectangle.setY(20);
      shape=rectangle;
      disp.displayArea(shape);
    }
  } 
   
