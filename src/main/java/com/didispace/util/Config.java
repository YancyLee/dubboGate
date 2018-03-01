package com.didispace.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by yuanyili on 2017/5/26.
 */
@Configuration
@ImportResource(locations={"classpath:dubbo-consumer.xml"})
public class Config {
}
