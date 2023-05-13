package design_pattern.builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        builder.setDoors(2)
                .setHasGarage(true)
                .setRooms(4)
                .setHasSwimmingPool(true);

        House house = builder.create();

        System.out.println(house);


        House house2 = new HouseBuilder()
                .setRooms(3)
                .setDoors(2)
                .setWindows(3)
                .setHasGarage(true)
                .create();


    }
}
