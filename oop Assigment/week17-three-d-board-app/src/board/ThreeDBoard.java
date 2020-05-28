package board;

import java.util.ArrayList;
import java.util.List;

import unit.Unit;

public class ThreeDBoard {
	private int width, height;
	private int zpos;
	private Board board;
	private List<Board> tiles;

	public ThreeDBoard(int zpos, int width, int height) {
		this.zpos = zpos;
		this.width = width;
		this.height = height;
		board = new Board(width, height);
		initialize();
	}

	public void initialize() {
		tiles = new ArrayList(zpos);
		for (int i = 0; i < zpos; i++) {
			tiles.add(i, new Board(height, width));
		}
	}

	public Tile getTile(int x, int y, int z) {
		return (Tile) (tiles.get(z).getTile(x, y));
	}
	
	public void addUnit(Unit unit, int x, int y,int z)
    {
        Tile tile = tiles.get(z).getTile(x, y);
        tile.addUnit(unit);
    }
	
	public void removeUnit(Unit unit, int x, int y,int z)
    {
        Tile tile = tiles.get(z).getTile(x, y);
        tile.removeUnit(unit);
    }
	public void removeUnits(int x, int y,int z)
    {
        Tile tile = tiles.get(z).getTile(x, y);
        tile.removeUnits();
    }
	 public List getUnits(int x, int y,int z)
	    {
	        return tiles.get(z).getTile(x, y).getUnits();
	    }
}
