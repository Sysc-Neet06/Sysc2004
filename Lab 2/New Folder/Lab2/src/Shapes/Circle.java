package shapes;

public class Circle {
    
    private double radius;
    
    public Circle (double radius){
        if (radius <= 0.0)
            throw new IllegalArgumentException ("Shape's dimensions must be positive values");
        this.radius = radius;
    }

    
    
public double getRadius() { return this.radius; }
public double perimeter() {return (this.radius*2*3.14159);}
public double area() {return (this.radius*this.radius*3.14159);}

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        Circle r = (Circle)other;
        return ((Math.abs(radius - r.radius)< 0.001) && 
                (Math.abs(radius-r.radius)< 0.001));
    } 
    
    @Override
    public String toString() { 
        return "r=" + this.radius;
}
}