package org.itstack.demo.design;

public interface IMenu {

    IMenu appendingCeiling(Matter matter);

    IMenu appendingCoat(Matter matter);

    IMenu appendingFloor(Matter matter);

    IMenu appendingTile(Matter matter);

    String getDetail();
}
