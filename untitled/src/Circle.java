public class Circle extends Shape {
    double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, boolean filled, String color){
        super(color,filled);
        this.radius = radius;
    }
    private double getArea(){
        return Math.PI * this.radius*this.radius;
    }
    private double getPeri(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
