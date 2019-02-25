package zut.cs.network.bookshop.service;

import zut.cs.network.bookshop.entity.Goods;
import zut.cs.network.bookshop.entity.PageBean;

/**
商品业务逻辑操作
 */
public interface GoodsService extends BaseService<Goods> {

    /**
     * 分页查询
     */
    PageBean findByPage(Goods goods, int pageCode, int pageSize);
}
