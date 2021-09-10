package org.itstack.demo.design.test;

import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.factory.ICacheAdapter;
import org.itstack.demo.design.factory.JDKProxy;
import org.itstack.demo.design.factory.impl.EGMCacheAdapter;
import org.itstack.demo.design.factory.impl.IIRCacheAdapter;
import org.itstack.demo.design.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01","小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }
}
