public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, boolean filled, String color){
        super(side,side,filled,color);
    }

    @Override
    public String toString() {
        return "A square with side= "
                + this.height
                + ", which is a subclass of:"
                + super.toString();
    }
}
