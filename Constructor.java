class Car {
    String brand;
    
    // Constructor
    Car(String brandName) {
        brand = brandName;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota");
        c1.display();
    }
}
