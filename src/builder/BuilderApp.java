package builder;

import builder.models.Car;
import builder.models.Director;
import builder.models.Manual;
import builder.models.builders.CarBuilder;
import builder.models.builders.CarManualBuilder;

public class BuilderApp {

	public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
	}

}
