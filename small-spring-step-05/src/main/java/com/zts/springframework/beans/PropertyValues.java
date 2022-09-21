package com.zts.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 09 43
 * @describe：
 **/
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyvalue(String propertyName) {
        for (PropertyValue pv:this.propertyValueList) {
            if(pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

}
