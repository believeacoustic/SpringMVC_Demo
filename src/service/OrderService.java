package service;

import domain.Goods;

import java.util.List;
import java.util.Map;

public interface OrderService {

//    添加订单
    public boolean addOrder(String uname, Map<Goods,Integer> gmap);
}
