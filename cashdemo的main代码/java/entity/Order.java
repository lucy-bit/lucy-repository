package entity;
import commen.OrderStatus;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-17
 * Time: 9:24
 */
@Data
public class Order {
    private String id;
    private Integer account_id;
    private String account_name;
    private String create_time;
    private String finish_time;
    private Integer actual_amount;
    private Integer total_money;
    private OrderStatus order_status;

    public String getOrder_statusDesc() {
        return order_status.getDesc();
    }

    public OrderStatus getOrder_status() {
        return order_status;
    }

    public List<OrderItem> orderItemList = new ArrayList<>();

    //重写get方法   变为单位为元 浏览订单会用到
    public double getTotal_money() {
        return total_money * 1.0 / 100;
    }

    public int getTotalMoneyInt() {
        return total_money;
    }

    //浏览订单会用到
    public double getActual_amount() {
        return actual_amount * 1.0/100;
    }

    public int getActualAmountInt() {
        return actual_amount;
    }


    //优惠
    public double getDiscount() {
        return (this.getTotalMoneyInt() - this.getActualAmountInt())*1.00 / 100;
    }
}
