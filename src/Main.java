public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(6490, "KAZ 2Y5", "Chevrolet", "Impala", 1967);

        System.out.println("Car1 = " + car1);
        car1.isClassicCar();
        car1.isSuperCar();
    }
}
