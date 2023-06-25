package builder;

import falingbuilder.Color;

public class HexButtonBuilder {
    protected final int xCoordinate;
    protected final int yCoordinate;
    protected final String type;
    protected final Color color;

    public HexButtonBuilder(Builder builder) {
        this.type = builder.type;
        this.xCoordinate = builder.xCoordinate;
        this.yCoordinate = builder.yCoordinate;
        this.color = builder.color;
    }

    public static class Builder{
        private int xCoordinate;
        private int yCoordinate;
        private String type;
        private Color color;

        public HexButtonBuilder build(){
            return new HexButtonBuilder(this);
        }
        public Builder xCoordinate(int xCoordinate){
            this.xCoordinate = xCoordinate;
            return this;
        }
        public Builder yCoordinate(int yCoordinate){
            this.yCoordinate = yCoordinate;
            return this;
        }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder color(Color color){
            this.color = color;
            return this;
        }
    }
}
