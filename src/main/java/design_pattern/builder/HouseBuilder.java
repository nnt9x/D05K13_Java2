package design_pattern.builder;

public class HouseBuilder implements Builder{
    private int windows;
    private  int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;


    public HouseBuilder(){}

    @Override
    public Builder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    @Override
    public Builder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public Builder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    @Override
    public Builder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    @Override
    public Builder setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    @Override
    public Builder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public House create() {
        return new House(windows, doors, rooms, hasGarage, hasSwimmingPool, hasGarden);
    }

}
