package falingbuilder;

public class HexButtonParams {
    private int xCoordinate;
    private int yCoordinate;
    private String type;
    private Color color;

    public HexButtonParams(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public HexButtonParams(String type) {
        this.type = type;
    }

    public HexButtonParams(Color color) {
        this.color = color;
    }
}
