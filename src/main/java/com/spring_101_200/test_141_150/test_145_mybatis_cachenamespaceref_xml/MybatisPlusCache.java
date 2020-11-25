package com.spring_101_200.test_141_150.test_145_mybatis_cachenamespaceref_xml;

import com.alibaba.fastjson.JSON;
import com.utils.StringUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.CacheException;
import org.apache.ibatis.cache.CacheKey;

import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MybatisPlusCache implements Cache {
    // 读写锁
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);

    //这里使用了redis缓存，使用springboot自动注入
    private HashMap<String, Object> cacheMap = new HashMap<>();

    private String id;

    //是mybatis必须要求的，必写。此id是xml中的namespace的值
    public MybatisPlusCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("未获取到缓存实例id");
        }
        this.id = id;
    }
    //返回cache的唯一名称
    @Override
    public String getId() {
        return this.id;
    }
    //缓存存值
    @Override
    public void putObject(Object key, Object value) {
        String k = id + "_" + key.toString();
        //id是namespace的值，key是方法名，value是查询的结果
        System.out.println("putObject id:           " + id);
        System.out.println("putObject key:           " + key);
        String myK  = getKey(key);
        if(StringUtils.isNotBlank(myK)){
            System.out.println("putObject myK:      " + myK     );
            k = myK;
        }
        cacheMap.put(k, value);
    }

    //缓存取值
    @Override
    public Object getObject(Object key) {
        String k = id + "_" + key.toString();
        System.out.println("getObject id:           " + id);
        System.out.println("getObject key:           " + key);
        String myK  = getKey(key);
        if(StringUtils.isNotBlank(myK)){
            System.out.println("getObject myK:      " + myK     );
            k = myK;
        }
        Object obj =  cacheMap.get(k);
        if(obj !=null){
            System.out.println(JSON.toJSONString(obj));
        }
        return obj;
    }
    public String getKey(Object key){
        if(key instanceof CacheKey){
            String keys [] = key.toString().split(":");
            return keys[keys.length-2] + keys[keys.length-1];
        }
        return null;
    }

    //mybatis保留方法
    @Override
    public Object removeObject(Object key) {
        return null;
    }

    //清空缓存，在增删改时会自动调用
    @Override
    public void clear() {
        cacheMap.clear();
    }

    @Override
    public int getSize() {
        int i = 0;
        for (String key : cacheMap.keySet()) {
            i++;
        }
        return i;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return this.readWriteLock;
    }



    public boolean equals(Object o) {
        if (getId() == null) throw new CacheException("Cache instances require an ID.");
        if (this == o) return true;
        if (!(o instanceof Cache)) return false;

        Cache otherCache = (Cache) o;
        return getId().equals(otherCache.getId());
    }

    public int hashCode() {
        if (getId() == null) throw new CacheException("Cache instances require an ID.");
        return getId().hashCode();
    }

}