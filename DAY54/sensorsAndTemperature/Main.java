package DAY54.sensorsAndTemperature;

public class Main {
    public static void main(String[] args) {
        Sensor hickory = new TemperatureSensor();
        hickory.setOn();
        System.out.println("The temperature in Hickory is: " + hickory.read() + " degrees Celsius.");

        Sensor conover = new TemperatureSensor();

        AverageSensor catawbaRegion = new AverageSensor();
        catawbaRegion.addSensor(hickory);
        catawbaRegion.addSensor(conover);

        catawbaRegion.setOn();
        System.out.println("The temperature in the Catawba region is: " + catawbaRegion.read() + " degrees Celsius.");

    }
}
