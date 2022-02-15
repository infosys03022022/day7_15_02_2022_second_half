package infosys.demo.withabstract;
// A class containing atleast one abstract method needs to be declared as an abstract class.   
public abstract class Shape {
    protected int x;
    protected int y;
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
   // a method without a body is called abstract method
    public abstract int calculateArea(); // A method without a body or implementation

   }