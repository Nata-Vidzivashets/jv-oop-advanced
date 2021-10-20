package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, String name, double base1,
                              double base2, double height) {
        super(color, name);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName().toLowerCase() + ", area: " + getArea()
                + " sq.units, base 1: " + base1 + " units, base 2: " + base2
                + " units, height: " + height + " units, color: " + getColor();
    }
}