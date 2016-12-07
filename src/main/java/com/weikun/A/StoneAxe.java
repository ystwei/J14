package com.weikun.A;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/7.
 */
@Component("stone")
public class StoneAxe implements Axe {
    public void chop() {
        System.out.println("Ê¯¸«¿³²ñºÃÂý");
    }
}
