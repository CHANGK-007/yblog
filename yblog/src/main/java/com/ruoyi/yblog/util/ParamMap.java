package com.ruoyi.yblog.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParamMap extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 6209731158356994471L;

    public ParamMap() {
        super();
    }

    public ParamMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> obj : map.entrySet()) {
            this.put(obj.getKey(), obj.getValue());
        }
    }

    public static List<ParamMap> create(List<Map<String, Object>> list) {
        List<ParamMap> reList = new ArrayList<ParamMap>(list.size());
        for (Map<String, Object> map : list) {
            reList.add(new ParamMap(map));
        }
        return reList;
    }

    public LinkedHashMap<String, Object> get() {
        return this;
    }

    public static ParamMap by(String key, Object value) {
        return new ParamMap().set(key, value);
    }

    public ParamMap set(String key, Object value) {
        this.put(key, value);
        return this;
    }

    public String getStr(String column) {
        Object s = this.get(column);
        return s != null ? s.toString() : null;
    }

    public Integer getInt(String column) {
        try {
            Number n = getNumber(column);
            return n != null ? n.intValue() : null;
        } catch (Exception e) {
            String str = getStr(column);
            return Integer.parseInt(str);
        }
    }

    public Float getFloat(String column) {
        Number n = getNumber(column);
        return n != null ? n.floatValue() : null;
    }

    public Double getDouble(String column) {
        Number n = getNumber(column);
        return n != null ? n.doubleValue() : null;
    }

    public BigDecimal getBigDecimal(String column) {
        Double d = getDouble(column);
        return d != null ? BigDecimal.valueOf(d) : null;
    }

    public Long getLong(String column) {
        Number n = getNumber(column);
        return n != null ? n.longValue() : null;
    }

    private Number getNumber(String column) {
        return (Number) this.get(column);
    }

    public Boolean getBoolean(String column) {
        return (Boolean) this.get(column);
    }

    public File getFile(String column) {
        return (File) this.get(column);
    }

    public Date getDateTime(String column) {
        return (Date) this.get(column);
    }

    public Date getDateTimeByStrColumn(String column, String pattern) {
        Object obj = this.get(column);
        if (obj == null) {
            return null;
        }
        String dateStr = obj.toString();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public <T> T getBean(String column, Class<T> clazz) {
        T bean = JSONObject.parseObject(JSONObject.toJSONString(this.get(column)), clazz);
        return bean;
    }

    public <T> List<T> getList(String column, Class<T> clazz) {
        String json = JSONObject.toJSONString(this.get(column));
        return JSONArray.parseArray(json, clazz);
    }

    public ParamMap getMap(String column) {
        String json = JSONObject.toJSONString(this.get(column));
        return JSONObject.parseObject(json, ParamMap.class);
    }

    public String getDateTimeStrByDateColumn(String column, String pattern) {
        Object obj = this.get(column);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(obj);
    }

    public String[] getColumnNames() {
        Set<String> attrNameSet = this.keySet();
        return attrNameSet.toArray(new String[attrNameSet.size()]);
    }

    public String toJson() {
        return JSONObject.toJSONString(this);
    }

    public String toJson(String dateFmt) {
        return JSONObject.toJSONStringWithDateFormat(this, dateFmt);
    }

    public <T> T toBean(Class<T> clazz) {
        T bean = JSONObject.parseObject(this.toJson(), clazz);
        return bean;
    }

    public <T> T toBean(Class<T> clazz, String dateFmt) {
        T bean = JSONObject.parseObject(this.toJson(dateFmt), clazz);
        return bean;
    }

    public <T> List<T> toList(Class<T> clazz) {
        List<T> list = JSONArray.parseArray(this.toJson(), clazz);
        return list;
    }

    public <T> List<T> toList(Class<T> clazz, String dateFmt) {
        List<T> list = JSONArray.parseArray(this.toJson(dateFmt), clazz);
        return list;
    }

    public static ParamMap toMap(Object bean) {
        ParamMap map = JSONObject.parseObject(JSONObject.toJSONString(bean), ParamMap.class);
        return map;
    }

    public static ParamMap toMap(Object bean, String dateFmt) {
        ParamMap map = JSONObject.parseObject(JSONObject.toJSONStringWithDateFormat(bean, dateFmt), ParamMap.class);
        return map;
    }

    public static ParamMap toMap(String json) {
        ParamMap map = JSONObject.parseObject(json, ParamMap.class);
        return map;
    }

    public static <T> List<ParamMap> toMapList(List<T> list) {
        List<ParamMap> parList = new ArrayList<>();
        for (T t : list) {
            ParamMap map = toMap(t);
            parList.add(map);
        }
        return parList;
    }

    public static <T> List<ParamMap> toMapList(List<T> list, String dateFmt) {
        List<ParamMap> parList = new ArrayList<>();
        for (T t : list) {
            ParamMap map = toMap(t, dateFmt);
            parList.add(map);
        }
        return parList;
    }

    public static <T> List<T> toBeanList(List<ParamMap> list, Class<T> clazz) {
        List<T> beanList = new ArrayList<>();
        for (ParamMap map : list) {
            T bean = map.toBean(clazz);
            beanList.add(bean);
        }
        return beanList;
    }

    public static <T> List<T> toBeanList(List<ParamMap> list, String dateFmt, Class<T> clazz) {
        List<T> beanList = new ArrayList<>();
        for (ParamMap map : list) {
            T bean = map.toBean(clazz, dateFmt);
            beanList.add(bean);
        }
        return beanList;
    }

    public static String toListJson(List<ParamMap> list) {
        String json = JSONArray.toJSONString(list);
        return json;
    }

    public static String toListJson(List<ParamMap> list, String dateFmt) {
        String json = JSONArray.toJSONStringWithDateFormat(list, dateFmt);
        return json;
    }

    public static List<ParamMap> toMapList(String json) {
        List<ParamMap> parList = JSONArray.parseArray(json, ParamMap.class);
        return parList;
    }

    public static ParamMap parseObject(Object obj) {
        String jsonStr = JSONObject.toJSONString(obj);
        return JSONObject.parseObject(jsonStr, ParamMap.class);
    }
}
