public class Triangle extends Shape{
    private double height=0, base=0;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (height*base)/2;
    }

    @Override
    public double calculateCircumference() {
        return height+height+base;
    }
}
