package org.ksdev.jps;

import org.junit.After;

import java.util.List;

/**
 * @author Kevin
 */
public class JPSDiagBaseTest {
    public JPS<Tile> jps;
    public List<List<Tile>> tileList;

    public void setup(Graph.Diagonal diagonal) {
        Tile[][] tiles = new Tile[][]{
                {new Tile(0, 0), new Tile(1, 0), new Tile(2, 0), new Tile(3, 0), new Tile(4, 0), new Tile(5, 0), new Tile(6, 0), new Tile(7, 0), new Tile(8, 0)},
                {new Tile(0, 1), new Tile(1, 1), new Tile(2, 1), new Tile(3, 1), new Tile(4, 1), new Tile(5, 1), new Tile(6, 1), new Tile(7, 1), new Tile(8, 1)},
                {new Tile(0, 2), new Tile(1, 2), new Tile(2, 2), new Tile(3, 2), new Tile(4, 2), new Tile(5, 2), new Tile(6, 2), new Tile(7, 2), new Tile(8, 2)},
                {new Tile(0, 3), new Tile(1, 3), new Tile(2, 3), new Tile(3, 3), new Tile(4, 3), new Tile(5, 3), new Tile(6, 3), new Tile(7, 3), new Tile(8, 3)},
                {new Tile(0, 4), new Tile(1, 4), new Tile(2, 4), new Tile(3, 4), new Tile(4, 4), new Tile(5, 4), new Tile(6, 4), new Tile(7, 4), new Tile(8, 4)}
        };

        tileList = JPSTestUtil.arraysToLists(tiles);

        jps = JPS.JPSFactory.getJPS(new Grid<>(tileList), diagonal);
    }

    @After
    public void reset() {
        for (List<Tile> list : tileList) {
            for (Tile tile : list) {
                tile.walkable = true;
            }
        }
    }
}
