package entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-17
 * Time: 9:22
 */
@Data
public class Goods {
    private Integer id;
    private String name;
    private String introduce;
    private Integer stock;
    private String unit;
    private Integer price;//商品价格  12.34  -》 1234
    private Integer discount;

    private Integer buyGoodsNum;

    public double getPrice() {
        return price * 1.0 / 100;
    }
    //这个是返回整数的价格
    public int getPriceInt() {
        return price;
    }



}
