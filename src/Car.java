public class Car {
    private int engineDisplacement;
    private String plate;
    private String brand;
    private String model;
    private int year;
    public void isClassicCar(){
        if (year < 1980){
            System.out.println("This auto is a Classic car");
        }
    }
    public void isSuperCar(){
        if (engineDisplacement > 3506){
            System.out.println("This auto is a Super car");
        }
    }

    public Car(int engineDisplacement, String plate, String brand, String model, int year) {
       setEngineDisplacement(engineDisplacement); ;
        setPlate(plate);
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineDisplacement=" + engineDisplacement + " cc" +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
