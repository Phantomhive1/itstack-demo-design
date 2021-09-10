package org.itstack.demo.design.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class IIR {

    private Logger logger = LoggerFactory.getLogger(IIR.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        logger.info("IIR 获取数据 key:{}", key);
        return dataMap.get(key);

    }

    public void set(String key, String value) {

        logger.info("IIR 写入数据 key:{} val:{}", key,value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("IIR 写入数据：{} val:{} timeout:{} timeunit:{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);

    }

    public void del(String key) {
        logger.info("IIR 删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
