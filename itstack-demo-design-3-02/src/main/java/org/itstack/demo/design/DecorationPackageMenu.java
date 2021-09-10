package org.itstack.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageMenu implements IMenu {
    private Logger logger = LoggerFactory.getLogger(DecorationPackageMenu.class);

    private List<Matter> list = new ArrayList<>(); // 装修清单
    private BigDecimal price = BigDecimal.ZERO;

    private BigDecimal area; // 面积

    private String grade; // 装修等级：豪华欧式 轻奢田园 现代简约

    public DecorationPackageMenu(){

    }

    public DecorationPackageMenu(Double area, String grade){
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendingCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));

        return this;
    }

    @Override
    public IMenu appendingCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendingFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendingTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n---------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, RoundingMode.HALF_UP));
        return null;
    }
}
