public class Triangle implements Shape {

    private double height;
    private double base;

    // constructors
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return (this.height * this.base) / 2;
    }

}