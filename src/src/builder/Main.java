package builder;

import falingbuilder.Color;

public class Main {
    public static void main(String[] args) {
        HexButtonBuilder.Builder builder = new HexButtonBuilder.Builder();
        builder.xCoordinate(20).yCoordinate(20).type("Loop").color(new Color());
        HexButtonBuilder hexButtonBuilder = builder.build();

        System.out.println(hexButtonBuilder.xCoordinate);
        System.out.println(hexButtonBuilder.yCoordinate);
        System.out.println(hexButtonBuilder.type);
        System.out.println(hexButtonBuilder.color);
    }
}
