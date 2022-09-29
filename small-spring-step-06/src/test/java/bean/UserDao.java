package bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 09 28 22 18
 * @describe：
 **/
public class UserDao {


    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "zts");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
