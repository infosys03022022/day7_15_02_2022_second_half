package infosys.demo.withoutabstract;
    public class Rectangle {
    private int x;
    private int y;
    public int calculateArea() {
     int area=x*y;
     return area;
    }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
   
   }