public class Rectangle extends Shape{
    private double height=0, width=0;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return (height+width)*2;
    }
}
