package cn.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 40
 * @describe：
 **/
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
