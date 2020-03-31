public class Circle implements Shape {

    private double radius;

    // constructors
    public Circle(double radius) {
        this.radius = radius;
        
    }

    @Override
    public double area() {
        return  Math.PI * Math.pow(this.radius, 2);
    }

}