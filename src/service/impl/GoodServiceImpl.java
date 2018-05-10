package service.impl;

import dao.GoodMapper;
import domain.GoodCatory;
import domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodService;

import java.util.List;

@Service("goodService")
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;//第一个字母小写，spring扫描包用

    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }

    @Override
    public List<GoodCatory> selectCatorys() {
        return goodMapper.selectCatorys();
    }

    @Override
    public List<Goods> selectGoodByCatory(String catory) {
        return goodMapper.selectGoodByCatory(catory);
    }

    @Override
    public Goods selectById(String gid) {
        return goodMapper.selectById(gid);
    }
}
