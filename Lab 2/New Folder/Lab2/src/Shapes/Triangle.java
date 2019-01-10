package shapes;

public class Triangle {
    
    private double base;
    private double height;
    
    public Triangle (double base, double height){
           if (base <= 0.0 || height <= 0.0)
           throw new IllegalArgumentException ("Shape's dimensions must be positive values");
        this.base = base;
        this.height = height;
    }
    public double getHeight() { return this.height; }
    public double getBase()  { return this.base; }
    public double perimeter() { return this.height * 3; }
    public double area() { return (this.base * this.height)/2; }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        Triangle r = (Triangle)other;
        return ((Math.abs(base - r.base)< 0.001) && 
                (Math.abs(height-r.height)< 0.001));
    } 
     @Override
    public String toString() { 
        return "b=" + this.base + " x h=" + this.height;
    }
    
}