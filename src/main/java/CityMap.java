import java.util.Random;

public class CityMap extends Map{
    private static Random random = new Random();

    @Override
    public Tile createTile() {
        int choice = random.nextInt(3); // 0,1,2
        return switch (choice) {
            case 0 -> new ForestTile();
            case 1 -> new BuildingTile();
            default -> new RoadTile();
        };
    }

}
