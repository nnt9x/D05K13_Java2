package design_pattern.builder2;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setDoors(4)
                .setHasGarden(true)
                .setRooms(3)
                .setRooms(4)
                .setHasSwimmingPool(true)
                .create();

        System.out.println(house);

    }
}
