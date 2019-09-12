public class Square extends Rectangle {
    public Square(){
    }
    public Square(double size) {
        super(size,size);
    }
    public Square(double size,String color,boolean filled) {
        super(size,size,color,filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double size) {
        setWidth(size);
        setHeight(size);
    }
    public void setWidth(double width) {
        setSide(width);
    }
    public void setHeight(double height) {
        setSide(height);
    }
    public String toString() {
        return "A square with size "
                +getSide()
                +" , which a subclass of "
                +super.toString();
    }
}

class main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(2.3);
        System.out.println(square1);

        Square square2 = new Square(2.3,"green",false);
        System.out.println(square2);
    }
}
