package entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-17
 * Time: 9:31
 */
@Data
public class OrderItem {
    private Integer id;
    private String orderId;
    private Integer goodsId;
    private String goodsName;
    private String goodsIntroduce;
    private Integer goodsNum;
    private String goodsUnit;
    private Integer goodsPrice;
    private Integer goodsDiscount;

    public double getGoodsPrice() {
        return goodsPrice * 1.0 / 100;
    }

    public int getGoodsPriceInt() {
        return goodsPrice;
    }
}
