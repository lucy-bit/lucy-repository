package com.nannan.tomcat;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 21:54
 */
public class Config {

    public Map<String, String> servletNameToServletClassNameMap;
    //真实的tomcat中允许同一个url对应不同的Servlet，但是我们这里就简单地：如果key相同，进行覆盖即可
    public LinkedHashMap<String, String> urlToServletNameMap;

    public Config(Map<String, String> servletNameToServletClassNameMap, LinkedHashMap<String, String> urlToServletNameMap) {
        this.servletNameToServletClassNameMap = servletNameToServletClassNameMap;
        this.urlToServletNameMap = urlToServletNameMap;
    }
}
