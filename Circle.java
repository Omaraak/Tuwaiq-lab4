public class Circle extends Shape{
    private double radios = 0;

    public void setRadios(double radios) {
        this.radios = radios;
    }

    public double getRadios() {
        return radios;
    }

    public Circle(double radios) {
        this.radios = radios;
    }

    @Override
    public double calculateArea() {
        return 3.14*(radios*radios);
    }

    @Override
    public double calculateCircumference() {
        return 2*3.14*radios;
    }
}
