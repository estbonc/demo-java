package com.lss.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

/**
 * Author: Liu Shuaishuai
 * Email: liushuaishuai@91zdan.com
 * Date: 2017-11-07 16:46
 * Description:
 * History:
 */
public class JacksonUtil {

    /**
     * json格式转成对象格式
     * @param str   --json格式
     * @param t
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T strToBean(String str ,Class<T> t) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        T t1 = mapper.readValue(str, t);//json转java对象。经测，转成对象后，一切恢复正常
        return t1;
    }

    /**
     * 对象格式转成Json格式
     * @param t
     * @param <T>
     * @return
     * @throws IOException
     */
    public static<T> String beanToStr(T t) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(t);
        return str;
    }

    /**
     * Json格式转换成Map
     * @param json
     * @return
     * @throws IOException
     */
    public static Map jsonToMap(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map map = mapper.readValue(json, Map.class);
        return map;
    }

    /**
     * Map格式转换成Json格式
     * @param m
     * @return
     * @throws IOException
     */
    public static String mapToJson(Map m) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(m);
    }

}
