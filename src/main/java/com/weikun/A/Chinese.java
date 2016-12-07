package com.weikun.A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by Administrator on 2016/12/7.
 */
@Component
@Scope("prototype")
public class Chinese implements Person {

    @Autowired
    @Qualifier(value="steelAxe")
    private Axe axe;

//    public Axe getAxe() {
//        return axe;
//    }
//    @Resource(name="stone")
//    public void setAxe(Axe axe) {
//        this.axe = axe;
//    }

    public void useAxe() {
        axe.chop();
    }
}
