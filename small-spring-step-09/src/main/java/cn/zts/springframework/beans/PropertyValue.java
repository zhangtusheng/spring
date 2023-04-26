package cn.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 40
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
