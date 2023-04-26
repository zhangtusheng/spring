package cn.zts.springframework.test.bean;

/**
 * @Author zhangtusheng
 * @Date 2022 10 09 00 29
 * @describe：
 **/
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}