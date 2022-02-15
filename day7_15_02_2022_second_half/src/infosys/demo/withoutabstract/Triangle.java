package infosys.demo.withoutabstract;

   public class Triangle {
     private int x;
     private int y;

     public int calculateArea() {
      int area=(x*y)/2;
      return area;
     }
      public void setX(int x){
       this.x=x;
      }
      // setter/getters
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}

     }  