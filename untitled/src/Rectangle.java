public class Rectangle extends Shape {
    double height;
    double weight;
    public Rectangle(){
        this.height = 1.0;
        this.weight = 1.0;
    }
    public Rectangle(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public Rectangle(double height, double weight, boolean filled, String color){
        super(color,filled);
        this.weight = weight;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    private double getPeri(){
        return (weight+height)*2;
    }
    private double getArea(){
        return height*weight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
