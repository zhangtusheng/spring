package cn.zts.springframework.test.bean;

/**
 * @Author zhangtusheng
 * @Date 2023 02 20 13 02
 * @describe：
 **/
public class Target implements TargetInterface{

    @Override
    public void coreWork() {
        System.out.println("====核心业务方法运行=====");
    }
}
