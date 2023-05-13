package design_pattern.builder;

public interface Builder {

    Builder setWindows(int windows);
    Builder setDoors(int doors);
    Builder setRooms(int rooms);
    Builder setHasGarage(boolean hasGarage);
    Builder setHasSwimmingPool(boolean hasSwimmingPool);
    Builder setHasGarden(boolean hasGarden);

    House create();
}
