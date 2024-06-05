// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "3 series",2010,2000,43);
        Truck truck1 = new Truck("Mercedes", "Actross",2022, 10000, 190,7);
        double fuelEfficiency= car1.calculateFuelEfficiency();
        double fuelEfficiency2=truck1.calculateFuelEfficiency();
        System.out.println("Car's fuel efficiency is: "+ fuelEfficiency);
        System.out.println("Truck's fuel efficiency is: "+ fuelEfficiency2);
    }
}