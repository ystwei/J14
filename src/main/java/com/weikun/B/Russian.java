package com.weikun.B;




import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/7.
 */
@Component
public class Russian implements Person {
    public void say(String msg) {
        System.out.println(1/0);
        System.out.println("����˵��"+msg);
    }

    public String ok() {
        System.out.println("�����ú�˳��");
        return "OK";
    }
}
