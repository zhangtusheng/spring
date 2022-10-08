package com.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2022 10 03 14 44
 * @describe：
 **/
public class PropertyValue {

    private final String name;

    private final Object value;

    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}
