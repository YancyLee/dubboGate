package com.didispace.util;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by yuanyili on 2017/5/26.
 */
public class Test implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.print("===================================");
    }
}
