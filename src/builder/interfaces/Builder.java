package builder.interfaces;

import builder.enums.CarType;
import builder.enums.Transmission;
import builder.models.Engine;
import builder.models.GPSNavigator;
import builder.models.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}