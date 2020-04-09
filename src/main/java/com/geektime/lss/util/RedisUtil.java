//package com.geektime.lss.util;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.ListOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Component;
//
///**
// * Author: Liu Shuaishuai
// * Email: liushuaishuai@91zdan.com
// * Date: 2017-11-30 16:02
// * Description: Redis 工具类
// * History:
// */
//
//@Component
//public final class RedisUtil {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    /**
//     * 批量删除对应的value
//     *
//     * @param keys
//     */
//    public void remove(final String... keys) {
//        for (String key : keys) {
//            remove(key);
//        }
//    }
//
//    /**
//     * 批量删除key
//     *
//     * @param pattern
//     */
//    public void removePattern(final String pattern) {
//        Set<Serializable> keys = redisTemplate.keys(pattern);
//        if (keys.size() > 0)
//            redisTemplate.delete(keys);
//    }
//
//    /**
//     * 删除对应的value
//     *
//     * @param key
//     */
//    public void remove(final String key) {
//        if (exists(key)) {
//            redisTemplate.delete(key);
//        }
//    }
//
//
//    public void expireByDays(final String key, int days) {
//        if (exists(key)) {
//            redisTemplate.expire(key, days, TimeUnit.DAYS);
//        }
//    }
//
//    /**
//     * 查看key的剩余生存时间
//     *
//     * @param key
//     * @return
//     */
//    public Long getExpire(final String key) {
//        return redisTemplate.getExpire(key);
//    }
//
//    /**
//     * 判断缓存中是否有对应的value
//     *
//     * @param key
//     * @return
//     */
//    public boolean exists(final String key) {
//        boolean exist = false;
//        try {
//            exist = redisTemplate.hasKey(key);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return exist;
//    }
//
//    /**
//     * 判断缓存中是否有对应的value
//     *
//     * @param key
//     * @return
//     */
//    public boolean notExists(final String key) {
//        return !this.exists(key);
//    }
//
//    /**
//     * 读取缓存
//     *
//     * @param key
//     * @return
//     */
//    public Object get(final String key) {
//        Object result = null;
//        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//        result = operations.get(key);
//        return result;
//    }
//
//
//    public List<Object> get(final String key, int start, int end){
//        ListOperations<String, Object> list = redisTemplate.opsForList();
//        return list.range(key,start,end);
//    }
//
//
//    public boolean putList(final String key, Object value) {
//        boolean result = false;
//        try {
//            ListOperations<String, Object> list = redisTemplate.opsForList();
//            list.rightPush(key, value);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//    /**
//     * 写入缓存
//     *
//     * @param key
//     * @param value
//     * @return
//     */
//    public boolean put(final String key, Object value) {
//        boolean result = false;
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            operations.set(key, value);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    /**
//     * 写入缓存 ,设定超时时间 超时时间以s为单位
//     *
//     * @param key
//     * @param value
//     * @param expireTime
//     * @return
//     */
//    public boolean put(final String key, Object value, Long expireTime) {
//        boolean result = false;
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            operations.set(key, value);
//            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    /**
//     * 写入缓存 ,设定时间,到指定时间自动过期
//     *
//     * @param key
//     * @param value
//     * @param expireTime
//     * @return
//     */
//    public boolean put(final String key, Object value, Date expireTime) {
//        boolean result = false;
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            operations.set(key, value);
//            redisTemplate.expireAt(key, expireTime);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    /**
//     * 写入缓存，如果不存在才写入，同时设置过期时间，超时时间以s为单位
//     */
//    public boolean putNX(final String key, Object value, long expireTime) {
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            Boolean result = operations.setIfAbsent(key, value);
//            //毫秒
//            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
//            return null == result ? false : result;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//}
