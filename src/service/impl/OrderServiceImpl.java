package service.impl;

import dao.OrderMapper;
import domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;

import java.util.Map;
import java.util.UUID;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;

    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public boolean addOrder(String uname, Map<Goods, Integer> gmap) {
//        生成订单
        String oid= UUID.randomUUID().toString().replace("-","");

//        插入订单  订单号+用户+创建的时间
        boolean orderFlag=orderMapper.insertOrder(oid,uname);
        if (!orderFlag){
            return false;
        }

//        插入订单详情


        boolean ooidFlag=false;

//        Map的遍历
        for (Map.Entry<Goods,Integer> good:gmap.entrySet()){
            String ooid="OO"+UUID.randomUUID().toString().replace("-","");
            ooidFlag=orderMapper.insertOrderDetail(ooid,oid,good.getKey().getGid(),good.getValue());
            if (!ooidFlag){
                return false;
            }
        }
        return orderFlag&&ooidFlag;//两张表全部正确才插入
    }
}
