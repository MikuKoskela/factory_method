import java.util.Random;


public class WildernessMap extends Map{
    private static Random random = new Random();

    @Override
    public Tile createTile() {
        int choice = random.nextInt(3); // 0,1,2
        return switch (choice) {
            case 0 -> new SwampTile();
            case 1 -> new ForestTile();
            default -> new WaterTile();
        };
    }
}
