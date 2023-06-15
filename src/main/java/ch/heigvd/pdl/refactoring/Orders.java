package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private final List<Order> orderList = new ArrayList<Order>();
    
    public void addOrder(Order order) {
        orderList.add(order);

    }

    public int getOrdersCount() {
        return orderList.size();
    }

    public Order getOrder(int i) {
        return orderList.get(i);
    }

}
