import edu.princeton.cs.introcs.StdDraw; 

public class rectangle {
    
    private double length; 
    private double width; 

    public rectangle(double length, double width) {
        this.length = length; 
        this.width = width;
    }

    public double getLength() {
        return length; 
    }

    public double getWidth() { 
        return width; 
    } 

    public double area() {
        return length*width; 
    }

    public double perimeter() {
        return 2*(length+width);
    }

    public boolean isSmaller(rectangle other) {
        return this.area() < other.area(); 
    }

    public boolean isSquare() { 
        return length == width; 
    }

    public static void main(String[] args) { 
        rectangle r1 = new rectangle(3.0,5.0); 
        rectangle r2 = new rectangle(4.0,4.0);
        System.out.println(r1.isSquare());
        System.out.println(r2.isSmaller(r1));
    }
}
