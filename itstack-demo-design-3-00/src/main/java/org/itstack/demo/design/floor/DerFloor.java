package org.itstack.demo.design.floor;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔（der）";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "德尔地板牛逼啊";
    }
}
