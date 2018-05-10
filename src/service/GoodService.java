package service;

import domain.GoodCatory;
import domain.Goods;

import java.util.List;

public interface GoodService {

//    获得所有的商品类别
    public List<GoodCatory> selectCatorys();

//    根据商品的类别号，获得该类别号下面的所有商品
    public List<Goods> selectGoodByCatory(String catory);

    //    根据商品号查询商品的全部信息
    public Goods selectById(String gid);

}
