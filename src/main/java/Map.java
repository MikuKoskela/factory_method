
abstract class Map {
    abstract Tile createTile();

    public void display(Tile[][] map) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                System.out.print(map[y][x].getCharacter());
                System.out.print("  ");
            }
            System.out.println();
        }
    }


}
