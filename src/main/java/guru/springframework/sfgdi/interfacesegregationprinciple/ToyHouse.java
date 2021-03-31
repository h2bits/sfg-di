package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyHouse implements Toy {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        // Dummy method from a fat interface
    }

    @Override
    public void fly() {
        // Dummy method from a fat interface
    }
}
