package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name =  "Civic";
        car1.model =  "1.4";
        car1.year =  2000;

        car2.name =  "Golf";
        car2.model =  "1.0";
        car2.year =  2006;

        System.out.printf("Car 1:%nName: %s%nModel: %s%nYear: %d%n", car1.name, car1.model, car1.year);
        System.out.println();
        System.out.printf("Car 2:%nName: %s%nModel: %s%nYear: %d", car2.name, car2.model, car2.year);

    }
}
