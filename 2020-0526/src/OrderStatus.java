package commen;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-17
 * Time: 9:25
 */
@Getter
@ToString

public enum OrderStatus {
    PLAYING(1,"待支付"),OK(2,"支付完成");
    private int flg;//标记
    private String desc;//描述

    OrderStatus(int flg,String desc) {
        this.flg = flg;
        this.desc = desc;
    }

    public static OrderStatus valueOf(int flg) {
        for (OrderStatus orderStatus : values()) {
            if(orderStatus.flg == flg) {
                return orderStatus;
            }
        }
        throw new RuntimeException("orderStatus flg"
                + flg + "not fount!");
    }
}
