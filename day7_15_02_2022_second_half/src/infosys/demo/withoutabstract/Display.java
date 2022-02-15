package infosys.demo.withoutabstract;
 public class Display {

    public void displayArea(Triangle t) {
    System.out.println(t.calculateArea());
    }

   public void displayArea(Rectangle r) {
    System.out.println(r.calculateArea());
    }
  }
