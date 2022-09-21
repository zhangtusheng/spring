package com.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2022 06 30 21 57
 * @describe：
 **/
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
