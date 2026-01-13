import java.util.Scanner;

public class Game {
    private Tile[][] map;
    public final int mapSize = 10;


    public static void main(String[] args){
        Game game = new Game();
        game.createMap();
    }

    public void createMap(){

       while (true){
        System.out.println("Which map to create? (c/w) or quit (q)");
        Scanner scanner = new Scanner(System.in);
        char mapChoice = scanner.nextLine().charAt(0);
        if(mapChoice == 'c'){
        CityMap cityMap = new CityMap();
            map = new Tile[mapSize][mapSize];
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    map[y][x] = cityMap.createTile();
                }
            }
            cityMap.display(map);
        } else if (mapChoice == 'w') {
            WildernessMap wildernessMap = new WildernessMap();
            map = new Tile[mapSize][mapSize];
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    map[y][x] = wildernessMap.createTile();
                }
            }
            wildernessMap.display(map);
        } else if (mapChoice == 'q'){
            System.out.println("Map creation completed...");
            break;
        }
        else {
            System.out.println("Wrong key");
            }
        }
    }
    }
