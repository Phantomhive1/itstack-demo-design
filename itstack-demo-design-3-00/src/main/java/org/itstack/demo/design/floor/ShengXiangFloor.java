package org.itstack.demo.design.floor;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;

public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣像";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣像地板牛逼啊";
    }
}
