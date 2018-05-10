package dao;

public interface OrderMapper {
//    生成订单 订单号自动生成  哪个用户   什么时间购买
    public boolean insertOrder(String  oid,String uname);

//    哪个订单，哪个商品，数量多少
    public boolean insertOrderDetail(String ooid,String oid,String gid,int num);
}
